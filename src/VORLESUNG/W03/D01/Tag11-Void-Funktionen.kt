package VORLESUNG.W03.D01


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