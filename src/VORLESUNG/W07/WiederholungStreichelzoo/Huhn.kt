package VORLESUNG.W07.WiederholungStreichelzoo

class Huhn(name: String, gewicht: Double, alter: Int, geschlecht: String) :  Tier(name, gewicht, alter, geschlecht) {

    var anzahlEierProTag: Int = 0


    constructor(name: String, gewicht: Double, alter: Int, geschlecht: String, anzahlEierProTag: Int) : this(name, gewicht, alter, geschlecht) {

        if (geschlecht == "w"){
            this.anzahlEierProTag = anzahlEierProTag
        }

    }

    constructor(name: String): this(name, 0.2,0,"w"){

    }

    override fun geraeuscheMachen() {
        super.geraeuscheMachen()
        println("ga-gack")
    }

}