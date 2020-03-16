package com.digitalservicetech.mediapp.Service

import com.ankit.trendinggit.model.api.ApiClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepoRepository {

    fun postGetPedecimiento(params:String,onResult: (isSuccess: Boolean, response: ResponseBody?) -> Unit) {
        ApiClient.instance.postPadecimientos(params).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                if (response != null && response.isSuccessful)
                    onResult(true, response.body()!!)
                else
                    onResult(false, null)
            }
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                onResult(false, null)
            }
        })
    }

    fun postGetAlergias(params:String,onResult: (isSuccess: Boolean, response: ResponseBody?) -> Unit) {
        ApiClient.instance.postAlergias(params).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                if (response != null && response.isSuccessful)
                    onResult(true, response.body()!!)
                else
                    onResult(false, null)
            }
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                onResult(false, null)
            }
        })
    }

    companion object {
        private var INSTANCE: RepoRepository? = null
        fun getInstance() = INSTANCE
                ?: RepoRepository().also {
                    INSTANCE = it
                }
    }
}