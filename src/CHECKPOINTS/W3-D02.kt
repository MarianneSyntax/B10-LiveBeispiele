package CHECKPOINTS

import kotlin.math.*
fun main() {

    var list = mutableListOf<String>("Es", "Saw", "Harry Potter")
    var list2 = mutableListOf<String>("Oldboy", "Batman", "Joker")

    shuffleMovies(list)
    shuffleMovies(list2)

    println(list)
    println(list2)
}

fun shuffleMovies(list: MutableList<String>){
   return list.shuffle()
}








//fun getMovieTitel(        ): String {
//    val movies= listOf(
//        "Herr der Ringe",
//        "Star Wars",
//        "Harry Potter",
//        "Saw"
//    )
//    val movie = movies[index]
//    return movie
//}

fun getName(): String {
    val namen = listOf<String>("Max", "Peter", "Marie")
    var name = namen.random() // "Max"

    return name
}

//Funktionsdefinition
//fun addition():Int {
//    var num1 = 10
//    var num2 = 5
//    var res = num1 + num2
//    //println(res)
//    return res
//}