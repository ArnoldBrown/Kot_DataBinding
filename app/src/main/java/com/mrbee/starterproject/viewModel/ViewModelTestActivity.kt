package com.mrbee.starterproject.viewModel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mrbee.starterproject.R
import com.mrbee.starterproject.databinding.ActivityViewModelTestBinding

class ViewModelTestActivity: AppCompatActivity() {
  private lateinit var binding: ActivityViewModelTestBinding
  private lateinit var viewModel: VmActivityViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_test)
        viewModel = ViewModelProvider(this).get(VmActivityViewModel::class.java)

        binding.countTextView.text = viewModel.getTotal().toString()

        binding.addButton.setOnClickListener {
            viewModel.setTotal(binding.countEditText.text.toString().toInt())
            binding.countTextView.text = viewModel.getTotal().toString()
        }
    }
}