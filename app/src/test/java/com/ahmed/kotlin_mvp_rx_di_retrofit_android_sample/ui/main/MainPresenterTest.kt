package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.App
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.BuildConfig
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase.DataManager
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.JSON_DATA
import com.google.gson.Gson
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Matchers
import org.mockito.Mock
import org.mockito.Mockito.anyObject
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config
import org.mockito.Mockito.`when` as _when


/**
 * Created by Ahmed Kamal on 02-11-2017.
 */

@RunWith(JUnit4 :: class)
@Config(application = App :: class, constants = BuildConfig :: class , sdk = intArrayOf(21), manifest = "/src/main/AndroidManifest.xml")
class MainPresenterTest {

    @Mock lateinit var activity : MainContract.MainView
    @Mock lateinit var dataManager : DataManager

    var presenter : MainPresenter? = null

    @Before
    fun setup()
    {
        MockitoAnnotations.initMocks(this)
        presenter = MainPresenter(dataManager)
        presenter!!.attachView(activity)
    }

    @Test
    fun shouldFetchNewsWhenRequested()
    {
        _when(dataManager.getNews()).thenReturn(Single.just(createNews()))
        presenter?.getNews()
        verify(dataManager.getNews())
    }

    @Test
    fun shouldNotifyViewWhenSuccess()
    {
        _when(dataManager.getNews()).thenReturn(Single.just(createNews()))
        presenter?.getNews()
        verify(activity).onFetchNewsSuccess(Matchers.anyObject())
    }

    @Test
    fun shouldNotifyViewWhenError()
    {
        _when(dataManager.getNews()).thenReturn(Single.error(Throwable("error")))
        presenter?.getNews()
        verify(activity.onFetchNewsError(Matchers.any()))
    }

    fun createNews() : NewsModel
    {
        return Gson().fromJson(JSON_DATA , NewsModel :: class.java)
    }

}