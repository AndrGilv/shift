package com.e.app

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {

    companion object {
        private val retrofit =
            Retrofit.Builder()
                .baseUrl("https://51.83.145.18:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service = retrofit.create(Service::class.java)
    }

    override fun onCreate() {
        super.onCreate()

    }



}