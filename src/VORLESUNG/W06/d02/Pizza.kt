package VORLESUNG.W06.d02

class Pizza(
    var name: String,
    var size: Int,
    var price: Double,
    // toppings werden beim Initialisieren zu den ingredients hinzugefügt, können danach vergessen werden -> kein var Schlüsselwort davor. (Z. 44 in Tag27-Konstruktoren)
    toppings: List<String>) {

    var ingredients: MutableList<String> = mutableListOf("Teig", "geriebener Käse", "Tomatensauce")

    init {
        println("Neue Pizza-Instanz namens $name gebacken!")
        println("Grundzutaten Pizza: $ingredients")
        this.ingredients.addAll(toppings)
        println("Zutaten + Toppings: $ingredients")
    }



}