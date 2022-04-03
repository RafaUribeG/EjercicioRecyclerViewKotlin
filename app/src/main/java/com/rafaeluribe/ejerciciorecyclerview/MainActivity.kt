package com.rafaeluribe.ejerciciorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafaeluribe.ejerciciorecyclerview.recycler.HeroAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.myRecycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroAdapter(HeroProvider.superheroList)
    }
}