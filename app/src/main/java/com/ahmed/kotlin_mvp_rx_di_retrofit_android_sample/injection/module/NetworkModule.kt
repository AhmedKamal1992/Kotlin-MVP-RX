package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.module

import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.App
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote.NewsService
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.BASE_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Module
open class NetworkModule {


    @Provides
    @Singleton
    fun provideNewsService(retrofit: Retrofit):NewsService = retrofit.create(NewsService :: class.java)

    @Provides
    @Singleton
    fun provideGson() : Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient , gson: Gson) : Retrofit
    {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }
}