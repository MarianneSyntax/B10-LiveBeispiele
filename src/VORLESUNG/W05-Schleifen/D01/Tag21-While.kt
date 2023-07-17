package VORLESUNG.`W05-Schleifen`.D01

fun main() {

    // Listen, über die wir mit Schleifen durchiterieren können.

    val pancake = listOf("Sugar", "Flour", "Eggs", "Milk", "Water", "Strawberries", "Nutella")
    val fruits = listOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")

    simpleWhileDown()
    simpleWhileUp()
    findMango(fruits)
    findMango(pancake)

}

fun simpleWhileUp() {
    var i = 0
    println("wir zählen hoch:")
    while (i <= 10){
        println("$i. Iteration der Schleife...")
        i++
    }
    println("Fertig.")

}

fun simpleWhileDown() {

    // simple while schleife: runter zählen
    var i = 10
    println("Wir zählen runter:")
    while(i >= 0) {
        println(i)
        i--
    }
}

fun findMango(list: List<String>){
    var i = 0
    var mangoFound = false
    // solange, wie i kleiner ist als die länge der liste und mangeFound false ist...
    while (i < list.size && !mangoFound){
        println("Gefundes Obst: ${list[i]}")
        // wenn das gefundene obst mango ist: schleife abbrechen.
        if (list[i] == "Mango") {
            println("Mango an Stelle $i in der Liste gefunden! Schleife abbrechen...")
            mangoFound = true
        }
        i++
    }
    if (!mangoFound) println("Mango ist nicht in der Liste.")

}
