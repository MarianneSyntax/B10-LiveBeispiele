package VORLESUNG.W07.Pokemon

open class Pokemon(var name: String, var type: String, var level: Int = 1) {
    var hp: Int
    var ep: Int
    var ap: Int

    init {
        hp = level * 10
        ep = 0
        ap = level * 3
        println("--Initialisierung--")
        println("Pokemon $name wurde auf Level $level initialisiert.")
        Thread.sleep(500)
        println("$name hat $ap AP und folgende Attacken:")
        Thread.sleep(500)
        println("Tackle (${level + ap} Schaden)")
        Thread.sleep(500)
        println("--Initialisierung beendet--")
    }

    constructor(name: String): this(name,"Normal"){
        println("-Sekundäre Initialisierung-")
        println("Ein Pokemon namens $name ohne Typ wurde angelegt.")
        println("Das Pokemon erhält den Typ 'Normal'")
        println("-Sekundäre Initialisierung beendet-")
    }

    constructor(name: String, gender: String) : this(name, "Normal",1) {
        println("- Tertiäre Initialisierung-")
        println("Das Geschlecht von $name ist $gender")
        println("-Tertiäre Initialisierung beendet-")
    }





    fun tackle(gegner: Pokemon) {
        println("$name greift mit Tackle an!")
        gegner.hp -= (level+4)
        gegner.checkHP()
        println("${gegner.name} verliert ${level+ap} HP und hat noch ${gegner.hp} HP!")
        gainEP(level+ap)
    }

    fun checkHP() {
        if (hp >= 0) {
            println("$name hat noch $hp HP.")
        } else println("$name hat keine HP übrig!")
    }

    fun gainEP(ep: Int) {
        this.ep += ep
        println("$name hat $ep EP erhalten.")

        if (this.ep >= 10) {
            levelUp()
        } else println("Noch ${10-ep} EP bis zum nächsten Level!")

    }

    private fun levelUp() {
        level++
        ep = 10-ep
        ap += 5
        println("$name hat das Level erhöht! Es ist jetzt auf Level $level.")
    }

    open fun chooseAttack(gegner: Pokemon) {
        printAttacks()
        var choice = readln().toInt()
        when (choice){
            1 -> tackle(gegner)
        }
    }

    fun heuler(gegner: Pokemon) {
        println("$name greift mit Heuler an!")
        println("$name stößt ein schrilles Kreischen aus. Es ist nicht besonders effektiv!")
        gegner.hp -= (level-1)
        println("${gegner.name} hat noch ${gegner.hp} HP")
    }

    open fun printAttacks() {
        println("$name greift an! Wähle eine Attacke aus:")
        Thread.sleep(500)
        println("[1] -> Tackle (${level+4} Schaden")

    }

    fun randomAttack(gegner: Pokemon) {
        var random = listOf(1,2).random()
        when(random){
            1 -> tackle(gegner)
            2 -> heuler(gegner)
        }
    }

    fun stillAlive() : Boolean {
        if (hp <= 0) {
            println("$name's HP sind unter 0 gefallen! $name ist besiegt!")
            return false
        }
        else return true
    }
}



    fun main() {
        val taubsiW = Pokemon("Taubsi", "w")
    }

