package com.example.domain.repository

import com.google.firebase.auth.AuthResult

interface UserRegisterRepository {
    suspend fun registerUser(email: String, password: String): AuthResult?
}