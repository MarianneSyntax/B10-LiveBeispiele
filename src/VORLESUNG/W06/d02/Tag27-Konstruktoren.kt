package VORLESUNG.W06.d02

fun main(){

    // Wiederholung
    var taylor: Singer = Singer()
    taylor.name = "Taylor Swift"
    taylor.age = 33
    taylor.musicGenre = "Pop"
    taylor.songList = mutableListOf("Shake it Off", "Blank Space", "Red")

    taylor.singSong("Lavender Haze")
    taylor.printInfo()

    var tupac: Singer = Singer()
    tupac.name = "Tupac"
    tupac.age = 25
    tupac.musicGenre = "HipHop/Rap"
    tupac.songList = mutableListOf("How Do You Want It", "Changes", "x it Up")
    tupac.printInfo()

    // NEUER STOFF:
    // Instanzen unserer Klassen mit Konstruktor:
    var katze = Cat("Winnie", 2, "Perser") // toys und owner fehlen, sind per Default gegeben
    katze.printInfo()

    var katze2 = Cat("Lucy", 4, "BKH") // owner und favToys fehlen, sind per Default gegeben
    println(katze2.owner) // gibt den default wert Taylor Swift raus
    println(katze2.favoriteToys) // gibt den Default Wert [Wollknäuel, Katzenangel] aus
    katze2.owner = tupac.name // ändert den Default Wert Taylor Swift zu Tupac

    var katze3 = Cat("Molly",9,"Wildkatze", mutableListOf("Quietschente", "Katzenminze"), "Nina") // Default Werte favoriteToys und owner werden hier überschrieben
    katze3.printInfo()


    // HUMAN
    var human1: Human = Human("Gregor",34)
    var x: Int = 1 // gleiche Syntax: var variablenName : Datentyp = Wert
    human1.greeting()

    // PIZZA
    var mozarella: Pizza = Pizza("Mozarella", 2, 7.99, listOf("Mozarella", "Tomate", "Basilikum"))
    mozarella.name
    //mozarella.toppings -> Compilerfehler, Toppings sind nicht von aussen benutzbar

   //println(mozarella.ingredients)

    var newCat = Cat("Kitty",2,"bla")

    var tuna: Pizza = Pizza("Tuna", 2, 9.99, listOf("Thunfisch", "Zwiebeln"))

}