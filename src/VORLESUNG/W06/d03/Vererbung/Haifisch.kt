package VORLESUNG.W06.d03.Vererbung

// Haifisch erbt von Fisch
class Haifisch(name: String): Fish(name) {

    // eat() vom Fisch überschreiben, sodass stattdessen dieses eat hier benutzt wird:
    override fun eat() {
        println("Der Hai $name frisst nur Fleisch. Mit regulärem Futter wird das nichts.")
    }

}