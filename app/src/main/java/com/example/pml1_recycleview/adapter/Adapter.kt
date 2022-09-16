package com.example.pml1_recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pml1_recycleview.R
import com.example.pml1_recycleview.model.Datamodel

class Adapter(var context: Context, var arrayList: ArrayList<Datamodel>) :
    RecyclerView.Adapter<Adapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var alpha = itemView.findViewById<TextView>(R.id.judul)
        var icons = itemView.findViewById<ImageView>(R.id.img)
        var harga = itemView.findViewById<TextView>(R.id.harga)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alphaChar:Datamodel = arrayList.get(position)
        holder.icons.setImageResource(alphaChar.image!!)
        holder.alpha.text = alphaChar.title
        holder.harga.text = alphaChar.harga

        holder.alpha.setOnClickListener {
            Toast.makeText(context,alphaChar.title, Toast.LENGTH_SHORT).show()
        }
    }
}