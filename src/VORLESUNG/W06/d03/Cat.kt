package VORLESUNG.W06.d03

class Cat {
    var name: String
    var age: Int
    var breed: String
    var isSterilized: Boolean = false

    // 1. Konstruktor: basic infos
    constructor(name: String, age: Int, breed: String) {
        this.name = name
        this.age = age
        this.breed = breed

        println("Katze namens $name erstellt mit 1. Konstruktor.")
    }

    // 2. Konstruktor: Zusatzinformation zur Sterilization:
    constructor(name: String, isSterilized: Boolean) : this(name, 5,"Mischling") {
        println("Katze namens $name ist sterilisiert? $isSterilized, mit dem 2. Konstruktor initialisiert.")
    }

    // 3. Konstruktor: nur Namen angeben
    constructor(name: String) : this(name, 0,"Perser"){
        println("Katze namens $name mit dem 3. Konstruktor initialisiert.")
    }

}


fun main(){
    // Katze mit 1. Konstruktor erstellen:
    var catFirstK = Cat("Alfie", 5,"Perser")
    // Katze mit 2. Konstruktor erstellen:
    var sterilizedCat = Cat("Betty", false)
    // Katze mit 3. Konstruktor:
    var cat = Cat("Marley")
}

