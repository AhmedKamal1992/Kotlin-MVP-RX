package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample

import android.app.Application
import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.AppComponent
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.DaggerAppComponent

/**
 * Created by Ahmed on 28/10/2017.
 */
class App : Application()
{
    lateinit var appComponent : AppComponent
    override fun onCreate()
    {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }

    fun getAppContext(): Context
    {
        return this
    }
}