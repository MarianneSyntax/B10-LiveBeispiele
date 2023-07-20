package VORLESUNG.`W05-Schleifen`.d04

fun main(){

    // count: zählt, wie oft das gesuchte Element vorkommt
    val text: String = "Das sind zwei as"
    val searchedChar = 'a'
    val aCounter = text.count { x ->
        x == searchedChar }

    // count: Zählt alle Elemente, bei denen die Bedingung stimmt
    // Das hier: ideale Lösung mit it, erspart uns Tipparbeit und Kopfzerbrechen über Parameternamen
    val aCounterShort = text.count {it == searchedChar }
    println("Nutzung count: Anzahl an a's in \"$text\" = $aCounterShort")
    println("---")

    // filter
    val reviews: List<Int> = listOf(2,2,4,5,3,4,2,4,2)

    // zum Vergleich: filter mit for Schleife
    val goodReviews: MutableList<Int> = mutableListOf()
    for (review in reviews){
        if (review >= 4){
            goodReviews.add(review)
        }
    }
    // filter: filtert alle Elemente raus, bei denen die Bedingung stimmt, speichert sie in neuer Liste
    val goodReviewList = reviews.filter { review -> review >= 4 }
    val goodReviewsWithIt = reviews.filter { it >= 4 }
    println(goodReviewsWithIt)


    println("---")

    // sortedBy: sortiert entweder aufsteigend (mit it.eigenschaft: nach einer Eigenschaft (wie length)
    val fruits = listOf("watermelon", "apple", "kiwi","oranges", "mangoe")
    // einfach nur it: wird aufsteigend sortiert (abc, numerisch)
    val sortedByAbcFruits = fruits.sortedBy { it }
    // it.length: wird nach der Länge sortiert (kürzeste Frucht zuerst)
    val sortedByLengthFruits = fruits.sortedBy { it.length }
    println("Ergebnis von sortedByLength: $sortedByLengthFruits")
    println("Ergebnis von sortedByABC: $sortedByAbcFruits")
    println("---")

    // sortedByDescending: descend = absteigen, sortiert absteigend
    val sortedDescByAbcFruits = fruits.sortedByDescending { it }
    // it.length: wird nach der Länge sortiert (kürzeste Frucht zuerst)
    val sortedDescByLengthFruits = fruits.sortedByDescending { it.length }
    println("Ergebnis von sortedDescByLength: $sortedDescByLengthFruits")
    println("Ergebnis von sortedDescByABC: $sortedDescByAbcFruits")
    println("---")

    // sortedBy with numbers
    val numbers = mutableListOf(1,2,4,6,8,11,22,44,15,67,68)
    val sortedNumbers = numbers.sortedBy { it }
    println(sortedNumbers)

    // klappt mit strings nicht wie man erwartet, sind keine zahlen.
    val numbersString = listOf("1","11","21","43","68","12","3")
    val sortedStringNumbers = numbersString.sortedBy { it }
    println(sortedStringNumbers)


    // forEach: geht jedes Element durch und wir können darauf zugreifen und zB drucken. nicht bearbeiten! das geht nur mit map
    var numbersPlusOne = numbers.forEach {
        println(it)
    }
    println("---")


    // minBy: sucht kleinstes Element raus
    val smallestNumber = numbers.minBy { it }
    println("Nutzung minBy: $smallestNumber")

    println("---")

    // maxBy: sucht größte Zahl raus
    val biggestNumber = numbers.maxBy { it }
    println("Nutzung maxBy: $biggestNumber")
    println("---")

    // sucht größtes Element nach Länge raus
    val longestFruit = fruits.maxBy { it.length }
    println("Nutzung maxBy mit fruits: $longestFruit")
    println("---")

    // any: true oder false: gibt es irgendein ein Element, das die Bedingung erfüllt? (Zahl gerade)
    var doesEvenNrExist = numbers.any { it%2 == 0 }
    println("Ergebnis any: Gibt es eine Gerade Zahl in der numbers Liste? -> $doesEvenNrExist")
    println("---")

    // all: true oder false: erfüllen ALLE Elemente in der Liste die Bedingung? (durch 2 teilbar)
    var areAllNrsEven = numbers.all { it%2 ==0 }
    println("Ergebnis all: alle durch 2 teilbar? -> $areAllNrsEven")

    println("---")

    // map: führt Operation in den { } für jedes Element aus. damit können wir Elemente bearbeiten
    var numbersTimesTwo = numbers.map { it*2 }
    println("Ergebnis map mit Int: $numbersTimesTwo")

    var fruitsWithS = fruits.map { it + "s" }
    println("Ergebnis map mit Strings: $fruitsWithS")


    println("---")

    // in Kombination benutzen: gerade zahlen rausfiltern, erhöhen: machen wir morgen zsm

            // gerade Zahlen rausfiltern

            // gerade Zahlen *2 nehmen




    println("---")


    val words = listOf("apple", "banana", "cherry", "watermelon")

    // Mehrere Lambdas zusammen benutzen: machen wir morgen zsm
    // nur wörter länger als 5 speichern
    // diese wörter alphabetisch sortieren
    // und in ALL CAPS schreiben


}