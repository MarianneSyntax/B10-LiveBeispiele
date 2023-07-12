package VORLESUNG.W04.D03

// Die gespeicherten User mit deren PW
// user sind außerhalb von main() : globale Variablen, in anderen Dateien nutzbar
val USER1 = "Batman"
val PW1 = "1234"

val USER2 = "Superman"
val PW2 = "password"

fun main(){
    // variablen, um zu tracken, ob die user jeweils eingeloggt sind
    var user1LoggedIn: Boolean = false
    var user2LoggedIn: Boolean = false

    println("Bitte gib Namen ein...")
    val userName: String = readln()
    println("Bitte Passwort eingeben...")
    val password: String = readln()


    // User1 einloggen, lange version (verschachtelte ifs)
    if (userName == USER1) {
        if (password == PW1){
            println("Willkommen, $USER1!")
            // user1 ist jetzt eingeloggt, dh der Boolean, der das trackt, kann auf true gesetzt werden
            user1LoggedIn = true
        } else {
            println("Falsches Password für $USER1 eingegeben...")

        }
    }

    // User2 einloggen: sehr kurze Version (Verknüpfungsoperatoren)
    user2LoggedIn = (userName == USER2 && password == PW2)
    if (user2LoggedIn) println("Willkommen, $USER2!") // { } Klammern können weggelassen werden, solange die Anweisung nur 1 Zeile ist

    // Beispiel für NOT EQUALS !=
    if (userName != USER1 && userName != USER2){
        println("Unbekannter User, bitte registrieren Sie sich zuerst...")
    }

    // Einlog-Status, der im Boolean userLoggedIn getrackt wird, nutzen, um was entsprechendes anzuzeigen
    if (user1LoggedIn || user2LoggedIn) {
        println("Einer der User ist angemeldet.")
    }

    // was, wenn keiner eingeloggt ist?
    // Identisch: !(A || B) == !A && !B
    if (!user1LoggedIn && !user2LoggedIn){ // !(user1Loggedin || user2LoggedIn)
        println("Es ist niemand eingeloggt, Login-Screen anzeigen...")
    }
}









fun ifBeispiele(){
    // if-else
    if (2 > 3){
        // mach irgendwas
    } else {
        // mach was anderes
    }

    //else-if
    if (2 == 20) {
        // mach was
    } else if (2 < 3){
        // mach irgendwas anderes
    } else if (2 != 3) {
        // mach noch was anderes
    }
}

