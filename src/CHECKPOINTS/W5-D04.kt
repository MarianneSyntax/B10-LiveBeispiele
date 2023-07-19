package CHECKPOINTS

/**
Anforderungen:
x - Es soll 2 Charaktere geben
- Es soll mehrere Attacken geben
    - Attacken machen unterschiedlichen Schaden
    - Unterschiedliche Attacken (Feuerball vs Eiszauber)
x - Die Charaktere haben Lebenspunkte (z.B. 100 LP)
- Game Over wenn Character stirbt
- Abwechselnde Aktionen (Rundenbasiert)
 */

/**
 * weitere Features:
 * Random auswahl der Spielzüge
 */
var feuerzauberer = 100
var eisriese = 100
var feuerAttacke = 7
var eisAttacke = 7

fun main() {
    // eisriese greift Feurzauberer an


    //Todo: Was ist wenn die LP 1000 sind und 20 runden nicht reichen?
    for( i in 1..20) {
        kampf(i) // Kampf findet statt

        var zauberIstTot = feuerzauberer <= 0
        var rieseIstTot = eisriese <= 0
        if(zauberIstTot && rieseIstTot) {
            println("Es war ein unentschieden")
            break
        }else if(zauberIstTot) {
            println("Feuerzauberer ist tot und der Eisriese gewinnt")
            break
        }else if(rieseIstTot) {
            println(" Eisriese ist tot und der Feuerzauberer gewinnt")
            break
        }


    }

}

fun kampf(runde: Int) {
    println("Runde $runde beginnt:")
    var schaden = feuerzauberer - eisAttacke
    feuerzauberer = schaden
    var schaden2 = eisriese - feuerAttacke
    eisriese = schaden2
    println("Der Eisriese greift an und zieht den Feuermagier durch den Schnee doch im Schnee war ein Stein dadurch hat er nur noch $schaden LP")
    println()
    println("Der Feuerzauberer schleudert einen Feuerball auf den Eisriesen wodurch dieser jetzt $schaden2 LP hat.")
}