package CHECKPOINTS.WS4D01

fun main() {

    var numbers = mutableListOf(10,20,30)
    println(numbers)
    //numbers2 ist eine Referenz auf numbers
    var numbers2 = numbers.toMutableList() // [10,20,30]

    numbers2.add(40) // [40,50,60]
    println(numbers2)
    println(numbers)

    val movies = mutableListOf("Harry Potter", "Ironman", "Saw")
    val movies2 = mutableListOf("Titanic", "Batman", "Hangover")
    //println(movies)

    // Movie Liste 1
    addMovie(movies) // Funktionsaufruf
//    println(movies)

    // Movie Liste 2
    addMovie(movies2) // Funktionsaufruf
//    println(movies2)
}

/* ()-Klammern: Kopf der Funktion.
    Hier stehen die Parameter der Funktion.
    Sie kommen in die ()-Klammern der Funktion
 */

/* {}-Klammern: Körper bzw. Rumpf / Body.
    Hier arbeitet man mit den Parametern.
 */

fun addMovie(list: MutableList<String>) {

    list.add("Herr der Ring")
}

fun addNumbers(number: Int) {
    val result = number + 30

}