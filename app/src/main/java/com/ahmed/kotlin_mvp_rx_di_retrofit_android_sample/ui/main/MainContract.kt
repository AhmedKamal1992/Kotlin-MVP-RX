package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Joke
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.MvpView

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
interface MainContract {

    interface MainView : MvpView
    {
        fun onFetchJokesSuccess(jokes: List<Joke>)
        fun onFetchJokesError(error: Throwable)
    }

    interface MainPresenter
    {
        fun getJokes()
    }

}