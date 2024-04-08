package com.example.timelineassignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timelineassignment3.databinding.MyactivityBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale


class mymain : AppCompatActivity() {

    lateinit var binding: MyactivityBinding

    lateinit var recycleAdapter: customAdapter

    var array = mutableListOf<profile>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MyactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fullthelist()

        preparRcycleview()


    }

    private fun preparRcycleview() {
        recycleAdapter=customAdapter(array)
        binding.recycleV.adapter=recycleAdapter
    }

    private fun fullthelist() {
        for (o in 1..10) {
            array.add(
                profile(
                    user_information("The_child", R.drawable.child),getdate() ,
                    "happy",
                    R.drawable.happy
                )
            )

            array.add(
                profile(
                    user_information("The_person", R.drawable.ic_person),getdate(),
                    "excited",
                    R.drawable.excited
                )
            )

            array.add(
                profile(
                    user_information("The_man", R.drawable.man),getdate(),
                    "heart",
                    R.drawable.heart
                )
            )
        }


    }

    /// get date

    fun getdate(): String {

        val date = Calendar.getInstance().time

        return date.ggg("YYYY-MM-dd hh:mm a")

    }

//// extension fun
    fun Date.ggg(format: String, locale: Locale = Locale.getDefault()): String {
        var form = SimpleDateFormat(format, locale)
        return form.format(this)

    }
}