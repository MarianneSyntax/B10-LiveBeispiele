package VORLESUNG.W03.D04

fun main(){
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
        "Kreuz Ass" to 1,
        "Kreuz König" to 5,
        "Kreuz Dame" to 4,
        "Kreuz Bube" to 3
    )

    // mutable Kopie des Decks
    val kartenStapel = kartenDeck.toMutableList()

    // Stapel mischen, ausgeben
    kartenStapel.shuffle()

    // Aufgabe 2: 1. Karte nehmen
    var firstCard = kartenStapel.removeFirst()
    // println(firstCard)
    // Alternative ohne Variable: direkt das Ergebnis von removeFirst() printen
//    println(kartenStapel.removeFirst())
//    println("Spielvorbereitung abschlossen!")
    println("Gemischter Kartenstapel: $kartenStapel")

    // Aufgabe 3:
    var valueFirstCard = karteZuWert[firstCard]
    // könnte zB karteZuWert["Herz Ass"] sein

    println("Der Wert von $firstCard ist $valueFirstCard")

    // Aufgabe 4:
   // println("Player1 name eingeben...")
    val player1Name = "Jack"
   // println("Player2 name eingeben...")
    val player2Name = "Jill"

    // leere player hände, in die abwechselnd 1 karte eingefügt wird:
    val player1Hand: MutableList<String> = mutableListOf()
    val player2Hand: MutableList<String> = mutableListOf()

    // Funktionsaufruf:
    pullCard(player1Name,kartenStapel,player1Hand)
    pullCard(player2Name,kartenStapel,player2Hand)
    pullCard(player1Name,kartenStapel,player1Hand)
    pullCard(player2Name,kartenStapel,player2Hand)
    pullCard(player1Name,kartenStapel,player1Hand)
    pullCard(player2Name,kartenStapel,player2Hand)

    println("$player1Name's Hand: $player1Hand")
    println("$player2Name's Hand: $player2Hand")

    // Aufgabe 5:

    // 1. leere Liste and Values anlegen
    val player1Values: MutableList<Int> = mutableListOf()
    val player2Values: MutableList<Int> = mutableListOf()

    // Funktionsaufruf:
    getHandValues(player1Name,player1Hand,karteZuWert,player1Values)
    getHandValues(player2Name,player2Hand,karteZuWert,player2Values)

    // Aufgabe 6:
    // 1. Karte mit niedrigstem Wert finden, aus beiden Listen entfernen (hand und values)

    // Funktionsaufruf:
    removeMin(player1Name,player1Hand,player1Values)
    removeMin(player2Name,player2Hand,player2Values)

    // 6.2: Neue Karte ziehen, zu Hand und Values hinzufügen
    // Lange Variante mit Variablen
    // gezogene Karte in Variable speichern

    pullCard(player1Name, kartenStapel,player1Hand)
    pullCard(player2Name,kartenStapel,player2Hand)

    // Wert der neu gezogenen Karte in playerValues hinzufügen
    // 1. Schritt: value in Variable speichern
    var newCardValue = karteZuWert[player1Hand.last()]!!
    player1Values.add(newCardValue)
    // kürzere Variante:
    player2Values.add(karteZuWert[player2Hand.last()]!!)

    println("Neue Hand $player1Name: $player1Hand, $player1Values")
    println("Neue Hand $player2Name: $player2Hand, $player2Values")

    // ALTERNATIVE 6.2: getValues() nutzen
    player1Values.clear()
    player2Values.clear()
    getHandValues(player1Name,player1Hand,karteZuWert,player1Values)
    getHandValues(player2Name,player2Hand,karteZuWert,player2Values)
}

fun pullCard(playerName: String, kartenStapel: MutableList<String>, playerHand: MutableList<String>){
    println("$playerName zieht...")
    // 1. Version: mit Variable für neue Karte
    val newCard = kartenStapel.removeFirst()
    playerHand.add(newCard)
    println("Gezogene Karte: $newCard")

    // value der gezogenen Karte zu den Values hinzufügen:

    // 2. Version
    //player2Hand.add(kartenStapel.removeFirst())
    println("$playerName Hand mit neuer Karte: $playerHand")
}

fun getHandValues(playerName: String, playerHand: MutableList<String>, karteZuWert: Map<String, Int>, playerValues: MutableList<Int>){
    // 1. Variante: mit Variablen
    // Erste Karte auf der Hand identifizieren:
    var card = playerHand.first() // player1Hand[0]

    // Wert dieser Karte rausfinden:
    var cardValue = karteZuWert[card]!!

    // Wert zu playerValues hinzufügen:
    playerValues.add(cardValue)

    // 2. Variante ohne Variablen:
    playerValues.add(karteZuWert[playerHand[1]]!!)
    playerValues.add(karteZuWert[playerHand[2]]!!)
    println("$playerName's Karten: $playerHand")
    println("Werte der Karten: $playerValues")
}

fun removeMin(playerName: String, playerHand: MutableList<String>, playerValues: MutableList<Int>){
    // 1. Niedrigste Karte in Variable speichern
    var player1MinVal = playerValues.min()
    println("Kleinster Wert auf der Hand von $playerName: $player1MinVal")

    // 2. Index der niedrigsten Karte in Variable speichern:
    var indexPlayer1MinVal = playerValues.indexOf(player1MinVal)

    // 3. Über diesen Index den Wert aus der Hand löschen
    var removedCard = playerHand.removeAt(indexPlayer1MinVal)
    var removedVal = playerValues.removeAt(indexPlayer1MinVal) // oder: .remove(player1MinVal)
    println("Gelöschte Karte mit kleinstem Wert: $removedCard (Wert: $removedVal)")

    // kurze Variante:
    //playerValues.removeAt(playerValues.indexOf(playerValues.min()))
}


