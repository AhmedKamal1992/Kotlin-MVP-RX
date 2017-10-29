package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.module.Bindings
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Singleton
@Component(modules = arrayOf(Bindings::class , NetworkModule::class))
interface AppComponent {
    fun activityComponent():ActivityComponent
}