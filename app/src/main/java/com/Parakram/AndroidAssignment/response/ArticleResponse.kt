package com.Parakram.AndroidAssignment.response

import com.Parakram.AndroidAssignment.entity.Article

data class ArticleResponse(
        val success : Boolean? = null,
        val data: MutableList<Article>? = null
)
