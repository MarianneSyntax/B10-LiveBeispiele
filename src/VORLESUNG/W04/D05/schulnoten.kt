package VORLESUNG.W04.D05

fun main(){

    // Benutzereingabe Schulnote
    println("Bitte geb eine Schulnote an: ")
    var eingabe = readln().toDouble()

    // Ausgabe je nach Schulnote (when-Verzweigung)
    when (eingabe) {
        1.0 -> "Super, mit 1.0 bestanden!"
        5.0 -> "Leider mit 5.0 grad so nicht bestanden :("
    }


}