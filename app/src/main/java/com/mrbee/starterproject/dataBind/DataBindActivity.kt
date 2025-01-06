package com.mrbee.starterproject.dataBind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.mrbee.starterproject.R
import com.mrbee.starterproject.databinding.ActivityDataBindBinding

class DataBindActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_bind)

        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
        binding.progressButton.setOnClickListener {
            startOrStopProgress()
        }
    }

    private fun displayGreeting() {
//        val messageView = findViewById<TextView>(R.id.greeting_text_view)
//        val nameText = findViewById<EditText>(R.id.name_edit_text)
        binding.apply {
            greetingTextView.text = "Hello! "+ nameEditText.text
        }
    }

    private fun startOrStopProgress() {
        binding.apply {
            if(progressBar.isVisible){
                progressBar.visibility = View.INVISIBLE
                progressButton.text = "Start"
            }else{
                progressBar.visibility = View.VISIBLE
                progressButton.text = "Stop"
            }
        }
    }
}