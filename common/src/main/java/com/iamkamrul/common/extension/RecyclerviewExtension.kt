package com.iamkamrul.common.extension

import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun<viewHolder,T: RecyclerView.Adapter<viewHolder>> Context.setUpGridRecyclerView(view: RecyclerView, viewAdapter:T, column:Int){
    view.setHasFixedSize(true)
    view.layoutManager = GridLayoutManager(this,column)
    view.adapter = viewAdapter
}

fun<viewHolder,T: RecyclerView.Adapter<viewHolder>> Context.setUpHorizontalReverseRecyclerView(view: RecyclerView, viewAdapter:T){
    view.setHasFixedSize(true)
    view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
    view.adapter = viewAdapter
}

fun<viewHolder,T: RecyclerView.Adapter<viewHolder>> Context.setUpVerticalRecyclerView(view: RecyclerView, viewAdapter:T){
    view.setHasFixedSize(true)
    view.layoutManager = LinearLayoutManager(this)
    view.adapter = viewAdapter
}

