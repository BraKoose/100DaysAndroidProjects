package com.koose.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.koose.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Data Binding Var
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Godfred", "Koose")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener{
            addNickName(it)
        }
      /*binding.nicknameText.setOnClickListener {
            updateNickName(it)
        }*/
    }



    private fun clickHandlerFunction(view: View) {

    }

    private fun addNickName(view: View){
        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()

            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }
        // Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)

    }

   /* private fun updateNickName(view: View){
        binding.nicknameEdit.text = binding.doneButton
        binding.doneButton

         = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE

        editText.requestFocus()

        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }*/
}