package com.Parakram.AndroidAssignment.response


import com.Parakram.AndroidAssignment.entity.Product

data class ProductResponse(
        val success : Boolean? = null,
        val data: MutableList<Product>? = null
)
