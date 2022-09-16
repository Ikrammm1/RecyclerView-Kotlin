package com.example.pml1_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pml1_recycleview.adapter.Adapter
import com.example.pml1_recycleview.model.Datamodel

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<Datamodel> ? = null
    private var adapter : Adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        gridLayoutManager = GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setData()
        adapter = Adapter(applicationContext,arrayList!!)
        recyclerView?.adapter = adapter
    }
    private fun setData() : ArrayList<Datamodel>{
        var items:ArrayList<Datamodel> = ArrayList()
        items.add(Datamodel(R.drawable.zenbook, "Asus Zenbook", "Rp.26.000.000"))
        items.add(Datamodel(R.drawable.asusrog, "ROG", "Rp.25.000.000"))
        items.add(Datamodel(R.drawable.tuf, "TUF Gaming", "Rp.16.000.000"))
        items.add(Datamodel(R.drawable.acer, "Acer", "Rp.5.500.000"))
        items.add(Datamodel(R.drawable.hp, "HP", "Rp.9.000.000"))
        items.add(Datamodel(R.drawable.lenovo, "Lenovo", "Rp.9.900.000"))
        items.add(Datamodel(R.drawable.apple, "MacBook", "Rp.23.000.000"))
        return items
    }
}