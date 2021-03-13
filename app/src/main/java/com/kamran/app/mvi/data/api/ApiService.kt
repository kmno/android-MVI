package com.kamran.app.mvi.data.api

import com.kamran.app.mvi.data.model.User
import retrofit2.http.GET

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:50.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:50.
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}