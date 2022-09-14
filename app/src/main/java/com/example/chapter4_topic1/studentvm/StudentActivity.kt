package com.example.chapter4_topic1.studentvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic1.R

class StudentActivity : AppCompatActivity() {
    lateinit var rvStudent: RecyclerView
    lateinit var adapterStudent : StudentAdapter
    lateinit var studentVM : StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        DataStudent()
        studentVM = ViewModelProvider(this).get(StudentViewModel::class.java)
        studentVM.getStudent()
        studentVM.studentList.observe(this, Observer {
        adapterStudent.setDataStudent(it as ArrayList<DataStudent>)
        })

    }

    fun DataStudent(){
        rvStudent = findViewById(R.id.rvStudent)
        adapterStudent = StudentAdapter(ArrayList())

        rvStudent.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvStudent.adapter =adapterStudent
    }
}