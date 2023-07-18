package VORLESUNG.`W05-Schleifen`.d02

import kotlin.math.PI

val PIZZAS = listOf("Salami", "Mozarella", "Hawaii", "Tonno")

fun main(){
    // Pizza Aufgabe: mit repeat, while und do while lösen

    var order = pizzaDo()
    println(order)
}

fun pizzaRepeat(): MutableList<String> {
    // 1. Schritt: leere Liste anlegen, in die wir 100 Pizzen schreiben können
    val pizzaOrder: MutableList<String> = mutableListOf()

    // 2. Schritt: Variable für repeat
    var j = 100
    // 3. Schritt: Repeat Block
    repeat(j){
        // random pizza in variable speichern
        var newPizza = PIZZAS.random()
        // diese variable der pizzaOrder Liste hinzufügen
        pizzaOrder.add(newPizza)
    }
    // pizzaOrder Liste nach draußen geben, kann so in Variable gespeichert werden
    return pizzaOrder
}

fun pizzaWhile(): MutableList<String> {
    // 1. Schritt: leere Liste anlegen, in die wir 100 Pizzen schreiben können
    val pizzaOrder: MutableList<String> = mutableListOf()
    // 2. Schritt: Laufvariable
    var i = 0
    // 3. Schritt: while: Die Liste soll 100 Pizzen bekommen
    while (i < 100){
        // random pizza in variable speichern
        var newPizza = PIZZAS.random()
        // diese variable der pizzaOrder Liste hinzufügen
        pizzaOrder.add("${i+1}. Pizza: $newPizza")
        // nicht vergessen: i inkrementieren, sonst droht endlosschleife
        i++
    }
    return pizzaOrder
}

fun pizzaDo(): MutableList<String> {
    // 1. Schritt: leere Liste anlegen, in die wir 100 Pizzen schreiben können
    val pizzaOrder: MutableList<String> = mutableListOf()
    var i = 1
    do {
        pizzaOrder.add(PIZZAS.random())
        i++
    } while (i <= 100)

    return pizzaOrder
}






fun beispiel(){
    var i = 0
    while (i < 10){
        i++
        println(i)
    }
    //println(i)
}