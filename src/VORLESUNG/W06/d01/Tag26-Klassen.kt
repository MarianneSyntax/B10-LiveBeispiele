package VORLESUNG.W06.d01

// Main, in der wir alle Klassen instanziieren (= konkrete Objekte erstellen)
fun main(){

    // Beispiel Initialisierung einer Variable: name, Datentyp, Wert
    var zahl: Int = 0

    // unsere 1. Personen-Instanz:

    // Instanziierung: Erste Instanz von Person
    // name, Klasse als Datentyp, Wert = 1 konkrete Person, mit Klassenname() umsetzbar
    var person1: Person = Person()
    println(person1.name) // anonym, default Wert, den jede Person hat
    println(person1.age) // 0, default Wert, den jede Person hat

    // Default-Attribute überschreiben: normale Zuweisung, wie wir sie schon kennen
    // um an die Attribute ranzukommen, müssen wir mit dem Punktoperator arbeiten.
    // die Attribute sind hier nicht direkt verfügbar, sondern nur über die Instanz.
    person1.name = "Alice"
    person1.age = 20

    // nach der Bearbeitung: neue Werte drin
    println(person1.name) // Alice
    println(person1.age) // 20
    person1.greeting()


//  Zweite Instanz von Person mit anderen Attributen:
    var person2 = Person()
    person2.name = "Brad"
    person2.age = 50
    person2.greeting()
    // Methode, die eine andere Person als Argument entgegennimmt:
    person2.greetPerson(person1) // ganze Person zu übergeben ist aber unnötig, weil uns zum Begruüßen nur der Name interessiert. Deshalb Alternative: Funktion, die das gleiche macht, aber nur einen String übergeben bekommt:
    person2.greetString(person1.name) // der name von person1 ist ein String, passt also



//  Hund instanziieren, Default Infos printen
    var bello: Dog = Dog()
    bello.printInfo()

    var bella: Dog = Dog()
    // Default Infos vom 2. Hund überschreiben:
    bella.name = "Bella"
    bella.age = 5
    bella.breed = "Border Collie"
    bella.gender = "weiblich"
    bella.printInfo()

    // Vorsicht: Klasse einfach so drucken: gibt Adresse, nichts lesbares aus
    println(person1)

    // wenn wir was lesbares haben wollen: auf das Attribut direkt oder unsere Info Methode zugreifen
    println("${person1.dog.printInfo()}")
    bella.bark()
    bella.birthDay()
    bello.birthDay()

    // Person kann ein Attribut dog vom Typ Dog() haben. bella ist ein Dog(), können wir also zuweisen
    person2.dog = bella
    println(person2.printInfo())
    person2.dog.bark()


    // AUTO: Gleiches Prinzip, Attribute können überschrieben werden
    var oldToyota = Car()
    oldToyota.brand = "Toyota"
    oldToyota.color = "schwarz"
    oldToyota.anzahlGänge = 4
    oldToyota.erstZulassung = 1999
    println("-----")
    person2.car = oldToyota
    person2.printInfo()









}