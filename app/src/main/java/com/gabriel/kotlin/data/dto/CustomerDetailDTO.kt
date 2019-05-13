package com.gabriel.kotlin.data.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CustomerDetailDTO(

    @Expose
    @SerializedName("mId")
    var mId: Int,
    @Expose
    @SerializedName("phone")
    val mPhone: String,
    @Expose
    @SerializedName("mEmail")
    val mEmail: String
)