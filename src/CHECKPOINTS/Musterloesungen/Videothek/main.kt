package CHECKPOINTS.Musterloesungen.Videothek



fun main() {
    //Aufgabe 1

    val newMovie = "Oldboy"
    filmListe.add(newMovie)
    filmToGenre[newMovie] = "Thriller"
    filmToPrice[newMovie] = 1.0
    filmRatings[newMovie] = generateRatings()



    //Aufgabe 2

    filmToPrice["The Dark Knight"] = generateRandomPrice()
    filmToPrice["Indiana Jones"] = generateRandomPrice()
    filmToPrice["Die Hard"] = generateRandomPrice()

    //Aufgabe 3


    //Aufgabe 4
    println(getBestRatedMovie())

    //Aufgabe 5


    //Aufgabe 6


    //Aufgabe 7


    //Aufgabe 8
}

/**Aufgabe 2 */
fun generateRandomPrice(): Double {
    return (2..5).random().toDouble()
}

/**Aufgabe 3 */
//3a
fun getPriceForMovie(movie: String): Double {
    return filmToPrice.getValue(movie)
//    filmToPrice[movie] ?: 0.0

}
//3b
fun getGenreForMovie(movie: String): String {
    return filmToGenre.getValue(movie)
}
//3c
fun getAverageRatingForMovie(movie: String): Double {
    return filmRatings.getValue(movie).average()
}

/**Aufgabe 4 */
//4a
fun getCheapestMovie(): String {
    val cheapestPrice = filmToPrice.values.min()
    val indexOfCheapestMovie = filmToPrice.values.indexOf(cheapestPrice)
    return filmToPrice.keys.elementAt(indexOfCheapestMovie)
}



//4b
// [4,8,3,4,9,6,1] -> 9 -> Batman
// [4,5,3,4,5,6,1] -> 6 -> Titanic
// [4,5,3,4,5,6,1] -> 3 -> Die Hard
fun getBestRatedMovie(): String {
    var averageRatingMap = mutableMapOf<String, Double>()

    filmRatings.forEach {averageRatingMap[it.key] = it.value.average()}
    var best = averageRatingMap.values.max()
    var bestIndex = averageRatingMap.values.indexOf(best)
    return averageRatingMap.keys.elementAt(bestIndex)
}

/**Aufgabe 5 */
//5a
fun getMoviesInAlphOrder(): List<String> {
    return filmListe.sorted()
}

//5b
fun getMoviesOrderedByPrice(): List<Pair<String, Double>> {
    return filmToPrice.toList().sortedBy { it.second }

}

/**Aufgabe 6 */

fun chooseMovie(): Boolean {
    println("Willkommen, bitte wähle einen Film aus: $filmListe")
    val chosenMovie = readln()
    val removedSucc = filmListe.remove(chosenMovie)
    return removedSucc
}