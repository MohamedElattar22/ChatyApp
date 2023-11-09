package com.example.data.datasource.resgisterdatasource.di

import com.example.data.datasource.resgisterdatasource.UserRegisterDataSource
import com.example.data.datasource.resgisterdatasource.UserRegisterDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RegisterDataSourceDi {
    @Binds
    abstract fun provideRegisterDataSource( userRegisterDataSourceImpl: UserRegisterDataSourceImpl) : UserRegisterDataSource
}