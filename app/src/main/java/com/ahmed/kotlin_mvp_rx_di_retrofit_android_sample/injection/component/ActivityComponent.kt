package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.scope.PerActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.MainActivity
import dagger.Subcomponent

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Subcomponent
@PerActivity
interface ActivityComponent
{
    fun inject (activity: MainActivity)
}