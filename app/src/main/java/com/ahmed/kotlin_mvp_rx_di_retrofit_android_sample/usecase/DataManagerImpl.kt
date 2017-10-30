package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote.NewsService
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Singleton
internal class DataManagerImpl @Inject constructor(val newsService: NewsService) : DataManager
{
    override fun getNews(): Observable<NewsModel>
    {
        return newsService
                .getNews()
                .flatMap { Observable.just(it) }
    }
}