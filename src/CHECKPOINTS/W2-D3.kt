
fun main() {
    var batch10: MutableList<String> = mutableListOf(
            "Karam",
            "Aubeid",
            "Vanessa",
            "Danny",
            "Mustafa",
            "Aulon",
            "Emre",
            "Patrick",
            "Markus",
            "Timur",
            "Philipp",
            "Sara",
            "Hassan",
            "Marius",
            "Ben",
            "Christian",
            "Vincent",
            "Flama",
            "Mike",
            "Dennis",
            "Marco",
            "Timo",
            "Sven",
            "Anestis",
            "Sandra",
            "Siarhei",
            "Bülent",
    )
    //Wie viele sind wir in Batch 10?
    println("In Batch 10 sind derzeit: ${batch10.size} Personen")



    //Riccardo ist heute neu dabei, wie können wir Riccardo unserem Batch hinzufügen?
    batch10.add(0, "Riccardo")  //über .add() wird hier an Index "0" das Element "Riccardo" hinzugefügt
    println(batch10)



    //Was wird ausgegeben, wenn wir nach unserem "maximalen Wert" suchen?
    var maxBatch10 = batch10.max()  //Uns wird "Vincent" ausgegeben, da sein Name innerhalb der Liste den "maximalen Wert im Alphabet" hat
    println(maxBatch10)



    //Ich möchte gerne unsere Liste für CP2 alphabetisch sortiert haben
    var sortBatch10 = batch10.sorted()
    /*sorted() nutzen wir, wenn wir eine neue Variable erstellen wollen
    Wir beziehen die Methode sorted() dabei auf die bestehende Liste batch10 und speichern sie in der neuen Variable ab*/
    println(sortBatch10)

    batch10.sort()
    println(batch10)
    /*sort() nutzen wir, wenn wir unsere bestehende Liste verändern wollen
    Wir beziehen die Methode sort() dabei auf die bestehende Liste batch10 und ändern damit die Liste batch10*/



    //Es sollen im Alphabet die ersten sechs Personen vorstellen (jede/r 4 Aufgaben)
    println(batch10.subList(0,6))
    //bei sublist() werden alle Listenteile AUSGENOMMEN des letzten Index, also ohne den letzten Index wiedergegeben
    println(batch10.slice(0..5))
    //bei slice() werden alle Listenteile INKLUSIVE des letzten Index, also mit dem letzten Index wiedergegeben


}