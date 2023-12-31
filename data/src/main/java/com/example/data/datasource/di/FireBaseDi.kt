package com.example.data.datasource.di


import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object FireBaseDi {
    @Provides
    fun provideFireBaseAuthInstance():FirebaseAuth{
       return FirebaseAuth.getInstance()
    }
}