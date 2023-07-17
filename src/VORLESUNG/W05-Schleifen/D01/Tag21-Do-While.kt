package VORLESUNG.`W05-Schleifen`.D01

fun main() {
   // doWhileNumber()
   // doWhileString()
    doWhileBoolean()
   // doWhileFruitsList()
}

fun doWhileFruitsList() {
    // Elemente aus Liste entfernen, bis nur noch 1 übrig ist
    var firstIndex = 0
    val fruits = mutableListOf("Apples", "Oranges", "Cherries", "Watermelon", "Mango", "Strawberries")

    do {
        println("Zu entfernendes Element: ${fruits[firstIndex]}")
        fruits.removeAt(firstIndex)
        println("Länge der Liste nach Entfernen: ${fruits.size}")
        println("Übrige Elemente in der Liste: $fruits")
    } while (firstIndex < fruits.size-1)

    println("Letztes übriges Element in der Liste: $fruits")
}

fun doWhileBoolean() {
    var boolean = false


    do {
        println("True or False? ... ")
        boolean = readln().toBoolean()
        println("Du hast $boolean eingegeben.")
    } while (boolean == false)

    println("Geschafft, du hast endlich true eingegeben!")
}

fun doWhileNumber(){
    // positive Zahl eingeben und prüfen, Fall abfangen, dass number kein Int ist
    var number: Int
    do {
        println("Bitte positive Zahl über 0 eingeben...")
        number = readln().toIntOrNull() ?: 100
    } while (number <= 0)

    println("Du hast eine positive Zahl, die $number eingegeben!")

}

fun doWhileString(){
    var input: String
    do {
        println("Name eingeben...")
        input = readln()
    } while (input.isEmpty())

    println("Hello, $input!")

}

