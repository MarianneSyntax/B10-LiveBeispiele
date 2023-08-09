package VORLESUNG.W07.Pokemon

fun main(){

    // Instanzen von Pokemon erstellen

    val pikachu = Pokemon("Pikachu", "Elektro", 5)
    val bisasam = Pokemon("Bulbasaur", "Grass")
    val glumanda = Pokemon("Charmander")

    // tackle benutzen

    // pokemon liste
    val pokemonList = listOf(pikachu, bisasam, glumanda)

    // informationen aus der liste ziehen: schleife
    println("----- Pokemon List -----")
    for (pokemon in pokemonList) {
        println("${pokemon.name} (${pokemon.type}), Level ${pokemon.level}")
    }

}