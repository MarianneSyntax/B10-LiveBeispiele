package VORLESUNG.W03.D02

// Funktionen, die etwas zurückgeben (=returnen):

fun randomGreeting() : String {
    println("Wie ist dein Name?")
    var name = readln()
    var randomGreetings = listOf("Bonjour", "Moin", "Hola", "Hello")
    var randomGreeting = randomGreetings.random()
    var string = "$randomGreeting, $name!"
    return string
}

// zufälligen namen zurückgeben
fun randomName() : String {
    var firstNames: List<String> = listOf("Johnny", "James", "Jason")
    var lastNames = listOf("Smith", "Wayne", "Kennedy")

    var randomFirstName = firstNames.random()
    var randomSndName = lastNames.random()

    var fullNameWithVariables = "$randomFirstName $randomSndName"
    var fullNameWithoutVariables = "${firstNames.random()} ${lastNames.random()}"

    return fullNameWithVariables

}

// summe berechnen, zurückgeben
fun sum() : Double {
    var number1 = 20.0
    var number2 = 30.0
    return number1+number2
}

// selbe rechnung, kürzere schreibweise
fun shortSum(): Double {
    return 20.0 + 31.0
}

fun shortSumSum(): Double {
    return sum()+shortSum()
}

fun sumSum() : Double {
    var sum1 = sum()
    var sum2 = shortSum()
    var sumsum = sum1 + sum2
    return sumsum
}
// integer einlesen, zurückgeben

fun readlnInteger() : Int {
    println("Bitte ein Int eingeben: ")
    var number: Int = readln().toInt()
    return number
    // return readln().toInt()
}

// rausfinden, ob eingelesenes Integer gerade ist, zurückgeben
fun isNumberEven() : Boolean {
    var input: Int = readlnInteger()
    return input % 2 == 0
}

fun main(){
    var greeting = randomGreeting()
    println(greeting)
    var randomName = randomName()
    println(randomName)
    var sumResult = sum()
    // Wenn eine Funktion einen Return-Wert hat, kann direkt mit der Funktion weitergearbeitet werden
    println("Direkt mit Funktionsaufruf drucken: ${sum()}")
    println("Direkt mit kurzem Funktionsaufruf (Variablen werden eingespart) drucken: ${shortSum()}")
    println("Mit Variable sumResult drucken: $sumResult")
    println(sumSum())

    var number: Int = readlnInteger()
    println("Ergebnis: ${number + sumResult}")

    println(isNumberEven())


}


