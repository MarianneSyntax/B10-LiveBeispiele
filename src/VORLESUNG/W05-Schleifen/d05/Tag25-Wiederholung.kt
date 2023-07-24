package VORLESUNG.`W05-Schleifen`.d05

fun main(){
    // mehrere Higher Order Functions in Kombination benutzen

    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    // nur die geraden Zahlen *10 rechnen

    // nur die geraden Zahlen: ? , *10 rechnen
    var evenNumbers = numbers.filter { it % 2 == 0 }.map { it*10 }

    println("Ergebins Kombi aus filter und map: $evenNumbers") // [20, 40, 60, 80, 100]

    println("-------")


    val words = listOf("bananas", "apple", "watermelon", "cherry")
    // wörter die länger als 5 alphabetisch sortieren, in ALL CAPS schreiben
    // größer und kleiner:
    // zahl > 4 --> ist auf jeden fall mindestens 5
    // zahl >= 4 --> mindestens 4
    // zahl >= 5 --> ist entweder 5 oder größer
    var longWordsSortedAllCaps = words.filter { it.length>5 }.sortedBy { it }.map { it.uppercase() }

   println("Ergebnis Kombi aus filter, sortedBy und map: $longWordsSortedAllCaps") // [BANANAS, CHERRY, WATERMELON]


}