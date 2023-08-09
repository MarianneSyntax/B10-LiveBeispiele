//package VORLESUNG.W07.Pokemon
//
//class PflanzenPokemon(name: String, level: Int) : Pokemon(name,"Pflanze", level) {
//
//    init {
//        println("--Pflanzen Initialisierung--")
//        println("Pokemon $name ist vom Typ Pflanze: \n Stark gegen Typ Wasser, schwach gegen Typ Feuer.")
//        Thread.sleep(500)
//        println("Pflanzen-Attacken:")
//        Thread.sleep(500)
//        println("Rankenhieb (5 Schaden")
//        Thread.sleep(500)
//
//        if (level > 5){
//            Thread.sleep(500)
//            println("Rasierblatt (10 Schaden)")
//        }
//
//        if (level > 10){
//            Thread.sleep(500)
//            println("Solarstrahl (20 Schaden")
//        }
//        println("--Pflanzen Initialisierung beendet--")
//    }
//
//    fun evolve(){
//        if (level == 5){
//            Thread.sleep(500)
//            println("Bisasam entwickelt sich weiter... zu Bisaknosp!")
//            this.name = "Bisaknosp"
//        }
//        else return
//    }
//
//    fun rasierBlatt(gegner: Pokemon){
//        println("$name greift mit Rasierblatt an!")
//        if (gegner.type == "Feuer"){
//            println("Es ist nicht sehr effektiv!")
//            gegner.hp -= 6
//            gegner.checkHP()
//        }
//        else {
//            gegner.hp -= 10
//            println("${gegner.name} hat noch ${gegner.hp} HP.")
//        }
//        gainEP(level+ap)
//    }
//
//    fun solarStrahl(gegner: Pokemon) {
//        println("$name greift mit Solarstrahl an!")
//        if (gegner.type == "Feuer") {
//            println("Es ist nicht sehr effektiv!")
//            gegner.hp -= 16
//            gegner.checkHP()
//            gainEP(level + ap)
//        }
//    }
//
//    override fun printAttacks() {
//        println("$name greift an! Wähle eine Attacke aus:")
//        Thread.sleep(500)
//        println("[1] -> Tackle (${level+4} Schaden)")
//        Thread.sleep(500)
//        if (level > 5){
//            println("[2] -> Rasierblatt (10 Schaden)")
//        }
//
//        if (level >= 10){
//            Thread.sleep(500)
//            println("[3] -> Solarstrahl (20 Schaden")
//        }
//    }
//
//    override fun chooseAttack(gegner: Pokemon) {
//        printAttacks()
//        println("${gegner.name} hat noch ${gegner.hp} HP. Triff deine Wahl!")
//        var choice = readln().toInt()
//        when (choice){
//            1 -> tackle(gegner)
//            2 -> rasierBlatt(gegner)
//            3 -> solarStrahl(gegner)
//        }
//    }
//
//
//
//
//}
