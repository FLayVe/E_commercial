package com.example.e_commercial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commercial.adapter.holder.CategoryViewHolder
import com.example.e_commercial.databinding.ItemCategoriesBinding
import com.example.e_commercial.model.ItemCategory

class CategoryRecyclerAdapter() : RecyclerView.Adapter<CategoryViewHolder>() {

    private val itemList = mutableListOf<ItemCategory>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount() = itemList.size

    fun add(category: List<ItemCategory>) {
        itemList.clear()
        itemList.addAll(category)
        this.notifyDataSetChanged()
    }
}