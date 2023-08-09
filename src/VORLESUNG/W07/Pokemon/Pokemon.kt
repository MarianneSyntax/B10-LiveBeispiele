// Primärer Konstruktor: direkt beim Erstellen der Klasse
class Pokemon(var name: String, var type: String, var level: Int = 1) {

    var hp: Int
    var ep: Int
    var ap: Int

    // init Block: da der Primäre Konstruktor keinen eigenen Körper hat (der Körper ist ja einfach die gesamte Klasse), brauchen wir den init Block. Der wird, wie die Körper der sekundären Konstruktrionen, immer bei Initialisieren = Erstellen eines konkreten Pokemons aufgerufen
    init {
        this.hp = level*10
        this.ep = 0
        this.ap = level*3

        println("----Primärer Konstruktor Call im init-Block----")
        println("Pokemon $name wurde auf Level $level initialisiert.")
        Thread.sleep(500)
        println("$name hat $ap AP und folgende Attacken:")
        Thread.sleep(500)
        println("Tackle (${level+ap} Schaden)")
        Thread.sleep(500)
        println("--Primäre Konstruktion beendet--")

    }

    fun flaechenAttacke(gegnerList: MutableList<Pokemon>){
        for (gegner in gegnerList){
            tackle(gegner)
        }
    }

    fun levelUp(){
        if (this.ep >= 10) {
            println("$name hat $ep EP, das heißt es wird hochgelevelt!")
            println("Vorheriges Level: $level")
            this.level += 1
            ep = ep-10
            println("Neues Level: $level")
            println("Neuer EP Stand: $ep")
        }
    }

    fun tackle(gegner: Pokemon){
        println("$name greift mit Tackle ($ap Schaden) an!")
        // gegner verliert hp:
        gegner.hp -= ap
        println("${gegner.name} hat $ap HP verloren und jetzt noch ${gegner.hp} übrig!")
        gainEP(ap*4)
        levelUp()
    }

    fun gainEP(ep: Int) {
        this.ep += ep
        println("$name hat $ep EP erhalten und jetzt ${this.ep} EP.")

    }


    // seknundärer Konstruktor
    constructor(name: String) : this(name, "Normal"){
        println("---Sekundärer Konstruktor Call---")
        Thread.sleep(500)
        println("Ein Pokemon namens $name mit Default den Typ 'Normal' wurde angelegt.")
        Thread.sleep(500)
        println("---Sekundäre Konstruktion beendet---")
    }

    // dritter construktor
    constructor(name: String, gender: Boolean) : this(name,"Wasser") {
        Thread.sleep(500)
        println("--Tertiär Konstruktor Call--")
        Thread.sleep(500)
        println("Pokemon mit Namen $name und Geschlecht $gender (true = w, false = m) erstellt.")
        Thread.sleep(500)
        println("--Tertiär Konstruktion beendet--")
    }

}