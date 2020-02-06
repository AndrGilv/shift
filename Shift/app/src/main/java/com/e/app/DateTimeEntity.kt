package com.e.app
import com.google.gson.annotations.SerializedName
import java.util.*

data class DateTimeEntity(
    @SerializedName("id") var id : Long,
    @SerializedName("category") var date : Long,
    @SerializedName("category") var time : String
)

data class DateResult (val total_count: Int, val incomplete_results: Boolean, val items: List<DateTimeEntity>)