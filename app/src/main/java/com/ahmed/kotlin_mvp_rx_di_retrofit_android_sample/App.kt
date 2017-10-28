package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample

import android.app.Application
import android.content.Context

/**
 * Created by Ahmed on 28/10/2017.
 */
class App : Application()
{
    override fun onCreate()
    {
        super.onCreate()
    }

    fun getAppContext(): Context
    {
        return this
    }
}