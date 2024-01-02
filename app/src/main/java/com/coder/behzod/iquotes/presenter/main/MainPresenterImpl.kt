package com.coder.behzod.quotesapp.presenter.main

import com.coder.behzod.quotesapp.model.database.remote.RetrofitService
import com.coder.behzod.quotesapp.model.model.QuotesItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private val service: RetrofitService
):MainPresenter{

    override fun getAll(quotes: ArrayList<QuotesItem>) {
        
    }

    override fun getById(id: Int) {
        TODO("Not yet implemented")
    }

}