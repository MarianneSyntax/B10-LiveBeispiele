package VORLESUNG.`W05-Schleifen`.d03

fun main() {
    // Break mit Liste
    val animals: List<String> = listOf("Tiger", "Maus", "Löwe", "Gepard", "Leopard", "weißer Tiger")
    findMouseInList(animals)

    // Break mit Map: selbes Prinzip, aber gesteigerte Komplexität
    val animalMap = mapOf(
        "Tiger" to true,
        "Maus" to false,
        "Löwe" to true,
        "Leopard" to true,
        "Gepard" to true,
    )
    findMouseInMap(animalMap)

    // 4. Fisch Beispiel aus der VL

}

// 2. Maus in Map finden, sobald sie gefunden ist abbrechen
fun findMouseInMap(map: Map<String,Boolean>){
    for ((animal,status) in map){
        // wenn status true ist
        if (status) {
            // tier drucken
            println("$animal ist eine Raubkatze!")
            // wenn status falsch ist
        } else if(!status) {
            println("$animal ist eine Maus, keine Raubkatze! Abbrechen...")
            // abbrechen
           break
        }
    }
}


// 1. Maus in Liste finden, sobald sie gefunden ist abbrechen
fun findMouseInList(list: List<String>){
    // durch liste iterieren
    for (i in list){
        // wenn element == Maus ist --> abbrechen
        if (i == "Maus"){
            println("Maus gefunden! Abbruch...")
            break
        }
        else {
            // ansonsten: element ausdrucken
            println(i)
        }
    }

    chess()
}

// 3. Schachbrett: Abbrechen, sobald wir bei H8 sind
fun chess(){
    var abc: CharRange = 'A'..'Z'
    for (letter in abc){
        if (letter > 'H'){
            break
        }
        for (number in 1..8){
            print("$letter$number ")
        }
        println("")

    }


}


