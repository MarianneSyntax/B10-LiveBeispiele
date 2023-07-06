package VORLESUNG.W03.D04

fun main(){

    // Verhalten Value Types
    var num = 13
    var num2 = num
    num2 = 20
    println(num) // num bleibt 13, da num2 auf eine eigene Stelle im speicher zeigt

    // Verhalten Reference Types
    val list = mutableListOf(1,2,3)
    val list2 = list
    list.add(4)
    println(list) // list = [1,2,3,4], genau wie list2, da list2 auf die gleiche Speicheradresse wie list zeigt
}