package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.extensions

import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.App
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.AppComponent

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
fun Context.getAppComponent(): AppComponent = (applicationContext as App).appComponent