package VORLESUNG.W06.d01

fun main(){

    // While Schleife: Kopf oder Zahl
    // 10 Runden mit sinnigem User Feedback

    var i = 1
    var points = 0
    while (i <= 10){
        println("Runde $i!")
        println("Kopf oder Zahl?")
        val input = readln().lowercase()
        val coin = listOf("kopf", "zahl").random()
        println("Münzwurf... $coin")
        Thread.sleep(500)
        if (input == coin){
            println("Richtig geraten!")
            points++
            Thread.sleep(500)
            println("Punktestand: $points")
        }
        else {
            println("Leider falsch.")
            Thread.sleep(500)
            println("Punktestand: $points")
        }
        i++
    }
    println("Spiel beendet! In ${i-1} Runden hast du $points mal richtig geraten.")


}