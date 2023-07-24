package VORLESUNG.W06.d01

class Car {
    var brand: String = "VW"
    var color: String = "rot"
    var ps: Int = 90
    var erstZulassung: Int = 2020
    var anzahlGänge: Int = 6

    fun printInfo(){
        println("Marke: $brand")
        println("Farbe: $color")
        println("PS: $ps")
        println("Erstzulassung: $erstZulassung")
        println("Anzahl der Gänge: $anzahlGänge")
    }

    fun startCar(){
        println("brrrrrrruumm")
        println("Das Auto ist gestartet.")
    }



}