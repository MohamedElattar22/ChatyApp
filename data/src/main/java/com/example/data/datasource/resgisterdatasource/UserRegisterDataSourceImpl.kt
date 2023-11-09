package com.example.data.datasource.resgisterdatasource

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class UserRegisterDataSourceImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
) :
    UserRegisterDataSource {
    override suspend fun registerUser(email: String, password: String): AuthResult? {
        val result = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
        return result?:null
    }
}