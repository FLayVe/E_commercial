package com.example.e_commercial.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.e_commercial.databinding.ItemCategoriesBinding
import com.example.e_commercial.model.ItemCategory

class CategoryViewHolder (private val binding: ItemCategoriesBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(item: ItemCategory){
        binding.category = item
    }
}