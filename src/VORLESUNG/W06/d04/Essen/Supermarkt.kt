package VORLESUNG.W06.d04.Essen

class Supermarkt {
    val lebensmittelListe: MutableList<Lebensmittel> = mutableListOf()

    init {
        addLebensmittelList(listOf(
            Lebensmittel("Joghurt",1.49),
            Fleisch("Rind",8.99,"Kuh"),
            Fleisch("Hühnerbrust","Huhn"),
            Obst("Kirsche"),
            Obst("Mandarine"),
            Obst("Kiwi")
            )
        )

    }

    fun addLebensmittelList(foods: List<Lebensmittel>){
        for (food in foods){
            lebensmittelListe.add(food)
        }
    }

    fun printLebensmittel(){
        for (food in lebensmittelListe){
            println(food.name)
        }
        // alternative:
        // lebensmittelListe.forEach { println(it.name) }
    }

    fun printFleisch(){
        println("----Print Fleisch -----")
        for (food in lebensmittelListe){
            if (food is Fleisch){
                println(food.name)
            }
        }
        // alternative:
        //lebensmittelListe.forEach { if (it is Fleisch) println(it.name) }
    }

    fun printObst(){
        println("----Print Obst -----")
        for (food in lebensmittelListe){
            if (food is Obst){
                println(food.name)
            }
        }
        // alternative:
        //lebensmittelListe.forEach { if (it is Fleisch) println(it.name) }
    }

}