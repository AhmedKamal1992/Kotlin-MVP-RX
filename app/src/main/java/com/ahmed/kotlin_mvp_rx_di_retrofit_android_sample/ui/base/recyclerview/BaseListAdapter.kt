package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview

import android.os.Parcelable
import android.support.v7.widget.RecyclerView

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
abstract class BaseListAdapter<T : Parcelable> : RecyclerView.Adapter<BaseListAdapter<T>.ViewHolder>()
{
    inner class ViewHolder(var view: BaseViewHolder<T>) : RecyclerView.ViewHolder(view)
}