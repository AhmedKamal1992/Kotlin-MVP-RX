package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main.recyclerview

import android.content.Context
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.R
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.listeners.RecyclerItemListener
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseAdapter
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by Ahmed Kamal on 30-10-2017.
 */
class NewsViewHolder(context: Context) : BaseViewHolder<Article>(context)
{
    lateinit var recyclerItemListener : RecyclerItemListener

    override fun layoutResId(): Int = R.layout.news_item

    override fun bind(item: Article , position: Int) {
        tv_title.text = item.title
        tv_caption.text = item.description
        Glide.with(context).load(item.urlToImage).into(iv_news_item_image)

        recyclerItemListener.onItemSelected(position)
        rl_news_item.setOnClickListener({ recyclerItemListener.onItemSelected(position) })
    }

}