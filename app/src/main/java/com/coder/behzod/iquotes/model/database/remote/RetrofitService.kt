package com.coder.behzod.quotesapp.model.database.remote

import com.coder.behzod.quotesapp.model.model.QuotesItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitService {

    @GET("/quotes")
    fun getAllQuotes(@Query("limit")limit :String = "100"):Call<ArrayList<QuotesItem>>

    @GET("/quotes/{id}")
    fun getQuoteById(@Path("id")id:Int):Call<QuotesItem>
}