package VORLESUNG.W06.d02

class Cat(
    var name: String,
    var age: Int,
    var breed: String,
    // Default-Werte: müssen bein Instanziieren nicht angegeben werden, weil sie hier bereits initialisiert werden
    var favoriteToys: MutableList<String> = mutableListOf("Wollknäuel", "Katzenangel"),
    var owner: String = "Taylor Swift") {

    fun printInfo(){
        println("Name: $name")
        println("Alter: $age")
        println("Rasse: $breed")
        println("Spielzeuge: $favoriteToys")
        println("Besitzer: $owner")
    }

    // INIT BLOCK: Wird IMMER beim INITialisieren (= Erstellen eines neuen konkreten Objekts) ausgeführt
    init {
        println("Miau! Neue Katzeninstanz namens $name erstellt.")
    }

    // zum Thema this: weshalb man es benutzen sollte: Namenskonflikt
    fun changeName(name: String){
        this.name = name

    }



}