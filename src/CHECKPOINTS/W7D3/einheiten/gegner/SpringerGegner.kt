package CHECKPOINTS.W7D3.einheiten.gegner

import CHECKPOINTS.W7D3.interfaces.Attack
import CHECKPOINTS.W7D3.interfaces.Springen
import CHECKPOINTS.W7D3.einheiten.Einheit

class SpringerGegner: Einheit(10), Springen, Attack {
    override fun springen() {
        println("Springer")
    }

    override fun angreifen(target: Einheit) {
        target.hp -= 10
    }

}