package VORLESUNG.W07.WiederholungStreichelzoo

open class Tier(
    var name: String,
    var gewicht: Double,
    val alter: Int,
    val geschlecht: String
) {
    fun bewegung() {
        println("$name bewegt sich durchs Gehege.")
    }

    open fun geraeuscheMachen() {
        println("Das Tier $name macht ein Geräusch!")
    }

    fun streicheln() {
        println("Der Besucher streichelt das Tier $name.")
    }

    open fun fuettern() {
        println("Besucher gibt $name etwas zu Essen. $name stürzt sich aufs Essen und frisst sich satt.")
        gewicht *= 1.02
    }
}

fun main(){

    var tier1 = Tier("Betty", 10.0,5,"w")
    var tier2 = Tier("Alfie", 10.0,5,"m")

    var kuh1 = Kuh("Milka",100.0,4,"w")
    kuh1.bewegung()
    println("Gibt ${kuh1.name} Milch? --> ${kuh1.gibtMilch} ")
    var kuh2 = Kuh("John",100.0,4,"m")
    var kuh3 = Kuh("Josie",100.0,2,"w")
    println("Gibt ${kuh2.name} Milch? --> ${kuh2.gibtMilch} ")
    println("Gibt ${kuh3.name} Milch? --> ${kuh3.gibtMilch} ")
    kuh2.geraeuscheMachen()

    var huhn1 = Huhn("Gockel", 9.0, 5, "m")
    println("${huhn1.name} Eier: ${huhn1.anzahlEierProTag}")

    var huhn2 = Huhn("Kathi",8.0,3,"w",3)
    println("${huhn2.name} Eier: ${huhn2.anzahlEierProTag}")
    huhn2.geraeuscheMachen()
    huhn1.bewegung()

    var kueken = Huhn("Tweetie")
    println("Kueken ${kueken.name} Eigenschaften: ${kueken.gewicht}, ${kueken.alter}")



}