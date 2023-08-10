fun main(){

    var bisasam = PflanzenPokemon("Bisasam",2)
    var glumanda = Pokemon("Glumanda")

    println("----FIGHT!!!!!----")
    fight(bisasam,glumanda)
}

// wenn ich Pokemon übergebe, können auch Pokemon-Kinder übergeben werden
// in der main: fighter1 = Bisasam, fighter2 = Glumanda
fun fight(fighter1: Pokemon, fighter2: Pokemon){
    // solange beide noch leben:
    while (fighter1.hp >0 && fighter2.hp > 0) {
        println("${fighter1.name} hat ${fighter1.hp} HP.")
        println("${fighter2.name} hat ${fighter2.hp} HP.")
        println("---Unser Pokemon legt los---")
        fighter1.chooseAttack(fighter2)
        if(fighter2.stillAlive()){
            println("---Gegner Pokemon wehrt sich---")
            fighter2.tackle(fighter1)
        }
    }

}