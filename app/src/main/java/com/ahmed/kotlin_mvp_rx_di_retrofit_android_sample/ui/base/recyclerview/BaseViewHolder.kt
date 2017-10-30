package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout

/**
 * Created by Ahmed Kamal on 30-10-2017.
 */
abstract class BaseViewHolder<T : Parcelable> : RelativeLayout {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        View.inflate(context, layoutResId(), this)
    }

    protected abstract fun layoutResId(): Int

    abstract fun bind(item: T, position: Int, viewHolder: BaseAdapter<T>.ViewHolder)

}