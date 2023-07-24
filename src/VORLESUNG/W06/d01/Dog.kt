package VORLESUNG.W06.d01

class Dog {
    var name: String = "Bello"
    var age: Int = 0
    var breed: String = ""
    var color: String = "brown"
    var weight: Double = 10.0
    var gender: String = ""


    fun printInfo(){
        println("Name: $name")
        println("Alter: $age")
        println("Rasse: $breed")
        println("Farbe: $color")
        println("Gewicht: $weight")
        println("Geschlecht: $gender")
    }

    fun bark(){
        println("Woof! Woof!")
    }

    fun birthDay(){
        age++
        println("Es ist $name's Geburstag! $name ist jetzt $age Jahre alt.")
    }

}