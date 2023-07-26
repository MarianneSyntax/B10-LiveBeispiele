package VORLESUNG.W06.d03.Vererbung

// Mutterklasse: Vehicle (Fahrzeug)
// open = wird vererbt / kann überschrieben werden
open class Vehicle(val brand: String, val model: String) {
    open val vehicleType: String = "Vehicle"

    open fun startEngine() {
        println("Motor von $vehicleType $brand $model starten.")
    }
}

// Kindklasse: Auto erbt von Vehicle
class Car(brand: String, model: String, val numDoors: Int) : Vehicle(brand, model) {
    // override = überschreibe die Variable vehicleType aus Vehicle mit neuem Wert
    override val vehicleType: String = "Car"

    init {
        println("Auto erstellt. Dieses Auto hat $numDoors Türen (Init-Block Car)")
    }

    // override = überschreibe die Funktion mit neuen Logik
    override fun startEngine() {
        super.startEngine() // Call the startEngine() method of the base class
        println("Auto $brand ist fertig zum losfahren.")
    }
}

// Kindklasse: Motorrad erbt von Vehicle
class Motorcycle(brand: String, model: String, val numWheels: Int) : Vehicle(brand, model) {
    override val vehicleType: String = "Motorcycle"

    override fun startEngine() {
        println("Brrrr Motorrad mit $numWheels Rädern startet.")
    }
}

fun main() {
    val car = Car("Toyota", "Corolla", 4)
    car.startEngine()
    val motorcycle = Motorcycle("Honda", "CBR", 2)
    motorcycle.startEngine()
}
