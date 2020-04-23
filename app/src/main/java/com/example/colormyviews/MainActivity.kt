package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews:List<View> =
        listOf(textViewBox1,textViewBox2,textViewBox3,textViewBox4,textViewBox5,constantL)
        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }


    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.textViewBox1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textViewBox2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textViewBox3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textViewBox4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textViewBox5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }


    }



}
