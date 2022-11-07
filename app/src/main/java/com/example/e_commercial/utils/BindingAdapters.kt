package com.example.e_commercial.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("app:imageUrl")
fun loadImage(view:ImageView,url:String){
    Picasso.with(view.context).load(url).into(view)
}