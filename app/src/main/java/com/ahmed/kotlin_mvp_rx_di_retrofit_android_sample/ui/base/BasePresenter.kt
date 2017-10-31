package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base

import io.reactivex.disposables.CompositeDisposable
import java.lang.ref.WeakReference

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
open class BasePresenter<T : MvpView>
{
    protected var disposable = CompositeDisposable()
    protected var view: WeakReference<T>? = null

    fun attachView(view : T)
    {
        this.view = WeakReference(view)
    }

    fun detechView()
    {
        this.view = null
        disposable.clear()
        disposable.dispose()
    }

    fun destroy()
    {
        disposable.clear()
        disposable.dispose()
        detechView()
    }

}