package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.component.ActivityComponent
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.extensions.getAppComponent

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
abstract class BaseActivity : AppCompatActivity()
{
    protected var activityComponent : ActivityComponent? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutRestId())
        activityComponent = getAppComponent().activityComponent()
    }

    override fun onDestroy()
    {
        activityComponent = null
        super.onDestroy()
    }

    abstract fun getLayoutRestId(): Int
}