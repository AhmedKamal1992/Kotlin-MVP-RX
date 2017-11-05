package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase

import android.net.sip.SipErrorCode.SERVER_ERROR
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote.NewsService
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.NO_INTERNET
import io.reactivex.Observable
import io.reactivex.Single
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Singleton
internal class DataManagerImpl @Inject constructor(val newsService: NewsService) : DataManager
{
    override fun getNews(): Single<NewsModel>
    {
        return newsService.getNews().
                flatMap { Single.just(it) }
    }
}