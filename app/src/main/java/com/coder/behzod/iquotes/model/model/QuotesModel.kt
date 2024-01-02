package com.coder.behzod.quotesapp.model.model

import com.google.gson.annotations.SerializedName

data class QuotesModel(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("limit")
	val limit: Int? = null,

	@field:SerializedName("skip")
	val skip: Int? = null,

	@field:SerializedName("quotes")
	val quotes: List<QuotesItem?>? = null
)

data class QuotesItem(

	@field:SerializedName("quote")
	val quote: String? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
