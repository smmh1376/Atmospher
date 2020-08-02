package com.example.ara.atmospher.functions

fun getTempByUnit(temp: Int, isImperial: Boolean): Int {
    return when (isImperial) {
        false -> temp
        true -> (9 / 5) * temp + 32
    }
}