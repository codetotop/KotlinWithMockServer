package com.gabriel.kotlin.data.dto

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class CustomerDTO(
    @Expose
    @SerializedName("id")
    var mId: Int,
    @Expose
    @SerializedName("name")
    val mName: String,
    @Expose
    @SerializedName("age")
    val mAge: String,
    @Expose
    @SerializedName("company")
    val mCompany: String

)