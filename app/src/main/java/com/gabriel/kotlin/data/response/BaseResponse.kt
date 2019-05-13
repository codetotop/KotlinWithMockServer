package com.gabriel.kotlin.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BaseResponse<T>(

    @Expose
    @SerializedName("code")
    var mCode: Int,
    @Expose
    @SerializedName("message")
    val mMessage: String,
    @Expose
    @SerializedName("data")
    var mData: T
)
