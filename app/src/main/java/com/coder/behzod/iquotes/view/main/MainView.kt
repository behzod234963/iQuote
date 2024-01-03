package com.coder.behzod.iquotes.view.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.coder.behzod.quotesapp.model.model.QuotesItem

interface MainView {
    fun navigator(fragmentManager: FragmentManager,fragment: Fragment
                  ,bundle:Bundle?=null)
    fun showView(view:View)
    fun hideView(view:View)
}