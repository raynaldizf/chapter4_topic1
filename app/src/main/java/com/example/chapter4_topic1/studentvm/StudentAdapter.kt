package com.example.chapter4_topic1.studentvm

import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_topic1.R

class StudentAdapter(var listStudent : ArrayList<DataStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {
        var name = itemView.findViewById<TextView>(R.id.studentName)
        var nim = itemView.findViewById<TextView>(R.id.studentNim)
        var image = itemView.findViewById<ImageView>(R.id.studentImage)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = listStudent[position].name
        holder.nim.text = listStudent[position].nim
        holder.image.setImageResource(listStudent[position].img)

    }

    override fun getItemCount(): Int {
       return listStudent.size
    }

    fun setDataStudent(studenList: ArrayList<DataStudent>){
        this.listStudent = studenList
    }
}