package com.example.sch.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Official(
    val embed_url: String,
    val raw_url: String
) : Parcelable