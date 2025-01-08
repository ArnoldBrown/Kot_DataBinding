package com.mrbee.starterproject.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VmActivityViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VmActivityTwoViewModel::class.java)){
            return VmActivityTwoViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown VIew Model Class")
    }
}
