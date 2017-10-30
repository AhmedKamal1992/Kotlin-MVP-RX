package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main.recyclerview

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.R
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseAdapter
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.recyclerview.BaseViewHolder
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.details.DetailsActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.NEWS_ITEM_KEY
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.news_item.view.*
import javax.inject.Inject

/**
 * Created by Ahmed Kamal on 30-10-2017.
 */
class NewsViewHolder(context: Context) : BaseViewHolder<Article>(context)
{
    override fun layoutResId(): Int = R.layout.news_item

    override fun bind(item: Article, position: Int, viewHolder: BaseAdapter<Article>.ViewHolder) {
        tv_title.text = item.title
        tv_caption.text = item.description
        Glide.with(context).load(item.urlToImage).into(iv_news_item_image)

        viewHolder.itemView.setOnClickListener(
                {
                    context.startActivity(Intent(context , DetailsActivity :: class.java).putExtra(NEWS_ITEM_KEY, item))
                })
    }
}