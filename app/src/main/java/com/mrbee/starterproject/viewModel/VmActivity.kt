package com.mrbee.starterproject.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mrbee.starterproject.R
import com.mrbee.starterproject.databinding.ActivityViewModelBinding

class VmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewModelBinding
    private lateinit var viewModel: VmActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model)
        viewModel = ViewModelProvider(this).get(VmActivityViewModel::class.java)

        binding.countTextView.text = viewModel.getCurrentCount().toString()
        binding.clickButton.setOnClickListener {
            binding.countTextView.text = viewModel.getUpdatedCount().toString()
        }

    }

}