package VORLESUNG.W06.d03.Vererbung

class Goldfisch(name: String) : Fish(name){

    init {
        println("Glodisch $name erstellt (Klasse Goldfisch)")
    }

    override fun printInfo() {
        super.printInfo()
        println("Unser Goldfisch heißt $name")
    }

    override fun eat() {
        println("Unser Goldisch $name ist am fressen.")
    }
}