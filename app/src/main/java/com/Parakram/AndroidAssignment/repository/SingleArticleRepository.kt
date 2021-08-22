package com.Parakram.AndroidAssignment.repository

import com.Parakram.AndroidAssignment.api.MyApiRequest
import com.Parakram.AndroidAssignment.api.ServiceBuilder
import com.Parakram.AndroidAssignment.api.SingleArticleAPI

import com.Parakram.AndroidAssignment.response.ArticleResponse


class SingleArticleRepository: MyApiRequest() {
    private val singleArticleAPI = ServiceBuilder.buildService(SingleArticleAPI::class.java)

    //Display Single Article
    suspend fun getSingleArticle(id:String): ArticleResponse {
        return apiRequest {
            singleArticleAPI.showSingleArticle(id)
        }
    }
}