package com.example.chapter4_topic1.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic1.R

class NewsAdapter(var daftarBerita : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    var onClick :((DataNews)-> Unit)? = null

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {
        var penulisBerita = itemView.findViewById<TextView>(R.id.txtPenulis)
        var judulBerita = itemView.findViewById<TextView>(R.id.txtJudul)
        var tanggalBerita = itemView.findViewById<TextView>(R.id.txtTanggal)
        var imageBerta = itemView.findViewById<ImageView>(R.id.imgBerita)
        var card = itemView.findViewById<CardView>(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.penulisBerita.text = daftarBerita[position].penulis
        holder.judulBerita.text = daftarBerita[position].judul
        holder.tanggalBerita.text = daftarBerita[position].tanggal
        holder.imageBerta.setImageResource(daftarBerita[position].gambar)

        holder.card.setOnClickListener{
            onClick?.invoke(daftarBerita[position])
        }
    }

    override fun getItemCount(): Int {
        return daftarBerita.size
    }

    fun setDataBerita(daftarBerita: ArrayList<DataNews>){
        this.daftarBerita = daftarBerita

    }
}