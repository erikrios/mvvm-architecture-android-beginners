package com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.repository

import com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.api.ApiHelper
import com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}