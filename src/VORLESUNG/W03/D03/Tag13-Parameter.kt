package VORLESUNG.W03.D03

fun inputPerson(): String {
    println("Bitte Namen eingeben:")
    return readln()
}

fun greetPerson(name: String){
    // das geht nicht: name = "Leon". Parameter sind immer Konstanten
    println("Hello, $name! Willkommen!")
}


fun add(x: Double, y: Int): Int { // Diese Funktion hat denselben Namen wie die darüber, aber dadurch, dass die Parameter andere Datentypen haben, kann der Compiler die beiden auseinanderhalten

    //var result = num1+num2
    //return result
    return y+x.toInt()
}

fun add(x: Boolean, y: Int) : Boolean { // Diese Funktion genauso: hat einen Boolean in den Params, das heißt, sie wird als gültige Funktion erkannt
    //var result = num1+num2
    //return result
    return x
}

fun add(num1: Int, num2: Int) : Int {
    //var result = num1+num2
    //return result
    return num1+num2
}

// Funktion schreiben, die 2 Zahlen (Parameter) multipliziert und das Ergebnis zurückgibt

// Funktion schreiben, die mir einen String, der aus 2 übergebenen Strings zusammengesetzt wurde, zurückgibt
fun sentence(string1: String, string2: String) : String {
    var fullString: String = string1 + " " + string2
    return fullString
}

// Funktion mit Default Parameter:

fun calcPrice(anzahlProdukte: Int, preisProProdukt: Double, rabatt: Double = 0.0): Double {
    var gesamtPreis = anzahlProdukte * preisProProdukt

    var discountPreis = gesamtPreis - (gesamtPreis*rabatt) // 10 Euro - (10 Euro * Rabatt, zB 30% Rabatt: 10 Euro * 0,3 = 3 Euro) --> 10 Euro - 3 Euro = 7
    return discountPreis
}

fun makePancakes(eggs: Int, flour: Int, water: Int, milk: Int){
    println("$eggs Eier und $flour g Mehl werden vermischt...")
    Thread.sleep(5000) // 1000 milli = 1 Sekunde
    println("$milk ml Milch und $water ml Wasser werden hinzugegeben...")
    Thread.sleep(1000)
    println("Fertig ist der Teig!")
}

fun main(){
    // 30% Rabatt:
    var price = calcPrice(3,3.99, 0.3)
    println(price)

    // gar kein Rabatt: per Default ist der Rabatt 0.0
    calcPrice(3,1.99)

    println(sentence("Hello", "World!"))

    var number1 = 1
    var number2 = 2
    number1 = add(number1,number2) // in number1 das Ergebnis von number1+number2 reinschreiben
    var result = add(number1,number2) // oder in eine neue Variable :)

    var nummer = 1+2

    var multResult = mult(number1,number2) // 1*2 = 2

    var addResult = add(mult(number1,number2),number2) // 2 + 2 = 4

    makePancakes(4,250,190,250)
    makePancakes(10,1000,250,300)

    var name: String = inputPerson()
    println("Die eingegebene Person ist $name")
    println("Die eingegebene Person ist ${inputPerson()}")

    // 3 Arten, Argumente zu über geben:
        // 1. direkt Daten eingeben:
        greetPerson("Marlon")
        greetPerson("Jenny")
        greetPerson("Max")

        // 2. Variable benutzen:
        var person: String = "Simon"
        greetPerson(person)

        // 3. Funktionsaufruf, der erwarteten Datentyp zurückgibt, nutzen:
        greetPerson(inputPerson())
        greetPerson(readln())



    // bereits bekannte Funktionen mit Parametern:
    println(person)
    println("Hallo, $person")

    var x = 11
    var y = 12
    var z = 13

    var list: MutableList<Int> = mutableListOf(x,y,z,add(x,y))
    var listInts: MutableList<Int> = mutableListOf(11,12,13, add(20,100))

    listInts.add(13)
    list.add(z)
    list.add(0,50)
    list.add(50)









    // erdbeeren: kosten 2.99 pro Korb

    // Beispiel: Parameter, der nicht innerhalb der Funktion verändert werden kann



    // eine funktion als parameter übergeben

}



// multiplizieren, Ergebnis returnen



// 1. Funktion mit Parameter: greeting





// default parameter


// default parameter 2


