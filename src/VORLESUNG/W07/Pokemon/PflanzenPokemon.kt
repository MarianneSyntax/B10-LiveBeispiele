


class PflanzenPokemon(name: String, level: Int): Pokemon(name,"Pflanze",level) {


    override fun printAttacks() {
        // rufe printAttacks aus der Elternklasse Pokemon auf.
        super.printAttacks()
        println("[2] -> Rasierblatt (${ap*2} Schaden)")
        println("[3] -> Solarstrahl (${ap*3} Schaden)")
    }

    override fun chooseAttack(gegner: Pokemon) {
        // super.chooseAttack(gegner)
        printAttacks()
        var choice = readln().toInt()
        when(choice){
            1 -> tackle(gegner)
            2 -> rasierBlatt(gegner)
            3 -> solarStrahl(gegner)
        }

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