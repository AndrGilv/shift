package com.e.app
import com.google.gson.annotations.SerializedName
import java.util.*

data class ReservationEnity (

    @SerializedName("id") var id : Long,
    //@SerializedName("category") var category : String,
    @SerializedName("service") var service : String,
    @SerializedName("date") var dateTime : DateTimeEntity,
    @SerializedName("student_document") var studentDoc : Long
)

data class Result (val total_count: Int, val incomplete_results: Boolean, val items: List<ReservationEnity>)


