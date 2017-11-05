package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
interface DataManager {
    fun getNews(): Single<NewsModel>
}