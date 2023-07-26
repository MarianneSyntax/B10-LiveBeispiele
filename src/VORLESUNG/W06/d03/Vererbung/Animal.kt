package VORLESUNG.W06.d03.Vererbung

// Klasse zur Elternklasse (vererbenden Klasse) machen: open Schlüsselwort

open class Animal(var name: String, var canFly: Boolean, var canSwim: Boolean){

    init {
        println("Animal namens $name initialisiert (Elternklasse)")
    }

    open fun eat(){
        println("Animal $name frisst....")
    }

    open fun makeSound(){
        println("Animal $name macht einen Laut...")
    }

    open fun printInfo(){
        println("Informationen über das Tier:")
        println("Name: $name")
        println("Kann fliegen: $canFly")
        println("Kann schwimmen: $canSwim")
    }

}
