package com.Parakram.AndroidAssignment
import com.Parakram.AndroidAssignment.api.ServiceBuilder
import com.Parakram.AndroidAssignment.entity.User
import com.Parakram.AndroidAssignment.repository.CartRepository
import com.Parakram.AndroidAssignment.repository.UserRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class UnitTesting {
    private lateinit var userRepository: UserRepository
    private lateinit var postRepository: CartRepository

    @Test
    fun checkSignup() = runBlocking {
        val user = User(user_contactno = "987666",user_email = "parakram@gmail.com",user_username = "parakram",user_password = "parakram")
        userRepository = UserRepository()
        val response = userRepository.registerUser(user)
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun checkLogin() = runBlocking {
        userRepository = UserRepository()
        val response = userRepository.checkUser("parakram@gmail.com", "parakram")
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun deleteCart() = runBlocking {
        postRepository = CartRepository()
        userRepository = UserRepository()
        ServiceBuilder.token ="Bearer " + userRepository.checkUser("parakram@gmail.com","parakram").token
        val response = postRepository.deleteCart("607b1ce69261d9202481e83b",ServiceBuilder.token!!)
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

}