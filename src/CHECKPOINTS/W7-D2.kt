package CHECKPOINTS

fun main() {
    var held = Held(100, "Roy")
    var schurke = Schurke(200, "Siegfired")

    /*
    held.feuerzauber((10..30).random(), schurke)
    held.feuerzauber((10..30).random(), schurke)
    held.feuerzauber((10..30).random(), schurke)
     */

    held.feuerzauber(schurke)
    held.feuerzauber(schurke)
    held.feuerzauber(schurke)

}

class Held(var hp: Int, var name: String) {

    /*
    fun feuerzauber(dmg: Int, gegner:Schurke ) {

        gegner.hp -= dmg
        println("Der Schurke hat jetzt ${gegner.hp} HP")
    }
     */
    fun feuerzauber(gegner:Schurke ) {
        var schaden = (10..30).random()
        gegner.hp -= schaden
        println("Der Schurke hat jetzt ${gegner.hp} HP")
    }

    fun gift(gegner:Schurke) {
        // 10% Schaden -> 90% bleiben übrig
        // 20% Heilen -> (gegner.hp * 1.2).toInt()
        var schaden = (10..30).random()
        gegner.hp = (gegner.hp * 0.9).toInt() // 0.9 sind 90 %
        println("Der Schurke hat jetzt ${gegner.hp} HP")
    }


}

class Schurke(var hp: Int, var name: String) {

    fun schwerthieb() {

    }

}