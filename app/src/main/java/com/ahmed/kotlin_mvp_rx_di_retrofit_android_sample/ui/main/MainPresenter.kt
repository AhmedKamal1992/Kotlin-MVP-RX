package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.scope.PerActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.BasePresenter
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.usecase.DataManager
import io.reactivex.android.schedulers.AndroidSchedulers.mainThread
import io.reactivex.observers.DisposableObserver
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers.io
import javax.inject.Inject

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
@PerActivity
class MainPresenter @Inject constructor(val interactor: DataManager) :
        BasePresenter<MainContract.MainView>() , MainContract.MainPresenter
{
    override fun getNews()
    {
       checkViewAttached()
       view?.get()?.showLoading()
       addDisposable(interactor.getNews()
               .subscribeOn(io())
               .observeOn(mainThread())
               .subscribeWith(object : DisposableSingleObserver<NewsModel>()
               {
                   override fun onSuccess(newsModel: NewsModel) {
                       view?.get()?.hideLoading()
                       if(view != null) view?.get()?.onFetchNewsSuccess(newsModel)
                   }

                   override fun onError(e: Throwable)
                   {
                       view?.get()?.hideLoading()
                       view?.get()?.onFetchNewsError(e)
                   }

               }
           )
       )
    }

}