package CHECKPOINTS

fun main() {

    var number1 = 5
    var number2 = 6

    //Erstelle eine Variable "isEqual",
    // die überprüft, ob die Zahlen gleich sind
    var isEqual = number1 == number2
    println(isEqual)


    //Erstelle eine Variable "isNotEqual",
    // die überprüft, ob die Zahlen ungleich sind
    var isNotEqual = number1 != number2
    println(isNotEqual)


    //Erstelle eine Variable "isLessOrEqual",
    // die überprüft, ob die erste Zahl
    // kleiner oder gleich der zweiten Zahl ist
    var isLessOrEqual = number1 <= number2
    println(isLessOrEqual)


    var number3 = 3
    var number4 = 6
    var number5 = 2

    //Erstelle eine Variable, die überprüft,
    //ob Nummer 3 gleich Nummer 4 ist
    // UND Nummer 4 kleiner als Nummer 5 ist
    var result = (number3 == number4) && (number4 < number5)
    println(result)

    //Erstelle eine Variable, die überprüft,
    //ob Nummer 3 ungleich Nummer 5 ist
    //ODER Nummer 4 größer als Nummer 5 ist
    var result2 = (number3 != number5) || (number4 > number5)
    println(result2)


    //Du bist Programmierer und sollst einen Code erstellen,
    // der überprüft, ob ein eingegebenes Passwort gültig ist oder nicht
    //
    // 1.
    // eine Variable "password" abgespeichert werden,
    // wenn ein String eingegeben wird (input) also nicht null ist, wird dieser in "password" abgespeichert
    // in allen anderen Fällen wird "password" mit "" initialisiert.
    // HINWEIS: Diesen Schritt machen wir, um zu verhindern,
    // dass durch eine leere Eingabe eine Variable = null, also leer ist.

    println("Bitte gib dein Passwort ein:")
    val input = readln()
    var password = if (input != null) {
        input
    } else {
        ""
    }

    // 2.
    // Das Passwort soll
    // - mindestens 12 Zeichen haben
    var minLength12: Boolean = password.length >= 12


    // - mindestens ein Sonderzeichen (* = % $)
    // - Tipp: Regex("[*=%$]") ist das Argument zu .contains()
    // Regex ist die Abkürzung für "Regular Expression" (Regulärer Ausdruck)
    // und bezeichnet eine spezielle Schreibweise zur Beschreibung von Mustern in Zeichenketten.
    // Reguläre Ausdrücke ermöglichen es, bestimmte Muster in Texten zu finden oder zu überprüfen.

    var sonderzeichen: Boolean = password.contains(Regex("[*=%$]"))

    // - Groß- und Kleinschreibung haben
    // -> Tipp: Regex("[A-Z]") und Regex("[a-z]") ist das Argument zu .contains()

    var großUndKleinSchreibung: Boolean = password.contains(Regex("[A-Z]")) && password.contains(Regex("[a-z]"))


//3.
    //Wenn ALLE Bedingungen erfüllt sind, soll die Konsole
    //"Danke, dein Passwort ist gültig." ausgeben.
    //In allen anderen Fällen soll
    //"Tut mir leid, dein Passwort ist nicht gültig." ausgegeben werden.
    if (minLength12 && sonderzeichen && großUndKleinSchreibung) {
        println("Danke, dein Passwort ist gültig.")
    } else {
        println("Tut mir leid, dein Passwort ist nicht gültig.")
    }
}




