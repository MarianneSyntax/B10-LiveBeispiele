package VORLESUNG.W06.d03

class Ingredient(var name: String, var cost: Double) {

    init {
        println("Zutat initialisiert: $name, kostet $cost")
    }
}