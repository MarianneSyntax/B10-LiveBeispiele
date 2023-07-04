package VORLESUNG.W03.D01

// Eine Liste mit Karten
var kartenDeck: List<String> = listOf(
    "Herz Ass",
    "Herz König",
    "Herz Dame",
    "Herz Bube",
    "Karo Ass",
    "Karo König",
    "Karo Dame",
    "Karo Bube",
    "Pik Ass",
    "Pik König",
    "Pik Dame",
    "Pik Bube",
    "Kreuz Ass",
    "Kreuz König",
    "Kreuz Dame",
    "Kreuz Bube"
)

// Eine Map die jeder Karte einen Wert zuordnet
var karteZuWert: Map<String, Int> = mapOf(
    "Herz Ass" to 1,
    "Herz König" to 5,
    "Herz Dame" to 4,
    "Herz Bube" to 3,
    "Karo Ass" to 1,
    "Karo König" to 5,
    "Karo Dame" to 4,
    "Karo Bube" to 3,
    "Pik Ass" to 1,
    "Pik König" to 5,
    "Pik Dame" to 4,
    "Pik Bube" to 3,
    "Kreuz Ass" to 0,   // 0 ist nicht das selbe wie null
    "Kreuz König" to 0,
    "Kreuz Dame" to 0,
    "Kreuz Bube" to 0
)



fun main(){
    // Aufgabe 1: Ein Kartenstapel erstellen und mischen
    var kartenStapel = kartenDeck.toMutableList()
    kartenStapel.shuffle()
    println("Das gemischte Kartendeck: ")
    println(kartenStapel)

    // Aufgabe 2: Eine Karte aufdecken und den Wert anzeigen
    var karte: String = kartenStapel.removeFirst()
    var wert: Int = karteZuWert[karte]!!  // !! weil ich mir sicher bin, dass Wert den ich erhalte nicht null ist

    println("Die gezogene Karte ist $karte mit Wert $wert")
    readln()

    println("----------------------------------")
    // Beiden Spieler einen Namen geben:
    println("Spieler 1: Geben sie ihren Namen ein.")
    var spieler1 = readln()
    println("Spieler 2: Geben sie ihren Namen ein.")
    var spieler2 = readln()

    // Beide Spieler bekommen 3 Karten
    // Spieler 1 (variante 1)
    var spieler1Hand = mutableListOf<String>()
    // 1. Karte
    karte = kartenStapel.removeFirst()
    spieler1Hand.add(karte)
    // 2. und 3. Karte
    spieler1Hand.add(kartenStapel.removeFirst())
    spieler1Hand.add(kartenStapel.removeFirst())

    // Spieler 2 (variante 2)
    var spieler2Hand = mutableListOf(
        kartenStapel.removeFirst(),
        kartenStapel.removeFirst(),
        kartenStapel.removeFirst()
    )

    // Wert der Hände berechnen
    // Spieler 1 (variante 1)
    var spieler1GesamtPunkte: Int = 0

    // 1. Karte
    karte = spieler1Hand[0]
    wert = karteZuWert[karte]!! // ?: 0
    spieler1GesamtPunkte += wert //  spieler1GesamtPunkte = spieler1GesamtPunkte + wert

    // 2. und 3. Karte
    spieler1GesamtPunkte += karteZuWert[spieler1Hand[1]]!! + karteZuWert[spieler1Hand[2]]!!

    println("$spieler1 hat folgende Hand:")
    println(spieler1Hand)
    println("Gesamtpunktzahl: $spieler1GesamtPunkte \n")

    // Spieler 2 (variante 2)
    var spieler2Werte = listOf<Int>(
        karteZuWert[spieler2Hand[0]]!!,
        karteZuWert[spieler2Hand[1]]!!,
        karteZuWert[spieler2Hand[2]]!!
    )
    var spieler2Wert = spieler2Werte.sum()

    println("$spieler2 hat folgende Hand:")
    println(spieler2Hand)
    println("Gesamtpunktzahl: $spieler2Wert \n")

    Thread.sleep(10000) // Programm 10sec warten lassen

    // Niedrigste Karte abwerfen
    println("----------------------------------")


    // Spieler 1 (variante 1)
    var spieler1Werte = mutableListOf(
        karteZuWert[spieler1Hand[0]]!!,
        karteZuWert[spieler1Hand[1]]!!,
        karteZuWert[spieler1Hand[2]]!!,
    )

    // Niedrigste Karte finden
    var niedrigsterWert = spieler1Werte.min()
    var index = spieler1Werte.indexOf(niedrigsterWert)
    var niedrigsteKarte = spieler1Hand[index]

    // Karte abwerfen
    spieler1Hand.remove(niedrigsteKarte)
    spieler1Werte.remove(niedrigsterWert)

    // Neue Karte ziehen
    var neueKarte = kartenStapel.removeFirst()
    spieler1Hand.add(neueKarte)
    var neuerWert = karteZuWert[neueKarte]!!
    spieler1Werte.add(neuerWert)

    // Neue Gesamtpunktzahl
    spieler1GesamtPunkte = spieler1GesamtPunkte - niedrigsterWert + neuerWert
    // oder:
    spieler1GesamtPunkte = spieler1Werte.sum()

    println("$spieler1 wirft ab: $niedrigsteKarte, und zieht dafür $neueKarte")
    println("$spieler1 hat nun folgende Hand:")
    println(spieler1Hand)
    println("Gesamtpunktzahl: $spieler1GesamtPunkte \n")

    // Spieler 2 (variante 2)
    niedrigsterWert = spieler2Werte.min()
    niedrigsteKarte = spieler2Hand.removeAt(spieler2Werte.indexOf(niedrigsterWert))

    neueKarte = kartenStapel.removeFirst()
    spieler2Hand.add(neueKarte)
    neuerWert = karteZuWert[neueKarte]!!

    spieler2Wert += neuerWert - niedrigsterWert

    println("$spieler2 wirft ab: $niedrigsteKarte, und zieht dafür $neueKarte")
    println("$spieler2 hat nun folgende Hand:")
    println(spieler2Hand)
    println("Gesamtpunktzahl: $spieler2Wert \n")

}


