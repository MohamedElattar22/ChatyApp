package com.example.domain.usecases

import com.example.domain.repository.UserRegisterRepository
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class UserRegisterUseCase @Inject constructor(private val userRegisterRepository: UserRegisterRepository) {
    suspend fun invoke(email: String, password: String): AuthResult? {
        try {
            val result = userRegisterRepository.registerUser(email, password)
            return result
        } catch (e: Exception) {
            return null
        }
    }
}