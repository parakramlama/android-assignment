package com.Parakram.AndroidAssignment.repository

import com.Parakram.AndroidAssignment.api.MyApiRequest
import com.Parakram.AndroidAssignment.api.ServiceBuilder
import com.Parakram.AndroidAssignment.api.UserAPI
import com.Parakram.AndroidAssignment.entity.User
import com.Parakram.AndroidAssignment.response.LoginResponse

class UserRepository : MyApiRequest() {
    private val userAPI = ServiceBuilder.buildService(UserAPI::class.java)

    suspend fun registerUser(user: User): LoginResponse {
        return apiRequest {
            userAPI.registerUser(user)
        }
    }

    suspend fun checkUser(user_email: String, user_password: String):LoginResponse{
        return apiRequest {
            userAPI.checkUser(user_email, user_password)
        }
    }

    //Retrieve User
    suspend fun userDetails(token:String,userToken:String): LoginResponse {
        return apiRequest {
            userAPI.retrieveUser(ServiceBuilder.token!!,userToken)
        }
    }

}