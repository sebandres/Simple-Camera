package com.simplemobiletools.camera.extensions

import android.content.Context
import android.hardware.Camera
import com.simplemobiletools.camera.R

private val RATIO_TOLERANCE = 0.1f

fun Camera.Size.isSixteenToNine(): Boolean {
    val selectedRatio = Math.abs(width / height.toFloat())
    val checkedRatio = 16 / 9.toFloat()
    val diff = Math.abs(selectedRatio - checkedRatio)
    return diff < RATIO_TOLERANCE
}

fun Camera.Size.isFourToThree(): Boolean {
    val selectedRatio = Math.abs(width / height.toFloat())
    val checkedRatio = 4 / 3.toFloat()
    val diff = Math.abs(selectedRatio - checkedRatio)
    return diff < RATIO_TOLERANCE
}

fun Camera.Size.isThreeToTwo(): Boolean {
    val selectedRatio = Math.abs(width / height.toFloat())
    val checkedRatio = 3 / 2.toFloat()
    val diff = Math.abs(selectedRatio - checkedRatio)
    return diff < RATIO_TOLERANCE
}

fun Camera.Size.isSixToFive(): Boolean {
    val selectedRatio = Math.abs(width / height.toFloat())
    val checkedRatio = 6 / 5.toFloat()
    val diff = Math.abs(selectedRatio - checkedRatio)
    return diff < RATIO_TOLERANCE
}

fun Camera.Size.getAspectRatio(context: Context): String {
    return if (isSixteenToNine()) {
        "16:9"
    } else if (isFourToThree()) {
        "4:3"
    } else if (isThreeToTwo()) {
        "3:2"
    } else if (isSixToFive()) {
        "6:5"
    } else {
        context.resources.getString(R.string.other)
    }
}
