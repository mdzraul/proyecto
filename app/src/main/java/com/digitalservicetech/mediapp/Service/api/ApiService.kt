package com.ankit.trendinggit.model.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/ws_med_cat_alergias.aspx")
    fun postAlergias (@Body RequestBody:String):Call<ResponseBody>

    @POST("/ws_med_cat_padecimientos.aspx")
    fun postPadecimientos (@Body RequestBody:String):Call<ResponseBody>

}