package com.udacity.shoestore.converters

import androidx.databinding.InverseMethod

object DoubleConverter {

    //Not needed since I wont edit the added data again

    @InverseMethod("stringToDouble")
    @JvmStatic
    fun doubleToString(value: Double?): String {
        return value?.toString() ?: ""
    }

    @JvmStatic
    fun stringToDouble(value: String): Double? {
        return if (value.isNotEmpty()) {
            value.toDouble()
        } else {
            0.0
        }
    }
}
