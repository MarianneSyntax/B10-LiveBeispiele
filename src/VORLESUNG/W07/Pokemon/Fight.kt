package VORLESUNG.W07.Pokemon


fun choosePokemon(): Pokemon {
        println("Welches Pokemon soll kämpfen?")
        var nameInput = readln()
    Thread.sleep(500)
        println("Das Pokemon heißt also $nameInput! \n Welchem Typ gehört es an? (Pflanze oder Feuer wählen)")
        var typeInput = readln()

        if (typeInput == "Pflanze"){
            Thread.sleep(500)
            println("Soso, $nameInput ist also ein $typeInput-Pokemon!")
            var fighter1 = PflanzenPokemon(nameInput,1)
            return fighter1
        } else if (typeInput == "Feuer"){
            Thread.sleep(500)
            println("Soso, $nameInput ist also ein $typeInput-Pokemon!")
            var fighter2 = FeuerPokemon(nameInput, 4)
            return fighter2
        } else {
            Thread.sleep(500)
            println("Kein Standard-Typ ausgewählt. Es wird ein Taubsi erstellt.")
            return Pokemon("Taubsi", "Normal")
        }
    }


fun main(){

    // ohne level instanziieren: ist dann automatisch level 1
    var pokemon1 = Pokemon("Bisasam", "Pflanze")
    // mit level instanziieren
    var pokemon2 = Pokemon("Glumanda", "Feuer",2)


















    var fighter1 = PflanzenPokemon("Bisasam",10)
    var fighter2 = FeuerPokemon("Glumanda",1)

    while(fighter1.hp > 0 && fighter2.hp > 0) {
        fight(fighter1,fighter2)

    }

}

fun fight(fighter1: Pokemon, fighter2: Pokemon) {
    if (fighter1.stillAlive())
    println("---Unser Pokemon ${fighter1.name} greift an!---")
    Thread.sleep(500)
    fighter1.chooseAttack(fighter2)
    Thread.sleep(500)
    if (fighter2.stillAlive()) {
        println("---Unser Gegner ${fighter2.name} wehrt sich!---")
        Thread.sleep(500)
        fighter2.randomAttack(fighter1)
    } else {
        println("Der Kampf ist vorbei! ${fighter1.name} hat gesiegt!")
    }
}
