package com.capstone.guideme.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(

    @field:SerializedName("fullname")
    val fullname: String,

    @field:SerializedName("userid")
    val userid: String,

    @field:SerializedName("email")
    val email: String,

    @field:SerializedName("token")
    val token: String,

    @field:SerializedName("username")
    val username: String,

    @field:SerializedName("isLogin")
    val isLogin: Boolean
) : Parcelable