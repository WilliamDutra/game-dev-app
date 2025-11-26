package com.br.gamedatabase.data.network

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val url = request.url

        val newUrl = url.newBuilder()
            .addQueryParameter("key", "e5daa93858cb4966a05f26bf38eab1a9")
            .build()

        val newRequest = request.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(newRequest)
    }


}