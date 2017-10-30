package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main.recyclerview

import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.injection.scope.PerActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.listeners.RecyclerItemListener
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseAdapter
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseViewHolder
import javax.inject.Inject

/**
 * Created by Ahmed Kamal on 30-10-2017.
 */
@PerActivity
class MainAdapter @Inject constructor() : BaseAdapter<Article>() {
    override fun getListItemView(context: Context): BaseViewHolder<Article> {
        return NewsViewHolder(context)
    }

}