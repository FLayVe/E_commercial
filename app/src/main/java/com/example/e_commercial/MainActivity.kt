package com.example.e_commercial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.e_commercial.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.fragmentContainer?.id?.let {
            supportFragmentManager.beginTransaction()
                .replace(it, CategoriesFragment())
                .setReorderingAllowed(true)
                .commit()
        }
    }
}