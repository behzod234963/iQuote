package com.coder.behzod.iquotes.view.retrofit

import com.coder.behzod.quotesapp.model.model.QuotesItem
import javax.inject.Inject

class RetrofitViewImpl @Inject constructor():RetrofitView {
    override fun setViews(quotes: ArrayList<QuotesItem>?) {
        quotes?.clear()
        quotes?.addAll(quotes)
    }

    override fun setView(quote: QuotesItem?) {

    }
}