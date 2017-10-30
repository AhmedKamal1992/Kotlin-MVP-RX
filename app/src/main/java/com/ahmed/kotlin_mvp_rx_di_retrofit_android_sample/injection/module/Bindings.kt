package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.module

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase.DataManager
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase.DataManagerImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Module
abstract class Bindings
{
    @Binds
    internal abstract fun bindDataManager(manager: DataManagerImpl) : DataManager
}