package W02.D02

fun main(){

    // liste anlegen: ShoppingList
    var shoppingList: List<String> = listOf("Aepfel", "Bananen", "Kirschen", "Mangos", "Litschi", "Kaffee", "Orangen", "Pizza")

    // liste in mutable (veränderbare) liste umwandeln, in neuer variable speichern:
    var mutableShoppingList = shoppingList.toMutableList()

    // LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS

    // size in variable speichern
    var size: Int = shoppingList.size

    // index vs size:
    // size in lastIndex speichern
    var lastIndex: Int = shoppingList.size-1

    // wird das hier klappen? (size als lastIndex) -> jetzt ja, da wir size-1 gesetzt haben
    var lastElement = shoppingList[lastIndex]

    // alternative zum letzten index: last()
    var anotherLastElement = shoppingList.last()


    // alternative zu shoppingList[0]: first()
    var firstElement = shoppingList[0] // gibt Äpfel zurück
    var anotherFirstElement = shoppingList.first()


    // min
    var minElement = shoppingList.min()


    // max
    var maxElement = shoppingList.max()


    // indexOf() - erstes Vorkommen eines Elements in der Liste
    // Vorbereitung: Ein Element doppelt in die Liste fügen
    mutableShoppingList.add("Mangos")

    // indexOf()
    var firstMangoIndex = mutableShoppingList.indexOf("Mangos")

    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste
    var lastMangoIndex = mutableShoppingList.lastIndexOf("Mangos")


    // contains
    var containsPizza: Boolean = shoppingList.contains("Pizza")
    var containsMilk: Boolean = shoppingList.contains("Milch")



    // containsAll
    var containsMilkAndPizza: Boolean = shoppingList.containsAll(listOf("Pizza", "Milch"))
    var containList: List<String> = listOf("Mangos", "Kaffee", "Litschi")
    var containsTheContainList = shoppingList.containsAll(containList)


    // filter: Mit Modulo
    var numbers = listOf(11, 20, 31, 40, 51, 60, 71, 80, 91, 100)

    // 11 % 2 = 1 --> wie oft passt die 2 in die 11? --> sie passt 5 mal rein, das ergibt aber nur 10. -> der Rest, um die 11 zu erreichen, ist 1. Modulo = Rest
    var filteredNumbers = numbers.filter { (it%2).equals(0) }

    // subList: gibt liste vom 1. index bis AUSschliesslich den 2. Parameter aus
    var subListShopping = shoppingList.subList(0,3)

    // slice: kann eine Int Range (x..y) oder eine Liste übergeben bekommen, das obere Ende der Range ist EINbegriffen (nicht wie bei subList)
    var sliceShopping = shoppingList.slice(0..3)


    // SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS

    // remove
    mutableShoppingList.remove("Pizza")

    // removeAll: nimmt eine Liste an Elementen, die entfernt werden sollen, als Parameter
    mutableShoppingList.removeAll(listOf("Pizza", "Bananen"))

    // add
    mutableShoppingList.add("Döner")
    var kaffeeIndex = mutableShoppingList.indexOf("Kaffee")
    mutableShoppingList[kaffeeIndex] = "Tee"

    mutableShoppingList.add(0,"Käse")


    // clear
    //mutableShoppingList.clear()


    // addAll
    var newList = listOf("Rucola", "Eis", "Yoghurt")
    mutableShoppingList.addAll(newList)



    // removeAt
    mutableShoppingList.removeAt(0)

    // removeLast
    mutableShoppingList.removeLast()


    // removeFirst
    mutableShoppingList.removeFirst()


    // sort: sortiert liste aufsteigend
    mutableShoppingList.sort()


    // shuffle: mischt liste durch
    mutableShoppingList.shuffle()


}