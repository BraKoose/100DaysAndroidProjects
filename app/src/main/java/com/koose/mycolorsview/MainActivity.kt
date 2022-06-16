package com.koose.mycolorsview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

    }


    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val tooglebar = findViewById<TextView>(R.id.toggleButton)
        val tooglebar2 = findViewById<TextView>(R.id.toggleButton2)
        val tooglebar3 = findViewById<TextView>(R.id.toggleButton3)
        val tooglebar4 = findViewById<TextView>(R.id.toggleButton4)
        val tooglebar5 = findViewById<TextView>(R.id.toggleButton5)
        val tooglebar6 = findViewById<TextView>(R.id.toggleButton6)
        val tooglebar7 = findViewById<TextView>(R.id.toggleButton7)
        val tooglebar8 = findViewById<TextView>(R.id.toggleButton8)
        val tooglebar9 = findViewById<TextView>(R.id.toggleButton9)
        val tooglebar10 = findViewById<TextView>(R.id.toggleButton10)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                tooglebar, tooglebar2, tooglebar3,tooglebar4, tooglebar5, tooglebar6, tooglebar7,
                tooglebar8,tooglebar9, tooglebar10)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.toggleButton -> view.setBackgroundColor(Color.YELLOW)
            R.id.toggleButton2 -> view.setBackgroundColor(Color.BLACK)
            R.id.toggleButton3 -> view.setBackgroundColor(Color.GREEN)
            R.id.toggleButton4 -> view.setBackgroundColor(Color.CYAN)
            R.id.toggleButton5 -> view.setBackgroundColor(Color.BLUE)
            R.id.toggleButton6 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.toggleButton7 -> view.setBackgroundColor(Color.GREEN)
            R.id.toggleButton8 -> view.setBackgroundColor(Color.GRAY)
            R.id.toggleButton9 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.toggleButton10 -> view.setBackgroundColor(Color.BLACK)
            //
            else -> view.setBackgroundColor(Color.LTGRAY)


        }

    }


}