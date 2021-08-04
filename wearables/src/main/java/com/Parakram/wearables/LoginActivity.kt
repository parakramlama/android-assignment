package com.Parakram.wearables

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import android.widget.EditText

class LoginActivity : WearableActivity() {

    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button
    companion object {
        var useremail = "";
        var username = "";
        var contact = "";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etEmail = findViewById(R.id.etemail)
        etPassword = findViewById(R.id.etpassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            login()

        }


        // Enables Always-on
        setAmbientEnabled()
    }
    private fun login() {
        startActivity(
            Intent(
                this@LoginActivity,
                DashActivity::class.java
            )
        )
    }
}