package VORLESUNG.`W05-Schleifen`.d03

fun main(){
    val numbersList = listOf(22,34,88,99,6,4,7)

    // 3. größte Zahl in Liste finden
    // 4. jede 2. Zahl in Liste modifizieren

    // Beispiel aus der VL:
//    for (i in listOf(3,33,333)){
//        println(i*i)
//    }

    // 1. simple for in schleife mit absteigender range
    for (i in numbersList.size-1 downTo 0){ // .. geht hier nicht, nur aufsteigend
        print("$i ,")
    }
    println()

    println("-----")

    for (j in 'z' downTo 'a'){
        print("$j, ")
    }
    println()

    println("-----")

    val movies = mutableListOf("Harry Potter", "Der Herr der Ringe", "The Hunger Games")

    // 2. strings modifizieren: an jeden Film eine 2 hängen
    for (movie in movies.indices){
        movies[movie] = "${movies[movie]} 2"
        println(movies[movie])
    }






}
