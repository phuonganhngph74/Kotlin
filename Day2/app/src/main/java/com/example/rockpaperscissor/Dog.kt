package com.example.rockpaperscissor

class Dog (name: String, val breed: String) {

    init {
        bark(name)
    }

    fun bark (name: String) {
        println("$name Woof woof" +  breed)
    }
}