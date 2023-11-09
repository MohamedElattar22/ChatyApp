package com.example.data.repository

import com.example.data.datasource.resgisterdatasource.UserRegisterDataSource
import com.example.domain.repository.UserRegisterRepository
import com.google.firebase.auth.AuthResult
import javax.inject.Inject

class UserRegisterRepositoryImpl @Inject constructor(private val userRegisterDataSource: UserRegisterDataSource) :
    UserRegisterRepository {
    override suspend fun registerUser(email: String, password: String): AuthResult? {
        val result = userRegisterDataSource.registerUser(email, password)
        return result
    }
}