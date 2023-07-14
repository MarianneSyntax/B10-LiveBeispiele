package VORLESUNG.W04.D05

fun main() {

    // Basic Syntax if-else: überprüfe ob eine beliebige Zahl durch 3 teilbar ist
    val zahl1 = 45
    if(zahl1 % 3 == 0){
        println("Die Zahl ist durch 3 teilbar!")
    } else {
        println("Leider nicht durch 3 teilbar.")
    }



    // Basic Syntax when: Ausgabe je nach Wochentag
    // 1) Frage Nutzer nach Wochentag
    // 2) when-Verzweigung für Ausgabe je nach Wochentag
    println("Gib bitte einen Wochentag an: ")
    var eingabe = readln()

    when (eingabe){
        "Montag" -> println("Kacke, schon wieder Montag.")
        "Freitag" -> println("Juhu, bald Wochenende")
        "Samstag" -> {
            println("Es ist Wochenende!")
        }
        else -> println("Kein gültiger Wochentag")
    }



    // Basic Syntax try-catch: Division durch 0 abfangen
    val zaehler = 78
    val nenner = 0

    try {

        var ergebnis = zaehler/nenner
        println("Ergebnis: $ergebnis")

    } catch (e: Exception){

        println("Ergebnis ist nicht teilbar! $e")

    }




    // Beispiel 1: Du spielst Bouncer in einem Club. Überprüfe, ob eine Person reindarf.
    // Darf rein, wenn volljährig und einen Ausweis dabei hat.
    val alter: Int = 25
    val hatAusweis: Boolean = false

    if(hatAusweis && alter >= 18){
        // darf in den Club rein
    } else {
        // darf nicht in Club rein
    }






    // Beispiel 2: Du hast deine Freunde in einer Liste abgespeichert weil du extrem vergesslich bist,
    // überprüfe ob Marvin noch ein Freund von dir ist
    val freunde: List<String> = listOf()






    // Beispiel 3: Wettervorhersage -- je nach Wetter draußen wollen wir eine geeignete Aussage printen
    var wetter = "sonnig" // oder "regnerisch"
    var temperatur = 25



}