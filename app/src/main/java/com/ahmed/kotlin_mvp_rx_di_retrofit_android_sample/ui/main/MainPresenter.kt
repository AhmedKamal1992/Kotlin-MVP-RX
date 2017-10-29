package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Joke
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.scope.PerActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.BasePresenter
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase.DataManager
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.internal.schedulers.IoScheduler
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers.io
import rx.Observer
import javax.inject.Inject

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@PerActivity
class MainPresenter @Inject constructor(val interactor: DataManager) :
        BasePresenter<MainContract.MainView>() , MainContract.MainPresenter
{
    override fun getJokes()
    {
        disposable.add(
                interactor.getRandomJokes(100)
                        .subscribeOn(io())
                        .observeOn(mainThread())
                        .subscribeWith(object : DisposableObserver<List<Joke>>()
                        {
                            override fun onNext(t: List<Joke>)
                            {
                                if(view != null)view?.onFetchJokesSuccess(t)
                            }

                            override fun onError(e: Throwable)
                            {
                                view?.onFetchJokesError(e)
                            }

                            override fun onComplete() {
                            }


                        })
        )
    }

}