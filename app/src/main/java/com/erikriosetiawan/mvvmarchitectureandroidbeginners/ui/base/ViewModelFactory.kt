package com.erikriosetiawan.mvvmarchitectureandroidbeginners.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.api.ApiHelper
import com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.repository.MainRepository
import com.erikriosetiawan.mvvmarchitectureandroidbeginners.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}