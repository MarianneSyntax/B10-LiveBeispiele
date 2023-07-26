package VORLESUNG.W06.d03.Vererbung

 open class Fish(name: String) : Animal(name,false,true){

    init {
        println("Fisch $name erstellt (Klasse Fisch)")
    }

    override fun eat() {
        // super = nimm die eat funktion von der Superklasse (vererbenden Klasse/Basis/Mutter/Elternklasse)
        super.eat()
        println("Unser Fisch $name ist jetzt satt.")
    }

    override fun makeSound() {
        println("Fische machen keine Geräusche...")
    }


}

fun main(){
    println("---- Fisch -----")
    var fisch = Fish("Clownfisch")
    fisch.eat()
    fisch.makeSound()

    println("---- Goldfisch -----")
    var goldfisch: Goldfisch = Goldfisch("Goldie")
    goldfisch.eat()
    goldfisch.printInfo()
}