package VORLESUNG.W07.Pokemon


class FeuerPokemon(name: String, level: Int) : Pokemon(name,"Feuer",level) {
    init {
        println("$name ist ein Feuer-Pokemon.")
    }
}
