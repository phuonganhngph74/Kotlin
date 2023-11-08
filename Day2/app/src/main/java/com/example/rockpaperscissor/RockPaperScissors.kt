package com.example.rockpaperscissor

data class CoffeeDetails(val sugarCount:Int,
                         val name: String,
                         val size: String,
                         val creamAmount: Int
)

fun main() {
    val coffeeForMe = CoffeeDetails(2, "Latte", "Medium", 1)
    makeCoffee(coffeeForMe)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Add ${coffeeDetails.sugarCount} a spoon of sugar" +
                " for ${coffeeDetails.size} ${coffeeDetails.name}" +
                " with ${coffeeDetails.creamAmount} cream"
        )
    } else if (coffeeDetails.sugarCount > 1) {
        println("Add ${coffeeDetails.sugarCount} spoons of sugar" +
                " for ${coffeeDetails.size} ${coffeeDetails.name}" +
                " with ${coffeeDetails.creamAmount} cream")
    } else {
        println("No sugar" +
                " for ${coffeeDetails.size} ${coffeeDetails.name}" +
                " with ${coffeeDetails.creamAmount} cream")
    }
}

