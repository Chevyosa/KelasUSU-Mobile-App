package com.usu.kelasusumobile.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.usu.kelasusumobile.R
import com.usu.kelasusumobile.home.data.SubjectDataClass

class RecyclerSubjectAdapter(private val dataList: ArrayList<SubjectDataClass>): RecyclerView.Adapter<RecyclerSubjectAdapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.subject_layout,parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvTitle.text = currentItem.subjectName
        holder.rvImage.setImageResource(currentItem.subjectIcon)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView){
        val rvImage: ImageView = itemView.findViewById(androidx.appcompat.R.id.image)
        val rvTitle: TextView = itemView.findViewById(androidx.appcompat.R.id.title)
    }
}