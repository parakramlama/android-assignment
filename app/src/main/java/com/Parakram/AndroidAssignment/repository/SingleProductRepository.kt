package com.Parakram.AndroidAssignment.repository

import com.Parakram.AndroidAssignment.api.MyApiRequest
import com.Parakram.AndroidAssignment.api.ServiceBuilder
import com.Parakram.AndroidAssignment.api.SingleProductAPI
import com.Parakram.AndroidAssignment.response.ProductResponse

class SingleProductRepository: MyApiRequest() {
    private val singleProductAPI = ServiceBuilder.buildService(SingleProductAPI::class.java)

    //Display Single Product
    suspend fun getSingleProduct(id:String):ProductResponse{
        return apiRequest {
            singleProductAPI.showSingleProduct(id)
        }
    }
}