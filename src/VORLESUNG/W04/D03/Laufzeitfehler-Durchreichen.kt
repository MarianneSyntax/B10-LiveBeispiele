package VORLESUNG.W04.D03

// Das hier ist ein abstraktes Beispiel dafür, wie ein Wert von Funktion zu Funktion weitergereicht wird, um damit an verschiedenen Stellen im Projekt zu arbeiten. Wird beim Durchreichen nicht vernünftig in jedem Schritt try catch angewandt, stürzt das Programm ab.


fun functionA(): Int {
    try {
        val result = 10 / 0
        println("Result in functionA : $result")
        return result
    } catch (e: Exception) {
        println("Exception caught in functionA: ${e.message}")
        throw e // Gibt die Exception statt des gewünschten Int-Werts zurück, muss also dort, wo functionA() aufgerufen wird (in functionB()) abgefangen werden
    }
}

fun functionB(): Int {
    try {
        return functionA()
    } catch (e: Exception) {
        println("Exception caught in functionB: ${e.message}")
        throw e // Rethrow the exception
    }
}

fun main(){
    // hier haben wir kein try catch, das heißt, das Programm wird beim main()-Aufruf von functionB abstürzen!
    //try {
        var x = functionB()
        println(x)
//    } catch (e: Exception){
//        println("Exception caught in main: $e")
//    }

}
