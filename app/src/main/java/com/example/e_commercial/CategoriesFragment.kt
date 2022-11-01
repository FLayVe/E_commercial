package com.example.e_commercial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.e_commercial.adapter.CategoryRecyclerAdapter
import com.example.e_commercial.databinding.FragmentCategoriesBinding
import com.example.e_commercial.model.ItemCategory

class CategoriesFragment: Fragment() {

    private var binding: FragmentCategoriesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentCategoriesBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.recyclerView.let {
            it?.layoutManager = LinearLayoutManager(context)
            it?.adapter = CategoryRecyclerAdapter().also {
                it.add(fillList())
            }
        }
    }

    private fun fillList(): List<ItemCategory> {
        val data = mutableListOf<ItemCategory>()
        data.add(ItemCategory("New", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Darth_Alekseevich_Vader.jpg"))
        data.add(ItemCategory("Clothes", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Darth_Alekseevich_Vader.jpg"))
        data.add(ItemCategory("Shoes", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Darth_Alekseevich_Vader.jpg"))
        data.add(ItemCategory("Accesories", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Darth_Alekseevich_Vader.jpg"))

        return data
    }
}