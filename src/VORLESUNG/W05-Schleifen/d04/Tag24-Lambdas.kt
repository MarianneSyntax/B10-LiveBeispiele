package VORLESUNG.`W05-Schleifen`.d04




fun main() {

    // greaterFive: normale Funktion
    fun greaterFiveFun(nr: Int): Boolean {
        val result = nr > 5
        println("$nr is greater than 5? -> $result")
        return result
    }
    // Aufruf von greaterFive
    greaterFiveFun(7) // true

     // Gegenüberstellung:
    // greaterFour als Lambda
    // Lambda kann in einer Variable gespeichert werden:
    var greaterFour = { nr:Int -> (nr>4) }

    // diese Variable kann dann wie eine Funktion verwendet werden:
    println("Bitte Int für greaterFour Aufruf eingeben")
    var x = greaterFour(readln().toInt()) // readln(), sodass Zahl eingegeben werden muss
    var y = greaterFour(9) // Zahl direkt als Argument übergeben

    // auch hier: Lambda in Variable speichern
    var addNrWith2 = {nr:Int -> nr+2}

    // mit dieser Variable dann aufrufen
    var zweiPlusZwei = addNrWith2(2)
    var dreiPlusZwei = addNrWith2(3)


     val planets = listOf("Mein ", "Vater ", "erklaert ", "mir ", "jeden ", "Sonntag ", "unsere ", "neun ", "Planeten")
    // Planeten Liste mit for-Schleife durchgehen
    for (planet in planets){
        print("$planet ")
    }
    println("")


    // Gegenüberstellung:

    // Planeten Liste mit forEach Lambda:
    // kurze Syntax mit it: Parameter kann weggelassen werden, it ist Schlüsselwort für das jeweilige Element
    planets.forEach { print("$it ") }
    println("")
    // längere Syntax: Parameter mit eigenem Parameternamen: muss dann mit name -> vor der Operation angegeben werden
    planets.forEach{ planet -> print("$planet ") }

}






