package W02.D03

fun main(){

    // nullable Variable anlegen: braucht ? (nullable bedeutet: es darf null in der Variable stehen)
    var nullName = null
    println(nullName)
    var nullableFirstName: String? = "Harry"
    nullableFirstName = null

    // auch konstanten können null sein:
    val NULL_CONSTANT: String? = null

    // SAFE CALL: den benutzen wir best practice mässig immer, umgeht programm absturz
    var integer: Int? = null
    var integerToDouble = integer?.toDouble()

    integerToDouble = 1.5

    // NON NULL ASSERTED CALL: vorsicht, gefahr: bringt die app zum abstürzen. zum gezielten fehler suchen nutzbar
    var double: Double? = 2.0
    var doubleToInteger = double!!.toInt()
    println(doubleToInteger)






    var sollSpaeterNullSein: String? = "Ich bin noch nicht null."
    sollSpaeterNullSein = null






    println()




    // kann jetzt null zugewiesen bekommen



    // SAFE CALL


    // NON NULL ASSERTED CALL: kann NPE triggern, wenn die Variable doch null ist:



    /*
    Beantwortet die folgenden Fragen indem ihr sie mit einem x ankreuzt.
    Beispiel: [x]
    Hinweise: Es können auch mehrere Antwortmöglichkeiten richtig sein!
     */

    /*
    Wofür steht null?
    [] null ist das Gleiche wie 0
    [] null steht für eine leere Variable
    [] null sagt aus, dass eine Variable ohne Wert existiert
    */

    var zahl1: Int? = null
    var zahl2 = zahl1?.plus(10)
    /*
    Was für eine Ausgabe kann man hier erwarten?
    [] null
    [] 10
    [] null10
    [] Es wird einen Fehler geben
     */


    /*
    Was kann durch den ?-Operator möglich gemacht werden?
    [] Es werden Rechnungen auf nullable-Werten ermöglicht, nur wenn diese nicht null sind
    [] Es werden Rechnungen auf nullable-Werten ermöglicht, auch wenn diese null sind
     */

    var zahl3: Int? = 4
    var ergebnis = zahl3?.minus(1)
    /*
    Was ist in ergebnis gespeichert?
    [] 3
    [] null
    [] null-1
    [] 4
     */

    var zahl4: Double? = 3.14
    var ergebnis2 = 2 * zahl4!!
    /*
    Was ist in ergebnis2 gespeichert?
    [] 3.14
    [] 6.28
    [] 3.14!!
    [] null
     */

    var zahl5: Int? = 12
    var ergebnis3 = zahl5!!%4
    /*
    Was ist in ergebnis3 gespeichert?
    [] 0
    [] null
    [] 12
    [] 4
     */

}