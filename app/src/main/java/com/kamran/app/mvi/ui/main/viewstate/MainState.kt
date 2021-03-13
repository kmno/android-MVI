package com.kamran.app.mvi.ui.main.viewstate

import com.kamran.app.mvi.data.model.User

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:59.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:59.
 */
sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()

}