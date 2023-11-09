package com.example.data.repository.di

import com.example.data.datasource.resgisterdatasource.UserRegisterDataSource
import com.example.data.datasource.resgisterdatasource.UserRegisterDataSourceImpl
import com.example.data.repository.UserRegisterRepositoryImpl
import com.example.domain.repository.UserRegisterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RegisterRepoDi {
    @Binds
    abstract fun provideRegisterRepo( userRegisterRepositoryImpl: UserRegisterRepositoryImpl ) :UserRegisterRepository
}