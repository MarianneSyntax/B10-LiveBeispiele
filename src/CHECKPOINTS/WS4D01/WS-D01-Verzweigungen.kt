package CHECKPOINTS.WS4D01

fun main() {


    val passwordFromInput = readln()






/* Vergleichoperatoren:
    1. ==  Gibt true bei Gleichheit zurück. Beispiel: 2 == 2 -> true
    2. !=  Gibt true bei Ungleichheit zurück. Beispiel: 2 != 1 -> true
    3. <  Gibt true zurück, wenn rechte Seite größer als linke Seite ist. Beispiel: 5 < 6 -> true
    4. <= Gibt true zurück, wenn rechte seite gleich oder größer als die Linke ist . Beispiel: 5 <= 5 -> true
    5. > wie bei 3. nur Seiten vertauscht
    6. >= wie bei 4. nur Seiten vertauscht
 */
    if (passwordFromInput.length >=8) { //mindestens 8
        if (passwordFromInput.contains("!")) { // mindestens ein !
            println("Du hast ein sicheres Passwort erstellt")
        }else {
            println("Dein Passwort muss ein ! beinhalten")
        }
    }else {
        println("Dein Passwort muss mindestens 8 Zeichen lang sein")
    }

}

fun hello() {
    print("Hello")
    print("World")
}