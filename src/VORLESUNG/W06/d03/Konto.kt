package VORLESUNG.W06.d03

class Konto(var name: String, var betrag: Double, var pin: Int) {

    init {
        println("Konto mit 1. Konstruktor initialisiert: $name, $betrag, $pin")
    }

    // 2. Konstruktor: Nur Name beim Erstellen angeben
    constructor(name: String): this(name,10.0, 1111){
        println("Konto mit 2. Konstruktor initialisiert: $name")
        println("Default Betrag: $betrag, Default Pin: $pin")
    }

    // 3. Konstruktor: nur Name und Betrag beim Erstellen angeben
    constructor(name: String, betrag: Double) : this(name,betrag, 1111 ){
        println("Konto mit 3. Konstruktor initialisiert: $name")
    }

    fun changePin(){
        println("Bitte Alte Pin eingeben:")
        var altePin = readln().toInt()
        if (this.pin == altePin) {
            println("Bitte Neue Pin eingeben:")
            this.pin = readln().toInt()
        } else println("Falsche alte Pin eingegeben. Pin kann nicht geändert werden.")
    }


}

fun main(){
    var k1 = Konto("Max Mustermann", 100.0,1111)
    println("------")
    var k2 = Konto("Dagobert Duck")
    println("------")
    var k3 = Konto("Richie Rich", 9999.99)
    k1.changePin()
    println("Neue Pin: ${k1.pin}")
}