package CHECKPOINTS.Musterloesungen.Videothek

// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int{
    return (1..5).random()
}

// Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
// genarateRatings() -> [2,6,4,9,1,3,2] oder [4,8,3,4,9,6,1]
fun generateRatings(): MutableList<Int>{
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()){
        ratings.add(randomRating())
    }
    return ratings
}

// TODO: Aufgabe 1: Zufällige Preise


