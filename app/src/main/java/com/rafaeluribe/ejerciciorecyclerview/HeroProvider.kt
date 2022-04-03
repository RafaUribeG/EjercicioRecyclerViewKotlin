package com.rafaeluribe.ejerciciorecyclerview

import com.rafaeluribe.ejerciciorecyclerview.recycler.SuperHero

class HeroProvider {
    companion object{
        val superheroList = listOf<SuperHero>(
            SuperHero("SpiderMan",
                      "Marvel",
                      "Peter Parker",
                      "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
            SuperHero("Daredevil",
                     "Marvel",
                      "Mattew Michael Murdock",
                      "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg")
        )
    }
}