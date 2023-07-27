package VORLESUNG.W06.d04
import VORLESUNG.W06.d04.Essen.Fleisch
import VORLESUNG.W06.d04.Essen.Lebensmittel
import VORLESUNG.W06.d04.Essen.Obst
import VORLESUNG.W06.d04.Essen.Supermarkt

fun main() {

    var integer: Int = 9
    var lebensmittel: Lebensmittel = Lebensmittel("Joghurt",0.99)
    // lebensmittel.preis // wir kommen an preis nicht dran, ist protected
    lebensmittel.isVegan // true
    var preis = lebensmittel.getPreiss() // Preis mit Hilfe einer Funktion auspacken
    // lebensmittel.printInternalInfo() // geht nicht, ist privat
    lebensmittel.printInfo()

    var rind: Fleisch = Fleisch("Rind", 7.99, "Kuh")
    rind.isVegan // false
    rind.getPreiss() // methode aus der Elternklasse aufrufbar
    println("-------")
    rind.printInfo()
    rind.braten()

    // primärer konstruktor: default vitamine überschreiben
    var banane: Obst = Obst("Banane",0.77, "nicht vitaminreich")
    // primärer konstruktor: vitamine default behalten
    var orange: Obst = Obst("Orange", 0.59)

    // sekundärer Konstruktor: nur namen angeben
    var kirsche: Obst = Obst("Kirsche")

    // tertiärer konstruktor: keinen preis angeben, hat default preis 10 euro
    var birne: Obst = Obst("Birne", "sehr gesund")
    birne.getPreiss() // 10.0

    println("------ Supermarkt -----")
    var supermarkt: Supermarkt = Supermarkt()
    //println(supermarkt.lebensmittelListe)
    supermarkt.printLebensmittel()

    supermarkt.printFleisch()
    supermarkt.printObst()


    // CAST MIT "AS"  fleischVariable as Lebensmittel
    val rinderfleisch = supermarkt.lebensmittelListe[0] as Fleisch // ohne as Fleisch ist rinderfleisch ein Lebensmittel
    rinderfleisch.braten()










}