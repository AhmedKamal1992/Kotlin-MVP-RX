package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.MvpView
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.listeners.RecyclerItemListener

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
interface MainContract {

    interface MainView : MvpView
    {
        fun onFetchNewsSuccess(newsModel: NewsModel)
        fun onFetchNewsError(error: Throwable)
        fun navigateToDetailsScreen(article: Article)
    }

    interface MainPresenter
    {
        fun getNews()
    }

}