package com.rafaeluribe.ejerciciorecyclerview.recycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rafaeluribe.ejerciciorecyclerview.R

class HeroViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val superHero = view.findViewById<TextView>(R.id.txtHeroName)
    val realName = view.findViewById<TextView>(R.id.txtRealName)
    val publisher = view.findViewById<TextView>(R.id.txtPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)

    fun render(superHeroModel: SuperHero){
        superHero.text = superHeroModel.superhero
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    }
}