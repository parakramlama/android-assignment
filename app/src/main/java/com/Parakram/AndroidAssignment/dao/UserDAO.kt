package com.Parakram.AndroidAssignment.dao
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.Parakram.AndroidAssignment.entity.User
@Dao
interface UserDAO {
    @Insert
    suspend fun registerUser(user: User)

    @Query("select * from User where user_email=(:email) and user_password=(:password)")
    suspend fun checkUser(email: String, password: String): User
}