package com.Parakram.wearables.entity

import androidx.room.Entity


@Entity
data class User(
    val _id : String? = null,
    var user_username : String? =null,
    var user_email : String? =null,
    var user_contactno : String? = null,
    var user_password : String? =null
)

