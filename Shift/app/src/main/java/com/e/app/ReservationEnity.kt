package com.e.app
import com.google.gson.annotations.SerializedName
import java.util.*

data class ReservationEnity (


    @SerializedName("service") var service : String,
    @SerializedName("date") var dateTime : DateTimeEntity,
    @SerializedName("student_document") var studentDoc : Long
)




