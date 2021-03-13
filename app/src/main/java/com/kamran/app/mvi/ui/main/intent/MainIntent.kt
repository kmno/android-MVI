package com.kamran.app.mvi.ui.main.intent

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:58.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:58.
 */
sealed class MainIntent {

    object FetchUser : MainIntent()

}