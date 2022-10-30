package com.example.e_commercial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commercial.databinding.CategoriesBinding

class RecyclerViewAdapter (val titles:List<String>, val images: List<Int>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    class  ViewHolder(item: View): RecyclerView.ViewHolder(item){
        val title: TextView = item.findViewById(R.id.textView)
        val image: ImageView = item.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = titles[position]
        holder.image.setImageResource(images[position])
    }

    override fun getItemCount() = titles.size

}