import VORLESUNG.W07.Pokemon.Type

class PflanzenPokemon(name: String, level: Int): Pokemon(name, Type.PFLANZE,level) {


    override fun printAttacks() {
        // rufe printAttacks aus der Elternklasse Pokemon auf.
        super.printAttacks()
        println("[2] -> Rasierblatt (${ap*2} Schaden)")
        println("[3] -> Solarstrahl (${ap*3} Schaden)")
    }

    override fun chooseAttack(gegner: Pokemon) {
        // super.chooseAttack(gegner)
        printAttacks()
        var inputFalse = true
        while (inputFalse) {
            // Fehler abfangen
            // Option 1: try catch
            try {
                val choice = readln().toIntOrNull() // Option 2: toIntOrNull() benutzen
                when (choice) {
                    1 -> tackle(gegner)
                    2 -> rasierBlatt(gegner)
                    3 -> solarStrahl(gegner)
                   //  null -> chooseAttack(gegner) - Teil von Option 2
                }
                // Option 3: while Schleife um try catch mit Hilfsvariable
               inputFalse = false
            } catch (ausnahme: Exception) {
                println("Ups! $ausnahme")
                println("Ungültige Eingabe, du musst eine Zahl zwischen 1-3 eingeben. Versuch's nochmal!")
                printAttacks()
                // Option 4 Default Wert nehmen statt nochmal zurückzugehen
                // println("Du hast keien gültige Eingabe gemacht. Per Default greift $name mit Tackle an!")
                // tackle(gegner)
                // chooseAttack(gegner) -> Funktion von vorne starten
            }
        }
        // hier geht's weiter
    }

    fun solarStrahl(gegner: Pokemon) {
        println("$name greift mit Solarstrahl (${ap*3} Schaden) an!")
        Thread.sleep(500)
        gegner.hp -= ap*3
        println("${gegner.name} hat ${ap*3} HP verloren und jetzt noch ${gegner.hp} übrig!")
        Thread.sleep(500)
        gainEP(ap*3)
        levelUp()

    }

    fun rasierBlatt(gegner: Pokemon) {
        println("$name greift mit Rasierblatt (${ap*2} Schaden) an!")
         Thread.sleep(500)
        gegner.hp -= ap*2
         println("${gegner.name} hat ${ap*2} HP verloren und jetzt noch ${gegner.hp} übrig!")
         Thread.sleep(500)
         gainEP(ap*3)
         levelUp()
    }


}