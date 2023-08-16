package VORLESUNG.W07.TimeDate

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    // heutiges Datum
    println("---Heutiges Datum---")
    var today  = LocalDate.now()
    println(today)


    // heutiges Datum mit Uhrzeit
    println("---Heutiges Datum mit genauer Uhrzeit---")
    val todayWithTime = LocalDateTime.now()
    println(todayWithTime)

    println("---In Variable gespeicherter Geburtstag---")
    // Datum in einer Variable speichern
    val birthday = LocalDate.of(1999,3,31)
    println(birthday)

    println("---Geburtsdatum selber eingeben, als LocalDate speichern ---")
    println("Tag:")
    val day = readln().toInt()
    println("Monat:")
    val month = readln().toInt()
    println("Jahr:")
    val year = readln().toInt()
    val newBirthday = LocalDate.of(year,month,day)
    println("Eingegebener Geburtstag: $newBirthday")

    println("---Eingegebenes Geburtsdatum volljährig?---")
    // checken, ob newBirthday über 18 Jahre her ist
    var todayMinus18 = today.minusYears(18).plusDays(1) // 1 Tag addieren, weil sonst heute geborene Leute nicht als 18 gelten

    if (newBirthday.isBefore(todayMinus18)) {
        println("ist volljährig")
    }
    else {
        println("ist unter 18")
    }

    println("--Vor dem Formattieren--")
    // es wird erwartet, dass das Datum nach Scheme tag-MONAT-jahr eingegeben wird
    val formatMonatAlsZahl = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val date = LocalDate.now() // irgendein Datum
    println(date)
    println("--Nach dem Formattieren:--")
    val formattedDateZahl = date.format(formatMonatAlsZahl)
    println(formattedDateZahl)

    // ohne variable, mit monat als text format:
    val formattedDateText = date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"))
    println(formattedDateText)

}