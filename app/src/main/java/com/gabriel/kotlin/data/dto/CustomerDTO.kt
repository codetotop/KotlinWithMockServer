package com.gabriel.kotlin.data.dto

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class CustomerDTO(
    @Expose
    @SerializedName("mId")
    var mId: Int,
    @Expose
    @SerializedName("mName")
    val mName: String,
    @Expose
    @SerializedName("age")
    val mAge: String,
    @Expose
    @SerializedName("company")
    val mCompany: String
)