package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Joke
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Response
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.JOKES_END_POINT
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
interface JokesService {
    @GET(JOKES_END_POINT)
    fun fetchRandomJokes(@Path("count") count:Int):Observable<Response<Joke>>
}