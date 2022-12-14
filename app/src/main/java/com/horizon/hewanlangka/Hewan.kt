package com.horizon.hewanlangka

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hewan(
    var name: String = "",
    var asal: String = "",
    var photo: Int = 0,
    var photo1: Int = 0,
    var detail: String = ""
): Parcelable
