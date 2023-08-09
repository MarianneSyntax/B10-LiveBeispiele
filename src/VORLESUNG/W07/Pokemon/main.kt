package VORLESUNG.W07.Pokemon
import Pokemon

fun main(){

    var integer: Int = 0
    var bisasam: Pokemon = Pokemon("Bisasam", "Pflanze", 5)
    println("Ungelevelt: ${bisasam.level}")
    bisasam.level += 1
    println("In der Main gelevelt: ${bisasam.level}")
    bisasam.levelUp()
    println("Mit Funktion gelevelt: ${bisasam.level}")

    println("Name eingeben")
    var inputName = readln()
    println("Type eingeben")
    var inputType = readln()
    var inputPokemon = Pokemon(name = inputName,type = inputType)
    println("Neues Pokemon erstellt: ${inputPokemon.name}")


    var taubsi = Pokemon("Taubsi")
    var rattfratz = Pokemon("Rattfratz")
    var tauboga = Pokemon("Tauboga")

    var schillock = Pokemon("Schillok", false)

    schillock.tackle(tauboga)

    // Liste an Pokemons erstellen:

    var pokemonList: MutableList<Pokemon> = mutableListOf(bisasam,taubsi,tauboga,rattfratz,schillock)

 //   schillock.flaechenAttacke(pokemonList)

    // informationen aus der Liste printen: Schleife
   printAllPokemon(pokemonList)

    // Alternative: Lambda ohne it
    pokemonList.forEach { pokemon ->
        println("Name: ${pokemon.name}, Typ: ${pokemon.type}, Level: ${pokemon.level}") }

    // Lambda mit it
    pokemonList.forEach {
        println("Name: ${it.name}, Typ: ${it.type}, Level: ${it.level}") }

}

fun printAllPokemon(pokemonList: MutableList<Pokemon>){
    for (pokemon in pokemonList){
        println("Name: ${pokemon.name}, Typ: ${pokemon.type}, Level: ${pokemon.level}")
    }
}