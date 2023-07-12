package VORLESUNG.W04.D03

fun main(){

    //triggerNullPointerEx(null)
    //triggerArithmeticEx()
    triggerIndexOutOfBounds(listOf(1,2))

    println("Wenn du das hier siehst, wurde die Exception korrekt abgefangen und das Programm ist danach weitergelaufen.")
}

fun triggerIndexOutOfBounds(list: List<Int>){
    try{
        val element = list[5]
        println("Das 5. Element in der Liste ist: $element")
    } catch (e: Exception) {
        println("Fehler! $e")
    }

}

fun triggerNullPointerEx(string: String?): Int {
    try {
        val length = string!!.length
        println("Die Length ist $length")
        return length
    } catch (e: Exception){
        println("Fehler: $e")
    }
    println("Fehler aufgetreten, fehlende length wird mit -1 ersetzt")
    return -1

}

fun triggerArithmeticEx() : Int {
    var result = 0
    try {
        result = 10 / 0
        println("Ergebnis der Rechnung: $result")
        return result
    } catch (e: Exception) {
        println("Oh nein, Fehler! $e")
        // Standardmäßig -1 in result schreiben, falls was schief läuft
        result = -1

    }

    println("Hier kommen wir nur an, wenn das Programm nicht abstürzt")
    println("Result ist jetzt $result")
    return result
}