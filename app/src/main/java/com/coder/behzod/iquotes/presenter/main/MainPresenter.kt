package com.coder.behzod.quotesapp.presenter.main

import com.coder.behzod.quotesapp.model.model.QuotesItem

interface MainPresenter {
    fun getAll(quotes:ArrayList<QuotesItem>)
    fun getById(id:Int)
}