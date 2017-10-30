package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.R
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.Article
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model.NewsModel
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.base.BaseActivity
import com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.ui.main.recyclerview.MainAdapter
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

class MainActivity : BaseActivity() , MainContract.MainView
{
    @Inject lateinit var presenter : MainPresenter
    @Inject lateinit var mainAdapter: MainAdapter

    override fun initializePresenter() {
        presenter.bind(this)
        presenter.getNews()
    }

    override fun initializeUi() {
        initUI()
    }

    override fun initializeDagger() {
        activityComponent?.inject(this)
    }

    override fun getLayoutResId():Int = R.layout.activity_news

    private fun initUI() {
        txt_toolbar_title.text = getString(R.string.news)
        rv_news_list.setHasFixedSize(true)
        rv_news_list.layoutManager = LinearLayoutManager(this)
        rv_news_list.adapter = mainAdapter
    }

    override fun onFetchNewsSuccess(newsModel: NewsModel) {
        mainAdapter.clearItems()
        mainAdapter.addItems(newsModel.articles!!)
        pb_loading.visibility = View.GONE
    }

    override fun onFetchNewsError(error: Throwable) {
        Toast.makeText(this, "Error. ${error.message.toString()}", Toast.LENGTH_LONG).show()
        pb_loading.visibility = View.GONE
    }

    override fun navigateToDetailsScreen(article: Article) {

    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }

}
