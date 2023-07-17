package VORLESUNG.`W05-Schleifen`.D01

fun main(){

    // simples Repeat: ohne Variable
    repeat(5){
        println("Hello World!")
    }

    // Repeat: mit Variable, einer weiteren Anweisung: Counter bei jedem Durchlauf erhöhen
    var counter = 1
    var weekDays = 7
    repeat(weekDays){
        println("Heute ist der $counter Wochentag.")
        counter++ // gleich wie: counter = counter+1, gleich wie: counter += 1
    }

    repeatWithPower()

}

fun repeatWithPower() {
    // Repeat: Potenz ausrechnen, indem die basis exponent Male mit sich selbst malgenommen wird (hier: 2 hoch 3 / 2^3 / 2 * 2 * 2, Ergebnis: 8)
    var base = 2
    var exponent = 3
    var result = 1

    repeat(exponent){
        result *= base
        println("Zwischenergebnis: $result")
    }
    println("$base hoch $exponent ergbit $result")
}
