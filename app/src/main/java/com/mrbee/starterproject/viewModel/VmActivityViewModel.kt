package com.mrbee.starterproject.viewModel

import androidx.lifecycle.ViewModel

class VmActivityViewModel: ViewModel() {
    private var count = 0
    private var total = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total +=  input
    }
}