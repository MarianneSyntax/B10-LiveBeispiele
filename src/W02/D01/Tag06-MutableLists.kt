fun main(){

    // MUTABLE Listen: sind veränderbar. gleiche Syntax, nur mit "mutable" davor
    var horrorMovies: MutableList<String> = mutableListOf("Halloween", "Friday 13th", "Scream")
    println(horrorMovies)

    // erste Version von add: hängt immer neues Element, das man in den () übergibt, ans Ende der Liste
    horrorMovies.add("Nightmare on Elm Street")
    horrorMovies.add("Silent Hill")
    horrorMovies.add("Martyrs")
    println(horrorMovies)

    // zweite Version von add: fügt an spezifischem Index ein
    horrorMovies.add(0,"Old") // fügt "Old" ganz vorne an die Liste
    println(horrorMovies)
    horrorMovies.add(0, "The 6th Sense") // fügt The 6th Sense ganz vorne an die Liste
    println(horrorMovies)

    // erste Version von remove: entfernt das Element, das man in den ( ) spezifiziert
    horrorMovies.remove("Scream")
    println(horrorMovies)

    // removeAt an spezifischem Index: entfernt das Element, das am übergebenen Index steht
    horrorMovies.removeAt(0)
    println(horrorMovies)

    // letzten index ausrechnen: geht immer mit size-1
    var letzterIndex = horrorMovies.size-1
    println("Letztes Element: ${horrorMovies[letzterIndex]}") // letzterIndex ist = 5

    // Index in einer Variable speichern, Variable in die eckigen Klammern setzen:
    var index = 2
    println(horrorMovies[index])

    // .size
    var horrorMoviesSize : Int = horrorMovies.size
    println("Die Länge der Liste HorrorMovies ist: $horrorMoviesSize")

}