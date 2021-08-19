package com.Parakram.AndroidAssignment.repository

import android.util.Log
import com.Parakram.AndroidAssignment.api.ArticleAPI
import com.Parakram.AndroidAssignment.api.MyApiRequest
import com.Parakram.AndroidAssignment.api.ServiceBuilder
import com.Parakram.AndroidAssignment.dao.ArticleDAO
import com.Parakram.AndroidAssignment.entity.Article


class ArticleRepository  (private val articleDao: ArticleDAO): MyApiRequest() {
    private val articleAPI = ServiceBuilder.buildService(ArticleAPI::class.java)
//    suspend fun getAllArticles(): ArticleResponse {
//        return apiRequest {
//            articleAPI.getAllArticles()
//        }
//    }

    suspend fun displayAllArticles() : MutableList<Article>?{
        try {
            val response = apiRequest{articleAPI.getAllArticles()}
            saveInRoom(response.data!!)
            return articleDao.getAllArticles()
        }
        catch(ex:Exception){
            Log.d("repo",ex.toString())
        }
        return articleDao.getAllArticles()
    }

    private suspend fun saveInRoom(articles: MutableList<Article>){
        for (article in articles){
            articleDao.insertArticle(article)
        }
    }
}