package com.example.core.network.data.models

import com.google.gson.annotations.SerializedName

data class ErrorResponse(
//    @SerializedName("errors")
//    val errors: List<Any>?,
//    @SerializedName("message")
//    val message: String?,
//    @SerializedName("status")
//    val status: String?,
    @SerializedName("Database Error")
    val conflicting: String
)
