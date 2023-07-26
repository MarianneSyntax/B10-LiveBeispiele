package VORLESUNG.W06.d03

// Klasse Pizza: mit Ingredients statt Strings als Zutaten
class Pizza(var name: String, toppings: List<Ingredient>) {

    var ingredients: MutableList<Ingredient> = mutableListOf(Ingredient("Teig", 1.0), Ingredient("Tomatensauce", 1.0), Ingredient("geriebener Käse", 1.0))

    var price = 0.0

    // im init block direkt den Preis der Pizza ausrechnen (könnte auch in eine eigene Funktion)

    init {
        println("Neue Pizza-Instanz namens $name gebacken!")
        println("Grundzutaten Pizza:")
        ingredients.forEach { print("${it.name} ") }
        println("")
        this.ingredients.addAll(toppings)
        println("Extra Toppings:")
        ingredients.subList(3,ingredients.size).forEach { println(it.name) }
        println("Gesamtpreis der Pizza aus dem Preis aller Zutaten berechnen...")

        for (ingredient in ingredients){
            price += ingredient.cost
        }

        println("Gesamtpreis: $price Euro.")
    }

    // sekundärer Konstruktor: keine Toppings, toGo Variable
    constructor(name: String, toGo: Boolean): this(name, listOf()){
        println("Mit Sekundärem Konstruktor blanke Pizza gebacken. Ist sie to Go? $toGo")
    }


}