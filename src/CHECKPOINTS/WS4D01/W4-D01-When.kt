package CHECKPOINTS.WS4D01

fun main() {

    val weekday = "Montag"

    when(weekday) {
        "Montag" -> println("Heute ist Montag")
        "Dienstag" -> println("Heute ist Dienstag")
        "Mittwoch" -> println("Heute ist Mittwoch")
    }

    //Macht das gleiche wie oben das when
    if(weekday == "Montag") {
        println("Heute ist Montag")
    }else if(weekday == "Dienstag") {
        println("Heute ist Dienstag")
    }else if(weekday == "Mittwoch") {
        println("Heute ist Mittwoch")
    }

}