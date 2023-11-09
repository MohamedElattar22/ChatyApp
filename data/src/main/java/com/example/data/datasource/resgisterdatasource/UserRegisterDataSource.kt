package com.example.data.datasource.resgisterdatasource

import com.google.firebase.auth.AuthResult

interface UserRegisterDataSource {
    suspend fun registerUser(email: String, password: String): AuthResult?
}