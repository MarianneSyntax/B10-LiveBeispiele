package VORLESUNG.W03

import VORLESUNG.W03.D01.calculateAge
import VORLESUNG.W03.D01.calculateSurface
import VORLESUNG.W03.D01.perimeter
import java.lang.Math.PI
import kotlin.math.roundToInt


// Greeting in Funktion auslagern
fun printGreeting(){
    println("Hallo, wie ist dein Name?")
    var name = readln()
    println("soso, dein Name ist also $name")
}

fun main(){
    // Greeting
    println("Es folgt der Funktionsaufruf:")
    println("------")
    printGreeting()
    println("------")
    println("Ende Funktionsaufruf.")

   calculateSurface()
   perimeter()
   calculateAge()
}












