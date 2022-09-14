package com.example.chapter4_topic1.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter4_topic1.R
import kotlinx.android.synthetic.main.activity_detail_news.*

class DetailNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        var getNews = intent.getSerializableExtra("detailberita") as DataNews
        detailJudulBerita.text = getNews.judul
        detailBeritaTanggal.text = getNews.tanggal
        detailBeritaPenulis.text = getNews.penulis
        imageDetalBerita.setImageResource(getNews.gambar)
        detailIsiBerita.text = getNews.isiBerita
    }
}