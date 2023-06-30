package VORLESUNG.W02.D04

fun main(){

    // Set: unsortierte Kollektion einzigartiger Elemente. D.h. Doppelungen desselben Werts werden nicht geprinted oder gezählt

    // set anlegen

    var animalSet: MutableSet<String> = mutableSetOf("Tiger", "Pinguin", "Giraffe", "Gorilla", "Orangutan", "Delphin", "Löwe")
    println(animalSet)

    // mehr duplikate hinzufügen
    animalSet.add("Tiger")
    animalSet.add("Giraffe")
    animalSet.add("Zebra") // hängt Zebra NICHT hinten dran
    println(animalSet.elementAt(0))

    var mutableListAnimals = animalSet.toMutableList()
    println(mutableListAnimals)

    var listWithDuplicates = listOf("A", "B", "C", "B", "A")
    var listToSet = listWithDuplicates.toSet()



    println(animalSet)
    // size: enthält die duplikate nicht
    animalSet.size
    println()



    // Konvertierungen

    // toList() / toMutableList()


    // toMap() / toMutableMap()



}