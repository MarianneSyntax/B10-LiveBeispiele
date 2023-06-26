fun main(){

    // MUTABLE Listen: sind veränderbar. gleiche Syntax wie Lists, nur mit "mutable" davor
    var horrorMovies: MutableList<String> = mutableListOf("Halloween", "Friday 13th", "Scream")
    println(horrorMovies)

    // erste Version von add: hängt immer neues Element, das man in den () als Parameter übergibt, ans Ende der Liste
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
    println("Letztes Element: ${horrorMovies[letzterIndex]}")

    // Index in einer Variable speichern, Variable in die eckigen Klammern setzen:
    var index = 2
    println(horrorMovies[index])

    // auch mit MutableLists gehen .size und alle anderen lesenden Operationen, die auf Lists möglich sind:
    var horrorMoviesSize : Int = horrorMovies.size
    println("Die Länge der Liste HorrorMovies ist: $horrorMoviesSize")

    // contains() gibt true oder false zurück
    var krampusInList = horrorMovies.contains("Krampus") // gibt false zurück und speichert das false in der Variable, Krampus ist nicht in der Liste
    var screamInList = horrorMovies.contains("Scream") // gibt true zurück, Scream ist in der Liste

    // get: gibt ein Int, den Index, zurück
    var movieAtIndexThree = horrorMovies.get(3) // speichert den Film, der an Index 3 steht, in movieAtIndexThree.


    // subList()
    var subList = horrorMovies.subList(0,2) // gibt die Elemente von Index 0 bis ausschließlich Index 2 zurück
    println(subList) // druckt [Old, Halloween]. Index 2 ist nicht mit inbegriffen, es ist die obere Grenze.

    // reversed()
    var reversedNumbers = horrorMovies.reversed() // macht eine umgekehrte Kopie der Liste
    println(reversedNumbers)

    // sorted()
    var sortedNumbers = horrorMovies.sorted() // sortiert eine Kopie der Liste aufsteigend (bei Strings: alphabetisch)
    println(sortedNumbers)
}