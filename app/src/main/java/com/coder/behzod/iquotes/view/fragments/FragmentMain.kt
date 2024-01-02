package com.coder.behzod.iquotes.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.coder.behzod.iquotes.R
import com.coder.behzod.iquotes.databinding.FragmentMainBinding
import com.coder.behzod.iquotes.databinding.FragmentSplashBinding

class FragmentMain: Fragment() {

    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}