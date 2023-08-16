package VORLESUNG.W07.TimeDate

import java.time.*

fun main(){
    // Zeitpunkte definieren
    // konkrete Zeitpunkte:
    var mittagsPauseStart = LocalTime.of(12, 0)
    var mittagsPauseEnde = LocalTime.of(12, 59, 59)

    // aktueller Zeitpunkt: now
    val aktuelleZeit: LocalTime = LocalTime.now()

    // Zeit relativ zu einem anderen Zeitpunkt
    val endZeit: LocalTime = aktuelleZeit.plusSeconds(30)

    // Zeitspannen macht man mit der Klasse *Duration*
    var mittagsPauseDauer = Duration.between(mittagsPauseStart, mittagsPauseEnde)

    println("""
        Die Mittagspause dauert:
        ${mittagsPauseDauer.toHours()}   Stunden
        ${mittagsPauseDauer.toMinutes()} Minuten.
        ${mittagsPauseDauer.seconds%60}     Sekunden
    """.trimIndent())

    println("----------------")
    println("Ein simpler Countdown")
    countdown(10)
    println("🥳")
}

// Man braucht Zeit nicht unbedingt
fun countdown(seconds: Int) {
    for (i in seconds downTo 0) {
        if (i == 9)
            print("\b")

        print("\b$i")

        if (i != 0)
            Thread.sleep(1000)
        else
            println()
    }
}