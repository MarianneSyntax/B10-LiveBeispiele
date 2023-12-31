import VORLESUNG.W07.Pokemon.Type

// Primärer Konstruktor: direkt beim Erstellen der Klasse
open class Pokemon(var name: String, var type: Type, var level: Int = 1) {

    var hp: Double // Health Points = Lebenspunkte
    var ep: Double // Experience Points
    var ap: Double // Attack Points

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktoren, immer beim Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = level*10.0
        this.ep = 0.0
        this.ap = level*3.0

        println("----Primärer Konstruktor Call im init-Block----")
        println("Pokemon $name wurde auf Level $level initialisiert.")
        //Thread.sleep(500)
        println("$name hat $ap AP und folgende Attacken:")
       // Thread.sleep(500)
        println("Tackle (${level+ap} Schaden)")
       // Thread.sleep(500)
        println("--Primäre Konstruktion beendet--")

    }


    // sekundärer Konstruktor
    constructor(name: String) : this(name, Type.NORMAL){
        println("---Sekundärer Konstruktor Call---")
       // Thread.sleep(500)
        println("Ein Pokemon namens $name mit Default den Typ 'Normal' wurde angelegt.")
       // Thread.sleep(500)
        println("---Sekundäre Konstruktion beendet---")
    }

    // dritter Konstruktor
    constructor(name: String, gender: Boolean) : this(name,Type.WASSER) {
       // Thread.sleep(500)
        println("--Tertiär Konstruktor Call--")
       // Thread.sleep(500)
        println("Pokemon mit Namen $name und Geschlecht $gender (true = w, false = m) erstellt.")
       // Thread.sleep(500)
        println("--Tertiär Konstruktion beendet--")
    }

    fun flaechenAttacke(gegnerList: MutableList<Pokemon>){
        for (gegner in gegnerList){
            tackle(gegner)
        }
    }

    fun levelUp(){ // wir haben 27 EP
        while (ep >= 10) {
            Thread.sleep(500)
            println("$name hat $ep EP, das heißt es wird hochgelevelt!")
            Thread.sleep(500)
            println("Vorheriges Level: $level")
            Thread.sleep(500)
            println("Level wird erhöht...")
            level += 1
            ep-=10
        }
        println("$name's Level: $level")
        println("Übrige EP: $ep")
        println("EP bis zum nächsten Level: ${10-ep}")
    }

    fun tackle(gegner: Pokemon){
        println("$name greift mit Tackle ($ap Schaden) an!")
        Thread.sleep(500)
        // gegner verliert hp:
        gegner.hp -= ap
        println("${gegner.name} hat $ap HP verloren und jetzt noch ${gegner.hp} übrig!")
        Thread.sleep(500)
        gainEP(ap*2.0)
        levelUp()
    }

    fun gainEP(ep: Double) {
        this.ep += ep
        println("$name hat $ep EP erhalten!")
    }

    // printAttacks
    open fun printAttacks(){
        println("$name greift an! Such eine Attacke aus:")
        println("[1] -> Tackle ($ap Schaden)")
    }

    // chooseAttack
    open fun chooseAttack(gegner: Pokemon){
        printAttacks()

        var choice = readln().toInt()
        when(choice){
            1 -> tackle(gegner)
            // weitere Attacken implementieren
        }
    }

    // stillAlive(): gibt raus, ob Pokemon noch lebt
    fun stillAlive() : Boolean {
        if (hp <= 0) {
            println("$name's HP sind unter 0! $name ist besiegt!")
            return false
        } else {
            println("$name hat noch $hp HP.")
            return true
        }
    }

    open fun calculateAP(gegner: Pokemon){

        // wenn this pflanze
            // gegner feuer
                // unsere attacken -20%
                // gegner attacken +20%
            // gegner wasser
                // unsere attacken +20%
                // gegner attacken -20%

        // etc

        if (this.type == Type.FEUER){
            when(gegner.type){
                Type.WASSER -> {
                    this.ap *= 0.8
                    gegner.ap *= 1.2
                }
                Type.PFLANZE -> {
                    this.ap *= 1.2 // this ist 20% stärker
                    gegner.ap *= 0.8 // gegner ist 20% schwächer
                }
                // deckt Feuer und Normal ab
                else -> return

            }

        } else if (this.type == Type.WASSER) {
            when (gegner.type){
                Type.PFLANZE -> {
                    this.ap *= 0.8
                    gegner.ap *= 1.2
                }
                Type.FEUER -> {
                this.ap *= 1.2
                gegner.ap *= 0.8
                }
                // deckt Feuer und Normal ab
                else -> return
        }

        }

    }

}