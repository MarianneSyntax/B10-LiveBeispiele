package VORLESUNG.W06.d03

open class Person(var name: String)

class Student: Person {
    var age: Int = 0
    constructor(name: String, age: Int) : super(name){
        println("Primärer Konstruktor aufgerufen: Name = $name, Alter = $age")
    }


    // Sekundärer Konstruktor, der den primären Konstruktor aufruft
    constructor(name: String) : this(name, 0) {
        println("Sekundärer Konstruktor aufgerufen: Alter auf 0 gesetzt.")
        println("Name: $name, Alter: $age")
    }

    // weiterer Sekundärer Konstruktor, der den primären Konstruktor aufruft
    constructor(name: String, age: Int, schoolYear: Int) : this(name, age) {
        println("Sekundärer Konstruktor aufgerufen: \n Name $name, \n Alter $age, \n ist in der $schoolYear. Klasse.")
    }

}

fun main(){
    var s1 = Student("Max Mohr")
}
