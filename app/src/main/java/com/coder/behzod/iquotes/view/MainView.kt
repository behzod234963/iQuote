package com.coder.behzod.iquotes.view

import android.view.View
import com.coder.behzod.quotesapp.model.model.QuotesItem

interface MainView {

    fun showView(view:View)
    fun hideView(view:View)
    fun setView(body:QuotesItem,view: View)
}