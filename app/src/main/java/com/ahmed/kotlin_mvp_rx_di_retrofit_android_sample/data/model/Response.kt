package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
data class Response<out T>(val type:String , val value: List<T>)