package com.e.app

import com.google.gson.annotations.SerializedName
import java.util.*

data class Services(

    @SerializedName("eng") var eng : String,
    @SerializedName("rus") var rus : String
    )

