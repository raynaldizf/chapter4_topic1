package com.example.chapter4_topic1.studentvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chapter4_topic1.R

class StudentViewModel : ViewModel() {

    val listStudentItem = arrayListOf(
        DataStudent("Raynaldi", "20104042", R.drawable.ic_launcher_foreground),
        DataStudent("Zulfikar", "20104043", R.drawable.ic_launcher_foreground),
        DataStudent("Singgih", "20104044", R.drawable.ic_launcher_foreground),
        DataStudent("Budi", "20104045", R.drawable.ic_launcher_foreground),
        DataStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Harasdtono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Hartasdono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
        DataStudent("Hartono", "20104046", R.drawable.ic_launcher_foreground),
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudent(){
        var murid = listStudentItem
        studentList.value = murid
    }


}