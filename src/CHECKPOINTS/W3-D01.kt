package CHECKPOINTS

/** Funktionsaufruf:
    Nachdem eine Funktion definiert wurde muss man diese Funktion aufrufen.
    Der Aufruf verwendet nur den Namen der Funktion und die ()-Klammern.
    Funktionsaufrufe lassen sich beliebig oft ausführen.
 Dabei `springt` der Code in die jeweiligen Zeilen der Funktionsdefinition.
 */

fun main() {

    println("Eins")
    println("Zwei")
    println("Drei")
    count() // 1. Funktionsaufruf
    count() // 2. Funktionsaufruf
}

/**  Funktionsdefinition:
    mit dem Keyword `fun` wird eine Funktion erstellt.
    Dabei sollte jede Funktion ihren eigenen und eindeutigen Namen besitzen.
    Zwischen den {}-Klammern (Body bzw. Rumpf der Funktion) wird der Code geschrieben, der ausgeführt wird, wenn die Funktion
    aufgerufen wird.

 */
fun count() {
    println("Vier")
    println("Fünf")
    println("Sechs")
}
