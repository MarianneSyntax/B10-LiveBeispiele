package VORLESUNG.`W05-Schleifen`.d02
fun main(){

    // VERSION OHNE FUNKTION
    val options: List<String> = listOf( "schere","stein","papier")

    var gameOver = false
    var playerScore = 0
    var computerScore = 0
    while (!gameOver){
        println("Game Start!")
        println("Wähle Schere, Stein oder Papier")
        var playerChoice = readln().lowercase()
        var computerChoice = options.random()
        if(playerChoice == computerChoice){
            println("Unentschieden! Das Spiel steht $playerScore : $computerScore")
        }
        else if ((playerChoice == "stein" && computerChoice == "papier") ||
            (playerChoice == "papier" && computerChoice == "schere") ||
            (playerChoice == "schere" && computerChoice == "stein")) {
            computerScore++
            println("Computer wählt $computerChoice und gewinnt gegen dein(e) $playerChoice! Das Spiel steht $playerScore : $computerScore")
        }
        else {
            playerScore++
            println("Du gewinnst mit $playerChoice über $computerChoice! Das Spiel steht $playerScore : $computerScore")
        }

        println("Runde beendet! Willst du nochmal spielen? (j/n)")
        var input = readln()
        if (input == "n") gameOver = true

    }

    if (gameOver){
        println("Spiel beendet! Finaler Punktestand: \n Du: $playerScore , PC: $computerScore")
        if (playerScore > computerScore) println("Glückwunsch zum Sieg. \n Bis zum nächsten Mal!")
    }


}