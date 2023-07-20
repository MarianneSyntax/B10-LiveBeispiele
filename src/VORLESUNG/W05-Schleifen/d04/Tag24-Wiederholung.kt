package VORLESUNG.`W05-Schleifen`.d04

fun main(){
    // Wiederholung: for Schleife mit break
   fishingBreak()
}



val FISH = listOf("Hecht", "Hering", "Aal", "Makrele", "Barsch", "Dose")

// wenn Dose geangelt wird: komplett abbrechen

fun fishingBreak(){
    // liste, in der die fische gespeichert werden
    val caughtFish: MutableList<String> = mutableListOf()
    // für 20 male (bei 20x muss irgendwann die Dose kommen, sehr unwahrscheinlich, dass sie nicht auftaucht):
    for (i in 1..20){
        // random fisch rausholen
        val nextFish = FISH.random()
        if (nextFish == "Dose"){
            println("Dose geangelt, der See ist komplett verschmutzt :( ")
            // Schleife beenden
            break
            // wenn fisch != dose
        } else {
            // in die liste speichern
            caughtFish.add(nextFish)
            println("$nextFish gefangen!")
        }
    }
    println("Gefangene Fische: $caughtFish")







}

// wenn Dose geangelt wird: nicht hinzufügen, sondern skippen

fun fishingContinue() {

}
