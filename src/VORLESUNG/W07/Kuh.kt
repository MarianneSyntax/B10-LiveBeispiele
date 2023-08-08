import VORLESUNG.W07.Tier

class Kuh : Tier {

    var gibtMilch: Boolean

    constructor(name: String, gewicht: Double, alter: Int, geschlecht: String) :
            super(name, gewicht, alter, geschlecht) {
        gibtMilch = alter >= 3 && geschlecht == "Weiblich"
    }

    override fun geraeuscheMachen() {
        println("Muuuh")
    }

    fun melken() {
        if (gibtMilch) {
            println("Besucher melkt das Tier $name und erhält einen Eimer voll Milch!")
        } else {
            println("$name schaut Besucher komisch an. Hier gibt es keine Milch zu holen.")
        }
    }
}