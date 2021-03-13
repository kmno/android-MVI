package com.kamran.app.mvi.data.api

import com.kamran.app.mvi.data.model.User

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:54.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:54.
 */
class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}