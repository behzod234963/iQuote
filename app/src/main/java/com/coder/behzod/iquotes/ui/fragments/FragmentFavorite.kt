package com.coder.behzod.iquotes.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.coder.behzod.iquotes.databinding.FragmentFavoriteBinding

class FragmentFavorite:Fragment() {

    lateinit var binding:FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoriteBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}