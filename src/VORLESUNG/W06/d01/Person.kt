package VORLESUNG.W06.d01

// Eine Klasse ist eine Definition/Blaupause für Instanzen (= konkrete Objekte)

class Person {
    // Daten/Atrribute: Default Initialisierung, das bedeutet: jede Instanz wird genau diese Eigenschaften haben, es sei denn, wir überschreiben sie
    var name: String = "anonym"
    var age: Int = 0
    var dog: Dog = Dog()
    var car: Car = Car()

    // Verhalten/Methoden: können mit dem Punktoperator auf einer Instanz aufgerufen werden
    fun greeting(){
        println("Hi, ich bin $name und ich bin $age Jahre alt.")
    }


    // lohnt sich, statt in der main für jedes Attribut einzelne printlns zu schreiben
    fun printInfo(){
        println("Name: $name")
        println("Alter: $age")
        dog.printInfo()
        println("Auto: ${car.brand}")
        println("Alle Infos zum Auto: ")
        car.printInfo()
    }

    // Methoden können Klassen übergeben werden
    fun greetPerson(person: Person){
        println("Hallo ${person.name} ich bin $name")
    }

    // und normale Datentypen, die wir bereits kennen und nicht selbst anlegen, auch.
    fun greetString(person: String){
        println("Hallo $person ich bin $name")
    }
}
