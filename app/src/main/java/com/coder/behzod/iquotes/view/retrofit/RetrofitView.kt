package com.coder.behzod.iquotes.view.retrofit

import com.coder.behzod.quotesapp.model.model.QuotesItem

interface RetrofitView {
    fun setViews(quotes:ArrayList<QuotesItem>?)
    fun setView(quote:QuotesItem?)
}