package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
open class BasePresenter<T : MvpView>
{
    protected var disposable = CompositeDisposable()
    protected var view: T? = null

    fun bind(view : T)
    {
        this.view = view
    }

    fun unbind()
    {
        this.view = null
    }

    fun destroy()
    {
        disposable.clear()
        disposable.dispose()
        unbind()
    }

}