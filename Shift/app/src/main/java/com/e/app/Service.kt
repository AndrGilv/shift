package com.e.app

import retrofit2.Call
import retrofit2.http.*

interface Service {



    @GET("gym")
    fun getServices(): Call<List<Services>>

    @GET("services/gym/{date}")
    fun getReservation(@Path("date") date: Long): Call<List<ReservationEnity>>
/*
    @GET("users/{id}")
    fun getUser(@Path("id") id: Int): Call<Unit>

    @POST("users")
    @FormUrlEncoded
    fun createUser(@Body user: Unit): Call<Unit>

    @DELETE("users/{id}")
    fun deleteUser(@Path("id") id: Int): Call<Unit>
*/

}