package com.e.app
import com.google.gson.annotations.SerializedName
import java.util.*

data class DateTimeEntity(


    @SerializedName("time") var time : String
)

data class DateResult (val total_count: Int, val incomplete_results: Boolean, val items: List<DateTimeEntity>)