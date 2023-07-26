package VORLESUNG.W06.d03

// Beispiel aus dem Klassendiagramm in der Vorlesung: mit Liste an Konten statt Map
class Bank(var register: MutableList<Konto>, jahresZins: Double) {

    init {
        println("Bank erstellt mit folgenden Konten von:")
        // Liste an Konten, die in der Bank existieren, wird mit Lambda gedruckt
        register.forEach{println(it.name)}
        println("\n und Jahreszins von $jahresZins")
    }

    // neues Konto erstellen: zur Liste register hinzufügen
    fun openKonto(name: String){
        var newKonto = Konto(name)
        register.add(newKonto)
    }

    // Geld abheben: Pin checken, namen checken, abheben
    fun getMoney(name: String, betrag: Double, pin: Int ){
        println("$name möchte $betrag abheben.")
        println("Überprüfen, ob er im Register existiert...")
        for (konto in register){
            if (name == konto.name) {
                if (pin == konto.pin) {
                    println("Guthaben vorm Abheben: ${konto.name}")
                    konto.betrag -= betrag
                    println("Abgehobener Betrag: $betrag, neuer Kontostand: ${konto.betrag}")
                } else println("Falsche Pin eingegeben! So gibt's kein Geld...")
            }
        }
    }
}