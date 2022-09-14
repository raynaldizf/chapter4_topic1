package com.example.chapter4_topic1.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic1.R

class NewsActivity : AppCompatActivity() {
    lateinit var rvNews : RecyclerView
    lateinit var newsAdapter :NewsAdapter
    lateinit var vmNews : NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        dataBerita()
        vmNews = ViewModelProvider(this).get(NewsViewModel::class.java)

        vmNews.getBerita()
        vmNews.listberita.observe(this,{
            newsAdapter.setDataBerita(it as ArrayList<DataNews>)
        })


        newsAdapter.onClick = {
            val pindah = Intent(this,DetailNewsActivity::class.java)
            pindah.putExtra("detailberita",it)
            startActivity(pindah)
        }
    }

    fun dataBerita(){
        rvNews = findViewById(R.id.rvNews)
        newsAdapter = NewsAdapter(ArrayList())

        rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvNews.adapter =newsAdapter
    }
}