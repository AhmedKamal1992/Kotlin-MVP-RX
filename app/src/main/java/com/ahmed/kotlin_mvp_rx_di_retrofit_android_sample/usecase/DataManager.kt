package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Joke
import io.reactivex.Observable

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
interface DataManager {
    fun getRandomJokes(count : Int): Observable<List<Joke>>
}