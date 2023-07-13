package CHECKPOINTS.Musterloesungen.Videothek

// Die FilmListe hat alle unsere Filme
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
    "Batman"
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to generateRandomPrice(),
    "Indiana Jones" to generateRandomPrice(),
    "Die Hard" to generateRandomPrice(),
    "The Shawshank Redemption" to generateRandomPrice(),
    "Schindler's List" to generateRandomPrice(),
    "The Godfather" to generateRandomPrice(),
    "Star Wars" to generateRandomPrice(),
    "The Matrix" to generateRandomPrice(),
    "The Lord of the Rings" to generateRandomPrice(),
    "Batman" to generateRandomPrice()
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
    "The Lord of the Rings" to "Science Fiction/Fantasy",
    "Batman" to "Action"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(), // MutableList<Int>
    "Indiana Jones" to generateRatings(), // [4,8,3,4,9,6,1]
    "Die Hard" to generateRatings(), // [2,6,4,9,1,3,2]
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Matrix" to generateRatings(),
    "The Lord of the Rings" to generateRatings(),
    "Batman" to generateRatings()
)

