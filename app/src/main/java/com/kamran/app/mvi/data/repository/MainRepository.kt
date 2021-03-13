package com.kamran.app.mvi.data.repository

import com.kamran.app.mvi.data.api.ApiHelper

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:55.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:55.
 */
class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}