package CHECKPOINTS

fun main(){

    // Eine Liste mit Karten
    var kartenDeck: MutableList<String> = mutableListOf(
        "Herz Ass", // 0
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
        "Kreuz Bube" // 14
    )

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
        "Kreuz Ass" to 1,
        "Kreuz König" to 5,
        "Kreuz Dame" to 4,
        "Kreuz Bube" to 3
    )

    // zweite Map zum Verständnis, gibt keine Konflikte
    var werte2: Map<String, Int> = mapOf(
        "Herz Ass" to 1,
        "Herz König" to 5,
        "Herz Dame" to 4,
        "Herz Bube" to 3,
        "Karo Ass" to 1,
    )

    // Beispiel Zugriff Map
    var wert = karteZuWert["Herz Ass"]


    // wiederholt 3x pro Spieler
    var handSpieler1: MutableList<String> = mutableListOf()

    // 1) erste Karte speichern
    var obersteKarte: String = kartenDeck[0]

    // 2) diese Karte der Hand des Spielers zuweisen
    handSpieler1.add(obersteKarte)

    // 3) die Karte aus dem Stapel löschen
    kartenDeck.removeFirst()




    // simulierte Hand von Spieler Nico
    var handNico: List<String> = listOf("Kreuz Ass", "Kreuz Bube", "Karo Dame")

    // Wert von Karte 1 ermitteln
    var key = handNico[0]
    var wertKarte1: Int? = karteZuWert[key]

    // Wert von Karte 2 ermitteln


    // Wert von Karte 3 ermitteln

    // Gesamtwert Nicos Hand ermitteln



    var testSet: MutableSet<String> = mutableSetOf("Rot", "Gelb", "Lila", "Rot")
    println(testSet)
    println(testSet.size)

    //var setWert = testSet[0]

}

