package com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.api

import com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>
}