package com.weijia.mortgageCalculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MonthPaymentViewModel : ViewModel() {
    private var _homePrice = MutableLiveData<String>()

    var homePrice: MutableLiveData<String>
        get() = _homePrice
        set(value) {
            _homePrice.value = value.value
        }

    private val _barVal = MutableLiveData<Int>()

    val barVal: LiveData<Int>
        get() = _barVal

    fun refreshHomePrice() {
        _barVal.value = 50
    }
}