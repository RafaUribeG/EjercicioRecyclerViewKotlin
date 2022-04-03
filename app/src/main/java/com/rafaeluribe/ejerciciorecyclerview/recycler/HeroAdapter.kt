package com.rafaeluribe.ejerciciorecyclerview.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rafaeluribe.ejerciciorecyclerview.R

class HeroAdapter(private val superheroList:List<SuperHero>) : RecyclerView.Adapter<HeroViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroViewHolder(layoutInflater.inflate(R.layout.recycler_items, parent, false))
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superheroList.size

}