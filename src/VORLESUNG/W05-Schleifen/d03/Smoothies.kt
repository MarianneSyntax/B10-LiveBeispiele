package VORLESUNG.`W05-Schleifen`.d03

import VORLESUNG.`W05-Schleifen`.d02.PIZZAS

fun main(){

    val smoothies: MutableMap<String,Double> = mutableMapOf(
        "Tropical" to 3.49,
        "Erdbeere Mango" to 2.99,
        "Banane Kirsch" to 2.99,
        "Detox" to 3.99,
        "Wild Berries" to 3.49
    )

    val orders: List<List<String>> = listOf(
        listOf("Tropical", "Detox"),
        listOf("Banane Kirsch"),
        listOf("Erdbeere Mango", "Erdbeere Mango"),
        listOf("Banane Kirsch", "Wild Berries", "Detox")

    )

    // Unser Ziel: den Gesamtpreis der orders ausgeben

}
