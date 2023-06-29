fun main() {

    // WIEDERHOLUNG

    // liste anlegen

    // mutable kopie erstellen, auf die man schreibend zugreifen kann

    // ein paar operationen (einlesen in eine liste?)




    // maps

    // map anlegen

    // mutable kopie erstellen

    // ein paar operationen

    // geschachtelte map, die listen als values beinhaltet
    var discographies: MutableMap<String, List<String>> = mutableMapOf(
        "Taylor Swift" to listOf("1989", "Speak Now", "Folklore", "Midnights"),
        "Lorde" to listOf("Pure Heroine", "Melodrama", "Solar Power"),
        "Biggie Smalls" to listOf("Ready to Die", "Life After Death", "Album3"),
        "Nena" to listOf("99 Luftballons", "Irgendwie, irgendwo, irgendwann", "Nur geträumt")
    )


    // auf eine liste in der map zugreifen und einen wert entfernen/verändern: wir wollen "Speak Now" löschen

    // 1. die liste anhand des keys rausholen, zwischenspeichern
    var taylor: MutableList<String>? = discographies["Taylor Swift"]?.toMutableList()

    // 2. das element aus der liste entfernen
    taylor?.remove("Speak Now")

    // 3. die veränderte Liste in den passenden Value schreiben
    discographies["Taylor Swift"] = taylor!!

    println(discographies)



}