package com.Parakram.AndroidAssignment.response


import com.Parakram.AndroidAssignment.entity.User

data class LoginResponse(
    val success :Boolean? = null,
    val token : String? = null,
    val data: User? = null
)
