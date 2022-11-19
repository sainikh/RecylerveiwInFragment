package com.example.recylerveiwinfragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val list:ArrayList<DataClass>, private val context: Passer):RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val UserName = itemView.findViewById<TextView>(R.id.username)
        val cardview = itemView.findViewById<CardView>(R.id.carview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
            return ViewHolder(itemView)
    }

   override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val currentpos = list[position]
            holder.UserName.text = currentpos.name
            holder.cardview.setOnClickListener{
                context.getPoss(position)
            }

    }

    override fun getItemCount(): Int    {
        return list.size
    }
}