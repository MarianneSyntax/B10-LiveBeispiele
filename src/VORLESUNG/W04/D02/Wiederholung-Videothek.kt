package VORLESUNG.W04.D02

val filmListe = mutableListOf<String>(
    "The Dark Knight",
    "Indiana Jones",
    "Die Hard",
    "The Shawshank Redemption",
    "Schindler's List",
    "The Godfather",
    "Star Wars",
    "The Matrix",
    "The Lord of the Rings",
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to 1.0,
    "Indiana Jones" to 1.0,
    "Die Hard" to 1.0,
    "The Shawshank Redemption" to 1.0,
    "Schindler's List" to 1.0,
    "The Godfather" to 1.0,
    "Star Wars" to 1.0,
    "The Matrix" to 1.0,
    "The Lord of the Rings" to 1.0
)

// Diese Map speichert das Genre zu jedem Filmtitel
val filmToGenre = mutableMapOf(
    "The Dark Knight" to "Action/Adventure",
    "Indiana Jones" to "Action/Adventure",
    "Die Hard" to "Action/Adventure",
    "The Shawshank Redemption" to "Drama",
    "Schindler's List" to "Drama",
    "The Godfather" to "Drama",
    "Star Wars" to "Science Fiction/Fantasy",
    "The Matrix" to "Science Fiction/Fantasy",
    "The Lord of the Rings" to "Science Fiction/Fantasy"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(),
    "Indiana Jones" to generateRatings(),
    "Die Hard" to generateRatings(),
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Matrix" to generateRatings(),
    "The Lord of the Rings" to generateRatings()
)


fun getFilmPrice(film: String): Double {
    return filmToPrice[film]?:0.0
//    return filmToPrice.getValue(film)
//    return filmToPrice.getOrDefault(film, 0.0)
//    return filmToPrice[film]!!
}

fun getFilmGenre(film: String): String {
//    return filmToGenre[film]?:"we don't have this film"

//    return filmToGenre.getValue(film)

    return filmToGenre.getOrDefault(film, "we don't have this film")

//    return filmToGenre[film]!!
}

fun getAverageRating(film: String): Double {
    var ratings = filmRatings.getValue(film)
    return ratings.average()

//    var avg = 0

//    ratings.forEach { avg += it }

//    return avg.toDouble() / ratings.size
}

fun getCheapestFilm(): String { // Double
//    return filmToPrice.minOf { it.value }

//    return filmToPrice.values.min()

    var minValue = filmToPrice.values.min()
    var index = filmToPrice.values.indexOf(minValue)
//    return filmListe[index]
    return filmToPrice.keys.elementAt(index)
}

fun getBestRatedFilm(): String { // Double
//    var best = filmRatings.values.maxOf { it.average() } (einfachster weg gibt aber nur wert)

//    var best2 = -1.0
//    repeat(filmRatings.size) {
//        best2 = max(best2, filmRatings.values.elementAt(it).average())
//    } (nicht so schöner weg, gibt auch nur wert)
    var averageRatingMap = mutableMapOf<String, Double>()
//    repeat(filmRatings.size) {
//        averageRatingMap[filmRatings.keys.elementAt(it)] = filmRatings.values.elementAt(it).average()
//    }
    filmRatings.forEach {averageRatingMap[it.key] = it.value.average()}
    var best = averageRatingMap.values.max()
    var bestIndex = averageRatingMap.values.indexOf(best)
    return averageRatingMap.keys.elementAt(bestIndex)
}

fun sortSortimentAlphabetically(): List<String> {
    return filmListe.sorted()
}

fun sortSortimentByPrice(): List<Pair<String, Double>> {
    return filmToPrice.toList().sortedBy { it.second } // Hab hier keinen anderen weg
}

fun removeFromSortiment(): Boolean {
    println("Available movies: $filmListe")
    println("Select a movie to remove:")
    var movieToRemove = readln()
    return filmListe.remove(movieToRemove)
}

// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int{
    return (1..5).random()
}

// Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
fun generateRatings(): MutableList<Int>{
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()){
        ratings.add(randomRating())
    }
    return ratings
}