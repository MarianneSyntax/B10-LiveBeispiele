package VORLESUNG.W04.D04

import java.util.*
import kotlin.math.min

fun main(){

    // Fehler produzieren: Double mit readln()
    println("Bitte Kommazahl eingeben...")
    var beforeDouble = readln().replace(",",".")
    var double = beforeDouble.toDouble()

    println("eingegebenes double: $double")

    // mögliche Lösung: replaceAll() ?




}