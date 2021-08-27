package com.Parakram.wearables.repository

import com.Parakram.wearables.api.MyApiRequest
import com.Parakram.wearables.api.ServiceBuilder
import com.Parakram.wearables.api.UserAPI
import com.Parakram.wearables.entity.User
import com.Parakram.wearables.response.LoginResponse

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


}