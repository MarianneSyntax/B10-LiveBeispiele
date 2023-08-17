import CHECKPOINTS.W7D3.einheiten.*
import CHECKPOINTS.W7D3.einheiten.gegner.*
import CHECKPOINTS.W7D3.interfaces.*

fun main() {
    val swg = SpringenderWerfenderGegner()
    val sg = SpringerGegner()

    val einheitenListe = mutableListOf<Einheit>(swg, sg)

    einheitenListe.forEach {
        if (it is Attack) {
            it.angreifen(sg)
        }
        if (it is Springen) {
            it.springen()
        }
        if (it is Werfen) {
            it.werfen()
        }
    }

}

