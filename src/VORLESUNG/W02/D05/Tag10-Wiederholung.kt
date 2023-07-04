package VORLESUNG.W02.D05

fun main() {

    // WIEDERHOLUNG
    // Listen

    // liste an artists anlegen
    var artistList: List<String> =
        listOf("Die Ärzte", "TuPac", "Macklemore", "Lorde", "Johnny Cash", "Die Ärzte", "TuPac")

    // mutable kopie erstellen, auf die man schreibend zugreifen kann
    var mutableArtists: MutableList<String> = artistList.toMutableList()


    // ein paar operationen
    // (Element einlesen und in die Liste speichern)
    println("Bitte gib deinen Lieblings Artist ein:")

    // 1. Eingabe in Variable speichern
    var favArtistInput: String = readln()

    // 2. erstes Element ersetzen durch Eingabe
    mutableArtists[0] = favArtistInput
    println(mutableArtists)

    // 3. letztes Element entfernen
    mutableArtists.removeLast()
    println(mutableArtists)


    // 4. welches ist jetzt das letzte Element? In einer Variable speichern
    var lastElement = mutableArtists[mutableArtists.size - 1]
    var lastElement2 = mutableArtists.last()

    // 5. liste alphabetisch sortieren, ausgeben
    mutableArtists.sort()
    println(mutableArtists)


    // Maps

    // map anlegen: Artists (Strings) mit jeweils mehreren Songs (Liste aus Strings)

    var liste: List<String> = listOf(
        "string1",
        "string2",
        "string3"
    )
    println(liste)

    var bestSong: Map<String, String> = mapOf(
        "Dire Straits" to "Money for Nothing",
        "Helene Fischer" to "Atemlos",
        "Johnny Cash" to "Blue Train",
        "The Police" to "Every Breath You Take",
        "Mister Mister" to "Broken Wings"
    )
    println(bestSong)


    // Kopie der bestSong Map, die veränderbar ist, erstellen
    var mutableBestSong: MutableMap<String, String> = bestSong.toMutableMap()


    // ein paar operationen:
    // Was ist der Value von The Police?
    var policeSong: String? = bestSong["The Police"]

    // einen artist + song hinzufügen:
    mutableBestSong["Nena"] = "99 Luftballons"

    // eintrag entfernen
    mutableBestSong.remove("Dire Straits")


    // eintrag nur entfernen, wenn er enthält, was wir im value spezifizieren:
    mutableBestSong.remove("Nena", "Irgendwie, irgendwo, irgendwann")


    // Verschachtelte Map:
    var discographies: MutableMap<String, List<String>> = mutableMapOf(
        "Taylor Swift" to listOf("1989", "Speak Now", "Folklore", "Midnights"),
        "Lorde" to listOf("Pure Heroine", "Melodrama", "Solar Power"),
        "Biggie Smalls" to listOf("Ready to Die", "Life After Death", "Album3"),
        "Nena" to listOf("99 Luftballons", "Irgendwie, irgendwo, irgendwann", "Nur geträumt")
    )

    // auf eine liste in der map zugreifen und einen wert entfernen/verändern: wir wollen "Speak Now" löschen

    // 1. die liste anhand des keys rausholen, zwischenspeichern


    // 2. das element aus der liste entfernen


    // 3. die veränderte Liste in den passenden Value schreiben


    // SETS

    // bereits erstellte Liste zum Set machen
    println(artistList)
    var mutableArtistSet: MutableSet<String> = artistList.toMutableSet()
    println(mutableArtistSet)

    // auf einen wert per index zugreifen: nur mit .elementAt() möglich
    var firstArtist = mutableArtistSet.elementAt(0)

    // doppelten wert hinzufügen -> Was passiert?
    mutableArtistSet.add("TuPac")
    println(mutableArtistSet)
    mutableArtistSet.add("Biggie Smalls")
    println(mutableArtistSet)

}