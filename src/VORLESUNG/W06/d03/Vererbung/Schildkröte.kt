package VORLESUNG.W06.d03.Vererbung


// default Werte für isFly und canSwim übergeben (Vergleich: Fish, da schreiben wir einfach direkt false und true rein, beides geht.)
class Schildkroete(name: String, canFly: Boolean = false, canSwim: Boolean = true) : Animal(name,canFly, canSwim){

    var isFed: Boolean = false

    init {
        println("Schildkröte namens $name instanziiert.")

    }

    // überschreibe die Funktion essen aus der Elternklasse Animal
    override fun eat() {
        // rufe die Funktion aus der Elternklasse Animal auf,
        super.eat()
        // füge eine Schildkröten-spezifisches println hinzu
        println("Schildkröten essen Pflanzen und Insekten.")
    }

    constructor(name: String, isFed: Boolean):this(name){
        println("Schildkröte $name mit 2. Konstruktor und isFed-Argument initialisiert.")
    }

}

fun main(){
    var sk = Schildkroete("Turtle",false)
    var sk2 = Schildkroete("Bello")
}