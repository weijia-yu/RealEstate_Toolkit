package com.weijia.mortgageCalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import com.weijia.mortgageCalculator.databinding.FragmentPaymentBinding

class MonthPaymentFragment : Fragment() {

    private lateinit var binding: FragmentPaymentBinding

    private lateinit var vm: MonthPaymentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_payment, container, false)

        binding = FragmentPaymentBinding.bind(view)
        binding.setLifecycleOwner(this)

        vm = MainActivity.getViewModel(activity as FragmentActivity)
        binding.vm = vm

        vm.homePrice.observe(viewLifecycleOwner, Observer { price -> vm.refreshHomePrice() })

        return binding.root
    }
}


