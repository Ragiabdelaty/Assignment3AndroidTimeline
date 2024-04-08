package com.example.timelineassignment3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(var arra: MutableList<profile>) : RecyclerView.Adapter<customAdapter.VH>() {


    class VH(p: View) : RecyclerView.ViewHolder(p) {

        var accountpicture = p.findViewById<ImageView>(R.id.pic_account)

        var accountname = p.findViewById<TextView>(R.id.accountName)

        var postcontent = p.findViewById<TextView>(R.id.postcontentText)

        var contentimg = p.findViewById<ImageView>(R.id.contentpostimg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var myview =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_post, parent, false)
        return VH(myview)
    }

    override fun getItemCount(): Int = arra.size

    override fun onBindViewHolder(holder: VH, position: Int) {

        var element = arra.get(position)

        holder.accountpicture.setImageResource(element.user.img)

        holder.accountname.text = element.user.name

        holder.postcontent.text = element.comtentText

        holder.contentimg.setImageResource(element.contentimg)

    }
}