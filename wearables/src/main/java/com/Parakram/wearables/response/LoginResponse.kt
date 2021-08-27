package com.Parakram.wearables.response

import com.Parakram.wearables.entity.User

data class LoginResponse(
    val success :Boolean? = null,
    val token : String? = null,
    val data: MutableList<User>? = null
)
