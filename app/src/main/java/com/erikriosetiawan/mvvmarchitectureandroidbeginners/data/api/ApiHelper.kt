package com.erikriosetiawan.mvvmarchitectureandroidbeginners.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()
}