package VORLESUNG.W04.D01

fun main(){

// Die wichtigsten Boolean-Operationen
    // == : gleich. schreibt man zwischen 2 Booleans, gibt true zurück, wenn sie gleich sind

    val expectedUsername = "john_smith"
    println("Bitte korrekten Username eingeben")
    val enteredUsername = readln()
    val isUserNameCorrect: Boolean = (expectedUsername == enteredUsername)
    println("Der Nutzername ist korrekt: $isUserNameCorrect")

    // != : ungleich. Schreibt man zwischen 2 Variablen, gibt true zurück, wenn sie NICHT gleich sind

//    val password = "passwort"
    println("Bitte Passwort eingeben")
    val enteredPassword = readln()
    val isPasswordNotCorrect: Boolean = (enteredPassword != enteredPassword)
    println("Ist es wahr, dass das falsche Passwort eingegeben wurde? --> $isPasswordNotCorrect")

    // < : kleiner. gibt true zurück, wenn die Variable links vom < kleiner als die rechts ist
    val price: Double = 20.99
    println("Bitte gib dein Budget ein:")
    val budget: Double = readln().toDouble()
    val productAffordable = (price < budget)
    println("Kannst du dir das Produkt mit den Kosten $price leisten? --> $productAffordable, du hast nur $budget dabei")


    // <= : kleiner-gleich. gibt true zurück, wenn die Variable links vom <= kleiner ODER GLEICH die rechte ist
    val price2: Double = 20.99
    println("Bitte gib dein Budget ein:")
    val budget2: Double = readln().toDouble()
    val productAffordable2 = (price2 <= budget2)
    println("Kannst du dir das Produkt mit den Kosten $price2 leisten? --> $productAffordable2, du hast $budget2 dabei")

    // Logisches UND: gibt true zurück, wenn beide Seiten true sind
    val hasAccount = true
    val isLoggedIn = false
    val isUserActive: Boolean = (hasAccount && isLoggedIn)
    println("Ist der Nutzer aktiv, das heisst: Hat er einen Account? ($hasAccount) und ist er in diesen Account eingeloggt? ($isLoggedIn)? --> $isUserActive")

    // Logisches ODER: gibt true zurück, wenn mindestens eine der Seiten true ist
    val isWeekend = false
    val isHoliday = false
    val isFreeDay = (isHoliday || isWeekend)
    println("Ist es ein Wochenendtag? ($isWeekend), ist es ein Feiertag? ($isHoliday) --> haben wir frei? -> $isFreeDay")

    // Logisches NICHT: macht den Boolean, vor den man es schreibt, zum Gegenteil.
    val isRaining = true
    val isNotRaining = !isRaining // false, das Gegenteil von isRaining, es regnet nicht.

    val isNotSunny = true
    val isSunny = !isNotSunny // false, das Gegenteil von isNotSunny, es ist sonnig

}