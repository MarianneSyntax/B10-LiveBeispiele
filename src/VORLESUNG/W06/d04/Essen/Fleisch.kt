package VORLESUNG.W06.d04.Essen

// Kinderklasse Fleisch, erbt von Lebensmittel
class Fleisch(name: String, preis: Double, val tierArt: String) : Lebensmittel(name, preis){

    override val isVegan = false

    constructor(name: String, tierArt: String) : this(name,6.99,tierArt)

    protected fun printTierArt(){
        println("Tierart: $tierArt")
    }

    override fun printInfo() {
        println("Informationen über das Fleisch:")
        //super.printInfo()
        println("Name: $name, Preis: $preis")
        printTierArt()
    }

    fun braten(){
        println("$name wird gebraten... Lecker.")
    }



}