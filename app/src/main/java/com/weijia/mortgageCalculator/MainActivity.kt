package com.weijia.mortgageCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.content_frame, MonthPaymentFragment()).commit()
    }



    companion object {
        fun getViewModel(activity: FragmentActivity): MonthPaymentViewModel {
            return ViewModelProviders.of(activity).get(MonthPaymentViewModel::class.java)
        }
    }
}
