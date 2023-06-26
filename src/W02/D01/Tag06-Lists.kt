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
    println(firstDay)
    // ohne variable direkt den inhalt des index ausdrucken:
    println(WEEK_DAYS[6])


    // Liste an Integers anlegen
    var numbers: List<Int> = listOf(101,98,347,50,5,6,8,5,3,21,5,7,9,6)
    var firstNumber: Int = numbers[0]
    println("Die 1. Zahl am Index 0 ist: $firstNumber")
    println(numbers[0])

    // über .size-1 auf letzten Index der Liste zugreifen
    println("Länge der Liste numbers: ${numbers.size}")
    println(numbers[numbers.size-1])
    println(numbers[13])



    // IndexOutOfBounds Exception

    // contains()

    // get

    // subList()

    // reversed()

    // sorted()



}