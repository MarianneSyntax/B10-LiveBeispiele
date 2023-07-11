package VORLESUNG.W03.D05

fun main(){

    val shoppingList: MutableList<String> = mutableListOf("Eier", "Milch", "Brot", "Marmelade", "Kirschen", "Zitronen")

    val priceList: MutableMap<String,Double> = mutableMapOf(
        "Eier" to 1.49,
        "Milch" to 1.99,
        "Brot" to 1.69,
        "Marmelade" to 2.49,
        "Kirschen" to 3.99,
        "Zitronen" to 1.99,
    )

//    // 1 Element zum Sortiment hinzufuegen
//    priceList.put("Corn Flakes", 3.49) // oder: priceList["Corn Flakes"] = 3.49
//    shoppingList.add("Corn Flakes")
//    // neuen Preis setzen
//    priceList.set("Eier", 2.49)
//    // Preis rausholen
//    priceList.get("Milch")


    // Element mit tiefstem Preis identifizieren: Wie komme ich bei einer Map da ran?
    // var minPreis = priceList.values.min()

    //var onlyPrices = priceList.values
   // var sortedPrices = onlyPrices.sorted()
   // var minPreis = sortedPrices.first()

    // Value haben, zugehörigen key rausfinden, ggf. existiert Value öfters

    getKeyViaValue(2.49,priceList)
    getKeyViaValue(1.99,priceList)
    getKeyViaValue(3.99,priceList)


}

fun getKeyViaValue(givenValue: Double, priceList: MutableMap<String,Double>){
    // Computational Thinking: Wie müssen wir vorgehen? --> für den Value 2.49
    var keys = priceList.keys.toMutableList()
    var valueList = priceList.values.toMutableList()
    // Index des gesuchten Values rausfinden und in Variable speichern
    var index = valueList.indexOf(givenValue)
    // über diesen Index den passenden key finden
    var product = keys[index]
    println("Gesuchter Preis: $givenValue \n Index, an dem der Preis steht: $index \n Passendes Produkt: $product am index $index in values-liste")
}















// getLowestPrice: Wie komme ich da ran? --> Computational Thinking
// 1. Liste aus values erstellen,
// 2. dort min anwenden, den index von min speichern
// 3. in die shoppingList via diesem index von min das passende item raussuchen




