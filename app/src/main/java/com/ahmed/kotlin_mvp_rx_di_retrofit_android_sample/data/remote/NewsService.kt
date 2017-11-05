package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by Ahmed Kamal on 30-10-2017.
 */
interface NewsService
{
    @GET(Constants.NEWS_API + Constants.NEWS_API_KEY)
    fun getNews() : Single<NewsModel>
}