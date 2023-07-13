package VORLESUNG.W04.D04

fun main(){
    val movieMap: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Christopher Nolan" to mutableListOf("Memento", "The Dark Knight", "Dunkirk"),
        "Greta Gerwig" to mutableListOf("Nights and Weekends", "Lady Bird", "Little Women")
    )
    // if-else beispiel mit map und liste: Wenn Oppenheimer und Barbie noch nicht vorhanden sind, wollen wir sie hinzufügen
    val chrisMovies: MutableList<String> = movieMap["Christopher Nolan"]!!
    println(chrisMovies)
    val gretaMovies: MutableList<String> = movieMap["Greta Gerwig"]!!
    println(gretaMovies)


    try {
        triggerIndexOutOfBounds(gretaMovies)
    } catch (e: Exception){
        println("Fehler! $e")
    }


    // oppenheimer dazu: mit .contains()
    if (!chrisMovies.contains("Oppenheimer")){
        chrisMovies.add("Oppenheimer")
        println(chrisMovies)
    } else {
        println("Oppenheimer ist vorhanden")
    }

    // barbie: mit in
    if ("Barbie" !in gretaMovies) {
        gretaMovies.add("Barbie")
        println(gretaMovies)

    } else {
        println("Barbie ist bereits vorhanden.")
    }

    // when beispiel: Informationen printen
    println("Bitte gib den Film ein, zu dem du mehr wissen willst...")
    val chosenMovie = readln()

    when(chosenMovie){
        "Oppenheimer" -> {
            println("Der neuste Film über die Erfindung der Atombombe.")
        }
        "Barbie" -> println("She's everything. He's just Ken. Ein Film über Selbstfindung in einer Plastikwelt.")
        else -> println("Alter Film, der uns nicht interessiert. Komm in 2023 an!")
    }




}

fun triggerIndexOutOfBounds(list: MutableList<String>){
    val element = list[5]
    println("Das 5. Element ist $element")
}