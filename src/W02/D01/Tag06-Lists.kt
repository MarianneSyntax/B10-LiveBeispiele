fun main(){

    // leere liste anlegen

    // zur erinnerung: syntax, wenn man eine leere variable mit primitivem datentyp anlegt
    var name: String

    var emptyList: List<String> = listOf(      ) // leere liste
    println(emptyList)

    // ist die leere liste Leer? isEmpty gibt einen boolean zurück (true wenn leer, false wenn nicht leer)
    var isListEmpty = emptyList.isEmpty() // gibt true zurück


    // befüllte string liste anlegen
    var WEEK_DAYS: List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    // ist die liste leer?
    var weekDaysEmpty = WEEK_DAYS.isEmpty() // gibt false zurück


    // über [] auf index zugreifen, in variable speichern
    var firstDay = WEEK_DAYS[0]
    println(firstDay) // druckt den ersten Tag, Montag, aus

    // ohne variable direkt den inhalt des index ausdrucken:
    println(WEEK_DAYS[6])


    // Liste an Integers anlegen
    var numbers: List<Int> = listOf(101,98,347,50,5,6,8,5,3,21,5,7,9,6)
    var firstNumber: Int = numbers[0]
    println("Die 1. Zahl am Index 0 ist: $firstNumber")
    println(numbers[0])

    // über .size-1 auf letzten Index der Liste zugreifen
    // .size gibt die Länge als Integer zurück.
    println("Länge der Liste numbers: ${numbers.size}")
    // diese Länge minus 1 liefert uns den letzten Index, weil der Index immer 1 kleiner ist als die Länge
    println(numbers[numbers.size-1])
    println(numbers[13])


    // IndexOutOfBounds Exception: Zum Ausprobieren Einkommentieren
    // diese Zeile:
    //println(numbers[numbers.size])
    // ist das gleiche wie:
    //println(numbers[14])
    // die Liste geht aber nur bis Index 13. Hier wird eine IndexOutOfBoundsException getriggert.

    // contains() gibt true oder false zurück
    var thirteenInList = numbers.contains(13) // gibt false zurück und speichert das false in der Variable, die 13 ist nicht in der Liste
    var threeInList = numbers.contains(3) // gibt true zurück, die 3 ist in der Liste

    // get: gibt ein Int, den Index, zurück
    var numberAtIndexTen = numbers.get(10) // speichert die Zahl, die an Index 10 steht, in numberAtIndexTen. gibt 5 zurück, weil die 5 am 10. Index steht

    // subList()
    var subList = numbers.subList(0,2) // gibt die Elemente von Index 0 bis ausschließlich Index 2 zurück
    println(subList) // druckt [101, 98], Index 2 ist nicht mit inbegriffen, es ist die obere Grenze

    // reversed()
    var reversedNumbers = numbers.reversed() // macht eine umgekehrte Kopie der Liste
    println(reversedNumbers)

    // sorted()
    var sortedNumbers = numbers.sorted() // sortiert eine Kopie der Liste aufsteigend
    println(sortedNumbers)



}