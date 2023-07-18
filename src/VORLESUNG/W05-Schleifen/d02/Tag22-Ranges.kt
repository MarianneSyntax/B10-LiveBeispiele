package VORLESUNG.`W05-Schleifen`.d02


fun main(){
    // Ranges sind nicht das gleiche wie listen, ein paar Beispiele
    // Würfel

    var wuerfel: IntRange = (1..6)
    // so wird eine Range ausgegeben
    println("Würfel Range: $wuerfel")
    // im Gegensatz zu einer Liste:
    println("Würfel Liste: " + wuerfel.toList())

    var abc: CharRange = ('a'..'z')
    println("ABC Range: $abc")
    println("ABC Liste: " + abc.toList())


    // Ranges mit step werden zu Progressions

    var numbers = 1..10 step 2
    println("Range mit Step: $numbers")
    println("Range mit Step als Liste: ${numbers.toList()}")

    useDownTo()

}

// DOWNTO: satz rückwärts printen

fun useDownTo(){
    var range = 10 downTo  1 // mit .. abwärts: geht nicht, gibt [] zurück
    for (i in range){
        println(i)
    }
}

