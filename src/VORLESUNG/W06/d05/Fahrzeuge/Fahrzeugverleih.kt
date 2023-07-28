package VORLESUNG.W06.d05.Fahrzeuge

class Fahrzeugverleih {

    var alleFahrzeuge: MutableList<Fahrzeug> = mutableListOf()
    private var alleLandFahrzeuge: MutableList<LandFahrzeug> = mutableListOf()

    init {
        alleFahrzeuge.addAll(
            mutableListOf(
                Fahrzeug("BMW"),
                LandFahrzeug("Motorrad"),
                LandFahrzeug("Bus"),
                LandFahrzeug("VW"),
                LandFahrzeug("SUV"),
                LandFahrzeug("Stadtbus",100,50000.0,8),
                Fahrzeug("Motorrad",2),
                Fahrzeug("VW Bus",100,8999.99,4),
                Fahrzeug("Toyota Auto")
            )
        )
        println("---Alle Fahrzeuge:---")
        printFahrzeuge(alleFahrzeuge)

        println("---Alle Landfahrzeuge:---")
        for (fahrzeug in alleFahrzeuge){
            if (fahrzeug is LandFahrzeug){
                alleLandFahrzeuge.add(fahrzeug)
            }
        }
        printFahrzeuge(alleLandFahrzeuge)

    }

    fun addFahrzeug(fahrzeug: Fahrzeug){
        alleFahrzeuge.add(fahrzeug)
        if (fahrzeug is LandFahrzeug) {
            alleLandFahrzeuge.add(fahrzeug)
        }
    }

    fun removeFahrzeug(fahrzeug: Fahrzeug){
        alleFahrzeuge.remove(fahrzeug)
        if (fahrzeug is LandFahrzeug) {
            alleLandFahrzeuge.remove(fahrzeug)
        }
    }

    fun vermieten(fahrzeug: Fahrzeug){
        println("Fahrzeug ${fahrzeug.bezeichner} wird vermietet...")
        fahrzeug.istVermietet = true
        println("${fahrzeug.bezeichner} ist vermietet? -> ${fahrzeug.istVermietet}")
    }

    fun zurueckBringen(fahrzeug: Fahrzeug){
        println("Fahrzeug ${fahrzeug.bezeichner} wird zurück gegeben...")
        fahrzeug.istVermietet = false
        println("${fahrzeug.bezeichner} ist vermietet? -> ${fahrzeug.istVermietet}")
    }

    fun printVermieteteFahrzeuge(fahrzeuge: MutableList<Fahrzeug>) {
        // fahrzeuge.forEach { if (it.istVermietet) println(it.bezeichner)}

        for (fahrzeug in fahrzeuge){
            if (fahrzeug.istVermietet) {
                println(fahrzeug.bezeichner)
            }
        }
    }

    fun printFahrzeuge(fahrzeuge: MutableList<out Fahrzeug>){
        fahrzeuge.forEach { println(it.bezeichner) }
    }

}

fun main(){
    var verleih = Fahrzeugverleih()

    var bmw = verleih.alleFahrzeuge[0]
    verleih.vermieten(bmw)

    bmw.istVermietet // true

    verleih.zurueckBringen(bmw)

    bmw.istVermietet // false




}