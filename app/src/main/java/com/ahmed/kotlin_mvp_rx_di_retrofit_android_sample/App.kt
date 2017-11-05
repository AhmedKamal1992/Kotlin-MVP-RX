package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample

import android.app.Application
import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.AppComponent
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.DaggerAppComponent
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.NetworkUtils
import java.lang.ref.WeakReference

/**
 * Created by Ahmed on 28/10/2017.
 */
open class App : Application()
{
    lateinit var appComponent : AppComponent
    override fun onCreate()
    {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}