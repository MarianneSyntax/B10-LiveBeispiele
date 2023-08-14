package CHECKPOINTS

import CHECKPOINTS.Musterloesungen.Videothek.filmListe

// Wenn ihr die Funktionen printen wollt --> dann müsst ihr nur an den richtigen Stellen die Kommentare wegmachen



//CECKLISTE Funktionen

// BASIC:
// 1. Funktionen erstellen und Funktionen in der VORLESUNG.W08.`Enums-Pokemon`.main() aufrufen (Programmfluss)
// 2. Scopes
// 3. return vs. void
// 4. Funktionen als Wert abspeichern
// 5. Parameter Grundlagen

// erweitertes Wissen:
// 6. Parameter --> verschachtelte Parameter
// 7. Funktionen verketten





//TODO 1: Funktionen erstellen/aufrufen
fun addition() {            // Funktion erstellen
    var zahl1:Int = 2
    var zahl2: Int = 3
    zahl1 + zahl2
}
fun main(){
    var lieblingsFilme: List<String> = listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")
    var i = 0
    repeat(lieblingsFilme.size) {
        var film = lieblingsFilme[i]
        println(film)
        i++
    }
}


/*
//TODO 2: Scopes
fun addition() {            // Funktion1
    zahl1 + zahl2
}
fun subtraktion(){          // Funktion2
    zahl1 - zahl2
}
fun VORLESUNG.W08.`Enums-Pokemon`.main() {
    addition()              // Funktion1 aufrufen
    subtraktion()           // Funktion2 aufrufen

}
var zahl1:Int = 2           // Variablen außerhalb von Scopes definiert (globale Variablen)
var zahl2: Int = 3
 */

/*
//TODO 3: return vs. void
fun addition() {                    // void-Funktion (ohne Rückgabewert)
    var zahl1:Int = 2
    var zahl2: Int = 3
    var ergebnis: Int = zahl1 + zahl2
}
fun addition1(): Int {            // return-Funktion (mit Rückgabewert)
    var zahl1:Int = 2
    var zahl2: Int = 3
    var ergebnis: Int = zahl1 + zahl2
    return ergebnis
}
fun VORLESUNG.W08.`Enums-Pokemon`.main(){
    println(addition())              // Funktion aufrufen
    println(addition1())
}
 */

/*
//TODO 4: Funktion als Wert abspeichern
fun addition():Int {            // Funktion-Addition
    var zahl1:Int = 2
    var zahl2: Int = 3
    var ergebnis:Int = zahl1 + zahl2
    return ergebnis
}
fun VORLESUNG.W08.`Enums-Pokemon`.main(){
    var summe: Int = addition()              // summe = 5   --> addition() als Wert in summe gespeichert
    var doppelt: Int = addition() * 2        // jede Zahl doppelt
}
 */

/*
//TODO 5: Parameter
fun addition(zahl1:Int, zahl2:Int) {            // Funktion mit zwei Parameter
    var ergebnis: Int = zahl1 + zahl2
}
fun VORLESUNG.W08.`Enums-Pokemon`.main(){
    addition(2,3)                           // Vorteil Funktion: nur einmal schreiben und immer wieder benutzen
    addition(40,1)
    addition(1,9)
}
 */

/*
//TODO 6: verschachtelte Parameter
fun parameter(x: String, y: MutableList<List<Int>>){        // bekommt eine MutableList übergeben, deren einzelnen Values eine Liste ist
    println(y)
}
fun VORLESUNG.W08.`Enums-Pokemon`.main(){
    val liste: List<Int> = listOf(1,2,3,4,5)
    val mListe1: MutableList<List<Int>> = mutableListOf(liste,liste,liste)
    parameter("Hallo", mListe1)
}
 */

/*
//TODO 7: verkettete Funktionen
fun VORLESUNG.W08.`Enums-Pokemon`.main(){
    val liste: List<Int> = listOf(1,2,3,4,5)
    liste.toMutableList().toString()
    liste.toMutableList().removeAt(1)
    liste.toMutableList().removeAt(1)...()...()...()        //man kann Funktionen verketten
}
 */



