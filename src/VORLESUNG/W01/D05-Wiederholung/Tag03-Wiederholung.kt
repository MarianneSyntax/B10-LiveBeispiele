package VORLESUNG.W01.`D05-Wiederholung`

fun main(){

    // Mathematische Operationen:
    var intSum = 30+70
    var doubleDiff = 10.5-7.5
    var product = 8*8
    var divident = 15.0/3.0
    var rest = 90%20

    // Type Conversion
    var stringValue: String = readln() // "30" -> String, kann man nicht mit rechnen

    var convertedString = stringValue.toDouble() // String in eine Zahl, nämlich Double, umwandeln
    println("${stringValue+5}") // String + 5
    println("ConvertedString (also ein Double) +5: ${convertedString+5}")

    var doubleValue = convertedString
    var convertedDouble = convertedString.toInt()


}