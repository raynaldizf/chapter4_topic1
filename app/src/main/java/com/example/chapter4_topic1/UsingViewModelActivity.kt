package com.example.chapter4_topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class UsingViewModelActivity : AppCompatActivity() {


    lateinit var etPanjang : EditText
    lateinit var etLebar : EditText
    lateinit var etTinggi : EditText
    lateinit var btnHitung : Button
    lateinit var txtHasil : TextView
    lateinit var viewmodel : ViewModelExample
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_using_view_model)

        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        txtHasil = findViewById(R.id.txtHasil)

        viewmodel = ViewModelProvider(this).get(ViewModelExample::class.java)
        txtHasil.text = viewmodel.hasil.toString()

        btnHitung.setOnClickListener{
            var pj = etPanjang.text.toString().toInt()
            var lb = etLebar.text.toString().toInt()
            var tg = etTinggi.text.toString().toInt()
            viewmodel.hitungData(pj,lb,tg)

            txtHasil.text = viewmodel.hasil.toString()
//            hasil()

        }
    }
}