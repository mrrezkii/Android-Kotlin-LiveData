package com.newbiexpert.android_kotlin_learnlivedata

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var total: Int = 0

    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total += input
    }
}