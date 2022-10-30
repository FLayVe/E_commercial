package com.example.e_commercial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.e_commercial.databinding.CategoriesBinding

class MainActivity : AppCompatActivity() {

    private var binding: CategoriesBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.categories)

        binding?.let {
            val recyclerView: RecyclerView = it.recyclerView
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = RecyclerViewAdapter(fillList())
        }
    }

    private fun fillList(): List<String> {
        val titles = categorieTitlesList <String>()

    }


}