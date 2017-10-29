package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Joke
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.remote.JokesService
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@Singleton
internal class DataManagerImpl @Inject constructor(val jokesService: JokesService) : DataManager
{
    override fun getRandomJokes(count: Int): Observable<List<Joke>>
    {
        return jokesService
                .fetchRandomJokes(count)
                .flatMap { Observable.just(it.value) }
    }
}