fun kartenSpiel(){
    // Spieler einen Namen geben: (Spieler 2 ist der PC)
    println("Spieler 1: Geben sie ihren Namen ein.")
    var spieler1 = readln()

    // Ein Kartenstapel erstellen und mischen
    var kartenStapel = kartenDeck.toMutableList()
    kartenStapel.shuffle()


    // Beide Spieler bekommen 3 Karten
    println("----------------------------------")

    // Spieler 1 (variante 1)
    var spieler1Hand = mutableListOf<String>()
    spieler1Hand.add(kartenStapel.removeFirst())
    spieler1Hand.add(kartenStapel.removeFirst())
    spieler1Hand.add(kartenStapel.removeFirst())

    // Spieler 2 (variante 2)
    var spieler2Hand = mutableListOf(
        kartenStapel.removeFirst(),
        kartenStapel.removeFirst(),
        kartenStapel.removeFirst()
    )

    // Wert der Hände berechnen
    // Spieler 1 (variante 1)
    var spieler1Wert: Int = 0

    // 2. und 3. Karte
    spieler1Wert += karteZuWert[spieler1Hand[0]]!!
    spieler1Wert += karteZuWert[spieler1Hand[1]]!!
    spieler1Wert += karteZuWert[spieler1Hand[2]]!!

    println("$spieler1 hat folgende Hand:")
    println(spieler1Hand)
    println("Gesamtpunktzahl: $spieler1Wert \n")

    // Spieler 2 (variante 2)
    var spieler2Werte = listOf<Int>(
        karteZuWert[spieler2Hand[0]]!!,
        karteZuWert[spieler2Hand[1]]!!,
        karteZuWert[spieler2Hand[2]]!!
    )
    var spieler2Wert = spieler2Werte.sum()

    println("Der PC hat folgende Hand:")
    println(spieler2Hand)
    println("Gesamtpunktzahl: $spieler2Wert \n")


    // Niedrigste Karte abwerfen
    println("----------------------------------")
    // Spieler 1 (variante 1)
    var spieler1Werte = mutableListOf(
        karteZuWert[spieler1Hand[0]]!!,
        karteZuWert[spieler1Hand[1]]!!,
        karteZuWert[spieler1Hand[2]]!!,
    )

    // Niedrigste Karte finden
    var niedrigsterWert = spieler1Werte.min()
    var index = spieler1Werte.indexOf(niedrigsterWert)
    var niedrigsteKarte = spieler1Hand[index]

    // Karte abwerfen
    spieler1Hand.remove(niedrigsteKarte)
    spieler1Werte.remove(niedrigsterWert)

    // Neue Karte ziehen
    var neueKarte = kartenStapel.removeFirst()
    spieler1Hand.add(neueKarte)
    var neuerWert = karteZuWert[neueKarte]!!
    spieler1Werte.add(neuerWert)

    // Neue Gesamtpunktzahl
    spieler1Wert = spieler1Werte.sum()

    println("$spieler1 wirft ab: $niedrigsteKarte, und zieht dafür $neueKarte")
    println("$spieler1 hat nun folgende Hand:")
    println(spieler1Hand)
    println("Gesamtpunktzahl: $spieler1Wert \n")

    // Spieler 2 (variante 2)
    niedrigsterWert = spieler2Werte.min()
    niedrigsteKarte = spieler2Hand.removeAt(spieler2Werte.indexOf(niedrigsterWert))

    neueKarte = kartenStapel.removeFirst()
    spieler2Hand.add(neueKarte)
    neuerWert = karteZuWert[neueKarte]!!

    spieler2Wert += neuerWert - niedrigsterWert

    println("Der PC wirft ab: $niedrigsteKarte, und zieht dafür $neueKarte")
    println("Der PC hat nun folgende Hand:")
    println(spieler2Hand)
    println("Gesamtpunktzahl: $spieler2Wert \n")
}