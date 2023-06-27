package W02.D02

fun main(){

    // liste anlegen: ShoppingList
    var shoppingList: List<String> = listOf("Äpfel", "Bananen", "Kirschen", "Mangos", "Litschi", "Kaffee", "Orangen", "Pizza")

    // liste in mutable liste umwandeln:
    var mutableShoppingList = shoppingList.toMutableList()

   // LESENDE OPERATIONEN: AUF LISTS UND MUTABLE LISTS

    // size in variable speichern
    var size: Int = shoppingList.size


    // index vs size:
    // size in lastIndex speichern
    var lastIndex: Int = shoppingList.size-1

    // wird das hier klappen? (size als lastIndex)
    var lastElement = shoppingList[lastIndex]

    // alternative: last()
    var anotherLastElement = shoppingList.last()



    // alternative zu shoppingList[0]: first()
    var firstElement = shoppingList[0] // gibt Äpfel zurück
    var anotherFirstElement = shoppingList.first()


    // min


    // max


    // indexOf() - erstes Vorkommen eines Elements in der Liste


    // lastIndexOf() - letztes Vorkommen eines Elements in der Liste

    // contains
    var containsPizza: Boolean = shoppingList.contains("Pizza")
    var containsMilk: Boolean = shoppingList.contains("Milch")



    // containsAll
    var containsMilkAndPizza: Boolean = shoppingList.containsAll(listOf("Pizza", "Milch"))
    var containList: List<String> = listOf("Mangos", "Kaffee", "Litschi")
    var containsTheContainList = shoppingList.containsAll(containList)


    // filter: Mit Modulo
    var numbers = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)

    // subList


    // slice



    // SCHREIBENDE OPERATIONEN: NUR MIT MUTABLE LISTS

    // remove
    mutableShoppingList.remove("Pizza")

    // removeAll
    mutableShoppingList.removeAll(listOf("Pizza", "Bananen"))

    // add
    mutableShoppingList.add("Döner")
    var kaffeeIndex = mutableShoppingList.indexOf("Kaffee")
    mutableShoppingList[kaffeeIndex] = "Tee"

    mutableShoppingList.add(0,"Käse")


    // clear
    mutableShoppingList.clear()


    // addAll




    // removeAt


    // removeLast


    // removeFirst


    // sort


    // shuffle











    println()




}