package VORLESUNG.`W05-Schleifen`.d02


fun main() {

    // Pizza Beispiel mit for
//    var order = pizzaFor()
//    println(order)
//    countPizzaTypeWithIndices(order,"Salami")
//    countPizzaType(order,"Tonno")
//    countPizzaType(order,"Hawaii")
//    countPizzaType(order,"Mozarella")

    forWithString('i')


    // jedes 2. Element modifizieren mit Range und step

    // abc mit chars printen

    // strings modifizieren

}

// basic for schleife, die jedes listenelement ausgibt mit in: Pizza

fun pizzaFor(): MutableList<String> {
    var pizzaOrder: MutableList<String> = mutableListOf()
    for (pizza in 1..100) {
        pizzaOrder.add(PIZZAS.random())
    }
    return pizzaOrder
}


// for schleife, um pizza sorte zu zählen: ohne indizes, wir greifen direkt auf jedes Listenelement zu
fun countPizzaType(pizzaList: MutableList<String>, pizzaType: String){
    var counter = 0
    for (pizza in pizzaList){ // pizza = direkt das Element in der Liste, also ein String, zB Salami
        // WENN pizza = der übergebene PizzaTyp ist, dann einen Counter erhöhen
        if (pizza == pizzaType) {
            println("$pizzaType gefunden an Stelle $pizza in der Liste!")
            counter++
        }
    }
    println("Die Pizzasorte $pizzaType kommt $counter Male in der Bestellung vor!")
}

// mit Indizes: wir greifen auf den Index zu, nicht das Element, das darin liegt:
fun countPizzaTypeWithIndices(pizzaList: MutableList<String>, pizzaType: String){
    var counter = 0
    for (i in pizzaList.indices){ // i = nicht direkt das Element in der Liste, also ein String, SONDERN: der Index
        // WENN pizza = der übergebene PizzaTyp ist, dann einen Counter erhöhen
        if (pizzaList[i] == pizzaType) {
            println("$pizzaType gefunden an Stelle $i in der Liste!")
            counter++
        }
    }
    println("Die Pizzasorte $pizzaType kommt $counter Male in der Bestellung vor!")
}



// for schleife, die jedes 2. element modifiziert (ints mit step?)

// buchstaben zählen

fun forWithString(searchedLetter: Char){
    var text = "It's me, hi, I'm the problem it's me."
    text = text.lowercase()
    var counter = 0
    for (letter in text){
        if (letter == searchedLetter){
            counter++
        }
    }
    println("Der Buchstabe $searchedLetter kommt $counter Male im Satz $text vor.")

}



// beispiel: abc mit Chars

// beispiel: listenelemente modifizieren mit string


// geschachtelte for Schleife: Schachbrett

