package com.kamran.app.mvi.data.model

import com.squareup.moshi.Json

/**
 * Created by Kamran Noorinejad on 3/13/2021 AD 11:48.
 * Edited by Kamran Noorinejad on 3/13/2021 AD 11:48.
 */
data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)
