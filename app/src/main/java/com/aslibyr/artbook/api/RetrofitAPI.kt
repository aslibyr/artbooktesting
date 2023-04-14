package com.aslibyr.artbook.api

import com.aslibyr.artbook.Util.Util.API_KEY
import com.aslibyr.artbook.model.ImageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String? = API_KEY
    ): retrofit2.Response<ImageResponse>
}