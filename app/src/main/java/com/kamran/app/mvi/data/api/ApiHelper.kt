package com.kamran.app.mvi.data.api

import com.kamran.app.mvi.data.model.User

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:49.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:49.
 */
interface ApiHelper {

    suspend fun getUsers(): List<User>

}