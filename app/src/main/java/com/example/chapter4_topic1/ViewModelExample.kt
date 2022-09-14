package com.example.chapter4_topic1

import androidx.lifecycle.ViewModel

class ViewModelExample : ViewModel() {

//    var ubah = "Hello World"

    var hasil = 0

    fun hitungData(panjang : Int, lebar : Int, tinggi : Int){
        hasil = panjang * lebar * tinggi
    }
}