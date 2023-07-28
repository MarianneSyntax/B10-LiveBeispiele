package VORLESUNG.W06.d05.Konzert

class HolzBlasInstrument(name: String): BlasInstrument(name,"ein holziger Klang") {

    override fun play() {
        super.play()
        println("Die $name spielt heute ganz besonders schön...")
    }
}