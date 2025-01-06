package com.mrbee.starterproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mrbee.starterproject.dataBind.DataBindActivity
import com.mrbee.starterproject.dataBind.DataClassBindActivity
import com.mrbee.starterproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            dataBinding.setOnClickListener {
                val intent = Intent(this@MainActivity, DataBindActivity::class.java)
                startActivity(intent)
            }
            dataClassBind.setOnClickListener {
                val intent2 = Intent(this@MainActivity, DataClassBindActivity::class.java)
                startActivity(intent2)
            }
        }
    }

}