package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.details

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.R
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities.Constants.Companion.NEWS_ITEM_KEY
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        initUI()
    }

    private fun initUI() {
        var article : Article = intent.getParcelableExtra(NEWS_ITEM_KEY)

        tv_title.text = article.title
        tv_description.text = article.description

        Glide.with(this).load(article.urlToImage).into(iv_news_main_Image)

    }
}
