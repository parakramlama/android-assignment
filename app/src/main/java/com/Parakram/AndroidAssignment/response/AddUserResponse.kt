package com.Parakram.AndroidAssignment.response

import com.Parakram.AndroidAssignment.entity.User

data class AddUserResponse(
    val success: Boolean?=null,
    val data : User?= null
)
