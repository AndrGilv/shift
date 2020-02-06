package com.e.app

import retrofit2.Call
import retrofit2.http.*

interface Service {

    @GET()
    fun getJimReservations(): Call<List<ReservationEnity>>

    @GET("gim")
    fun getServices(): Call<List<Services>>
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