package VORLESUNG.W04.D02

import java.time.LocalTime

fun main(){

    // alt genug zum wählen mit if
    //oldEnoughToVote()

    // gruß je nach uhrzeit
    println("Bitte gib die aktuelle Uhrzeit ein...")
    var time: Int = readln().toInt()
    //var currentTime = LocalTime.now().hour

    when (time){
        in 0..9 -> println("Wow, du bist um $time aufgestanden, Frühaufsteher!")
        in 10..12 -> println("So spät, erst um $time, aufgestanden? Langschläfer")
        in  13..18 -> println("Es ist Nachmittag")
        else -> println("Es ist Abend.")
    }


}

fun oldEnoughToVote(){
    println("Bitte gib dein Geburtsjahr ein...")
    var birthYear: Int = readln().toInt()

    if (2023-birthYear >= 18){
        println("Du bist alt genug zum wählen, komm rein!")
    } else{
        println("Du musst noch ein paar Jahre warten, bis du wählen darfst...")
    }

}

