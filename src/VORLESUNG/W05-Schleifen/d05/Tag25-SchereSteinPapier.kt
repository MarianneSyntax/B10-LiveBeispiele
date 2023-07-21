package VORLESUNG.`W05-Schleifen`.d05

fun main(){

    // VERSION MIT FUNKTION

    /*
 choices = liste an optionen (schere, stein oder papier)
userChoice = input über die konsole
pcChoice = random element aus choices


wenn unentschieden
	print unentschieden
wenn pc gewinnt
	print, dass pc gewinnt
wenn user gewinnt
	print, dass user gewinnt

     */
    var gameOver = false
    var userPoints = 0
    var pcPoints = 0
    while (!gameOver) {
        var result = schereSteinPapier()
        if (result == "user") {
            userPoints++
        } else if (result == "pc"){
            pcPoints++
        }
        println("Spielstand: $userPoints : $pcPoints")
        println("Nochmal spielen? (y/n)")
        val input = readln()
        if (input == "n"){
            gameOver = true
        }
    }
    println("Spiel beendet! Thanks for playing...")
}

fun schereSteinPapier() : String {
    val choices = listOf("schere", "stein", "papier")
    var userChoice = ""

    // if abfrage: wenn falsche eingabe, dann validUserChoices auf true setzen
    do {
        println("Schere, Stein oder Papier?")
        userChoice = readln().lowercase()
        println("Deine Wahl: $userChoice")
    }
    while (userChoice != "schere" && userChoice != "papier" && userChoice != "stein")
    val pcChoice = choices.random()
    println("PC Wahl: $pcChoice")

    if (pcChoice == userChoice){
        println("Unentschieden! Beide haben $pcChoice gewählt!")
        return "draw"
    }
    // PC Gewinnt:
    else if ((userChoice == "schere" && pcChoice == "stein") ||
        (userChoice == "stein" && pcChoice == "papier") ||
        (userChoice == "papier" && pcChoice == "schere") ) {
        println("PC hat $pcChoice gewählt. Du hast $userChoice gewählt. $pcChoice schlägt $userChoice... Verloren.")
        return "pc"
    }
    else {
        println("PC hat $pcChoice gewählt. Du hast $userChoice gewählt. $userChoice schlägt $pcChoice... Gewonnen!")
        return "user"
    }

}
