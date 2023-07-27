package VORLESUNG.W06.d04


/** Beispiel: open und override **/

open class Person(val name: String) {
    init {
        println("Person: $name")
    }

    open var greeting = "Hello, I am $name"

    open fun printGreeting(){
        println("Greeting aus der Superklasse Person: $greeting")
    }
}



class Student(name: String, var studentId: String) : Person(name) {


    override var greeting: String = "(overriden) Moin, ich bin $name."

    override fun printGreeting() {
        println("Greeting aus der Kindklasse Student: $greeting")
    }

    init {
        println("Student: $name, Student ID: $studentId")
        super.printGreeting()
        studentId = studentId
    }
}







fun main(){
    var student = Student("Hanna", "12345")
    println(student.greeting)
    var person = Person("Hanna")
    val sToStudent: Student = person as Student


}