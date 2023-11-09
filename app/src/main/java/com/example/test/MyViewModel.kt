package com.example.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.UserRegisterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val useCase: UserRegisterUseCase):ViewModel() {

    val emailLiveData = MutableLiveData<String>()
    val passwordLiveData = MutableLiveData<String>()
    val toast = MutableLiveData<String>()
    fun register()
    {
        viewModelScope.launch {
             val result = useCase.invoke(emailLiveData.value!!,passwordLiveData.value!!)
            if (result==null)
            {
                toast.postValue("InValid")
                return@launch
            }
            toast.postValue("${result.user?.email}")
        }
    }
}