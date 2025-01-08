package com.mrbee.starterproject.viewModel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mrbee.starterproject.R
import com.mrbee.starterproject.databinding.ActivityViewModelTestBinding

class VmTestActivity: AppCompatActivity() {
  private lateinit var binding: ActivityViewModelTestBinding
  private lateinit var viewModel: VmActivityTwoViewModel
  private lateinit var viewModelFactory: VmActivityViewModelFactory

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_test)
        viewModelFactory = VmActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(VmActivityTwoViewModel::class.java)

        binding.countTextView.text = viewModel.getTotal().toString()

        binding.addButton.setOnClickListener {
            viewModel.setTotal(binding.countEditText.text.toString().toInt())
            binding.countTextView.text = viewModel.getTotal().toString()
        }
    }
}