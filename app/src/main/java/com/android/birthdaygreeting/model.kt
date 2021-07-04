package com.android.birthdaygreeting

import android.graphics.Bitmap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class model(val title: String, val imagesrc:Int): Parcelable
