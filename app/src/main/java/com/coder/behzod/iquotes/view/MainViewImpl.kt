package com.coder.behzod.iquotes.view

import android.view.View
import android.widget.TextView
import com.coder.behzod.iquotes.R
import com.coder.behzod.quotesapp.model.model.QuotesItem
import javax.inject.Inject


class MainViewImpl @Inject constructor():MainView {
    override fun showView(view: View) {
        view.visibility = View.VISIBLE
    }

    override fun hideView(view: View) {
        view.visibility = View.GONE
    }

    override fun setView(body: QuotesItem,view: View) {
        val quote:TextView = view.findViewById(R.id.tvSplashQuote)
        val author:TextView = view.findViewById(R.id.tvSplashAuthor)
        quote.text = body.quote
        author.text = body.author
    }
}