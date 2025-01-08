package com.mrbee.starterproject.viewModel

import androidx.lifecycle.ViewModel

class VmActivityTwoViewModel(startingTotal : Int): ViewModel() {
    private var total = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total +=  input
    }
}