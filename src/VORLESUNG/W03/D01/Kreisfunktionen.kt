package VORLESUNG.W03.D01

import kotlin.math.roundToInt
import VORLESUNG.W03.D01.perimeter

// Fläche eines Kreises. Formel: r * r * pi
fun calculateSurface(){
    println("Bitte gib den Radius deines Kreises ein:")
    var radius = readln().toDouble()
    var flaeche: Double = radius*radius* Math.PI
    // Nachkommastelle kuerzen: weiterrechenbar
    flaeche = (flaeche * 100.0).roundToInt() / 100.0
    // Nachkommastelle kuerzen: Zahl wird zum String, nicht ohne weiteres weiterrechenbar
    var stringFlaeche = String.format("%.2f",flaeche)
    println("Die Fläche deines Kreises mit einem Radius von $radius beträgt $flaeche")
}


// Umfang eines Kreises. Formel: 2 * r * pi
fun perimeter(){
    println("Bitte gib den Radius des Kreises an, dessen Umfang du berechnen möchtest:")
    var radius: Double = readln().toDouble()
    var umfang: Double = 2 * radius * Math.PI
    umfang = (umfang * 100.0).roundToInt() / 100.0
    println("Der Umfang des Kreises mit Radius $radius beträgt: $umfang")
}
