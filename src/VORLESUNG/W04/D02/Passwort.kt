package VORLESUNG.W04.D02

fun passwortAbfrage(userName: String, anzahlVersuche: Int) : Boolean {
    // Passwortabfrage mit Map
    var returnBoolean = false
    val userAccounts: MutableMap<String, String> = mutableMapOf(
        "Jon Snow" to "winterfell99",
        "Danaerys" to "dragons4ever",
        "Tyrion" to "iLoveWine1234",
        "Arya" to "no-one-xx"
    )

    // if Abfrage: ist der Name in der map, ist der Versuch unter/gleich 3?
    if (userName in userAccounts.keys && anzahlVersuche <= 3) {   // in == userAccounts.keys.contains(userName)

        // Fahrplan: an das entsprechende Password in der userAccounts Map drankommen
        val userPW: String = userAccounts[userName]!!
        // Nutzer gibt passwort ein, in Variable speichern
        println("Passwort eingeben...")
        val password = readln()

        // stimmen nutzereingabe und das passwort aus der map überein? --> wenn ja einloggen, wenn nein: Rekursion
        if (userPW == password) {
            returnBoolean = true
        } else {
            passwortAbfrage(userName, anzahlVersuche+1)
        }
    } else {
        println("Du hast es 3x versucht, du bist jetzt ausgesperrt.")
        returnBoolean = false
    }
    return returnBoolean
}