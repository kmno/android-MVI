package com.kamran.app.mvi.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kamran.app.mvi.data.api.ApiHelper
import com.kamran.app.mvi.data.repository.MainRepository
import com.kamran.app.mvi.ui.main.viewmodel.MainViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 12:02.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 12:02.
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    @InternalCoroutinesApi
    @ExperimentalCoroutinesApi
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}