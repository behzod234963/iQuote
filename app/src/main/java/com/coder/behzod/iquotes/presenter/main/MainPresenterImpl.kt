package com.coder.behzod.quotesapp.presenter.main

import com.coder.behzod.iquotes.view.retrofit.RetrofitView
import com.coder.behzod.quotesapp.model.database.remote.RetrofitService
import com.coder.behzod.quotesapp.model.model.QuotesItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(private val service: RetrofitService,
    private val view: RetrofitView
):MainPresenter{

    override fun getAll() {
        service.getAllQuotes("100").enqueue(object :Callback<ArrayList<QuotesItem>>{
            override fun onResponse(
                call: Call<ArrayList<QuotesItem>>,
                response: Response<ArrayList<QuotesItem>>
            ) {
                if(response.isSuccessful){
                    view.setViews(response.body())
                }
            }

            override fun onFailure(call: Call<ArrayList<QuotesItem>>, t: Throwable) {

            }
        })
    }

    override fun getById(id: Int) {
        service.getQuoteById(id).enqueue(object :Callback<QuotesItem>{
            override fun onResponse(call: Call<QuotesItem>, response: Response<QuotesItem>) {
                if (response.isSuccessful){
                    view.setView(response.body()!!)
                }
            }
            override fun onFailure(call: Call<QuotesItem>, t: Throwable) {

            }
        })
    }

}