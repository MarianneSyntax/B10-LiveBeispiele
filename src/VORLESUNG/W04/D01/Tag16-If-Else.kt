package VORLESUNG.W04.D01

fun main() {
//    println("Regnet es heute? Bitte true oder false antworten...")
//    var isRaining = readln().toBoolean()
//    println("Scheint die Sonne? Bitte true oder false antworten...")
//    var isSunShining = readln().toBoolean()
//    giveWeatherFeedback(isRaining,isSunShining)

    println("Hey! Zeig deinen Ausweis, wie alt bist du?")
    val age = readln().toInt()
    clubIdCheck(age)

}

fun giveWeatherFeedback(isRaining: Boolean, isSunShining: Boolean){
    if (isRaining == true) {
        println("Es regnet.")
        println("Esr egnet immernoch")
    }
    else if (isSunShining)
        println("Es regnet nicht und die Sonne scheint!")

    else {
        println("Es regnet nicht und die Sonne scheint auch nicht :(")
    }
}

fun clubIdCheck(age: Int){
    // in den Club kommen: man muss 18 Jahre
    if (age == 18) {
        println("Du bist 18, du darfst rein!")
    }
    else if (age > 18) {
        println("Du bist älter als 18, du darfst rein!")
        if (age > 40){
            println("Ü40 Party ist erst nächste Woche... aber komm rein.")
        }
        if (age > 100) {
            println("Wow was machst du noch im Club, wieso lebst du überhaupt noch?")
        }
    }
    else {
        println("Du bist jünger als 18, du darfst nicht rein.")
    }
    println("Die Altersueberpruefung ist beendet.")
}


