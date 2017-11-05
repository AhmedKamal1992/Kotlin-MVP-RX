package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base

import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.PRESNETER_ERROR
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
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

    fun checkViewAttached() {
        if (!isViewAttached()) {
            throw MvpViewNotAttachedException()
        }
    }

    fun destroy()
    {
        disposable.clear()
        disposable.dispose()
        detechView()
    }

    fun getView(): T? {
        return view!!.get()
    }

    fun isViewAttached(): Boolean {
        return view!!.get() != null
    }

    fun addDisposable(disposable: Disposable) {
        this.disposable.add(disposable)
    }

    class MvpViewNotAttachedException : RuntimeException(PRESNETER_ERROR)

}