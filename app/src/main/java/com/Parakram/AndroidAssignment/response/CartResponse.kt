package com.Parakram.AndroidAssignment.response

import com.Parakram.AndroidAssignment.entity.Cart

data class CartResponse (
    val success: Boolean? = null,
    val data: MutableList<Cart>? = null
)