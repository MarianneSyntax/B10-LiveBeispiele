package CHECKPOINTS


fun main() {


    //1.Auto
    var tesla = Car() //Hier wird ein Auto (Objekt) erzeugt
    tesla.marke = "Tesla"
    tesla.ps = 120
    tesla.farbe = "weiß"

    tesla.bremsen()
    tesla.vorstellen()

    //2.Auto
    var bmw = Car()

    bmw.marke = "BMW"
    bmw.ps = 130
    bmw.farbe = "Silber"


    bmw.bremsen()
    bmw.vorstellen()

}

// Blaupause
class Car {
    // Eigenschaften/Attribute der Klasse
    var marke: String = "Unbekannt"
    var ps: Int = 0
    var farbe: String = "Schwarz"

    // Methode
    fun bremsen() {
        println("Der $marke ist am bremsen")
    }

    fun vorstellen() {
        println("Die Automarke: $marke")
        println("Ps: $ps")
        println("Farbe: $farbe")

    }

}
