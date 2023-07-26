package VORLESUNG.W06.d03.Vererbung

fun main(){
    var animal = Animal("Tiger",false,false)
    animal.makeSound()
    var fisch = Fish("Clownfisch")
    var goldfisch = Fish("Goldfisch")
    goldfisch.printInfo()
    goldfisch.makeSound()
    var hai = Haifisch("Haiko")
    hai.eat()

}