package VORLESUNG.W06.d03

fun main(){
    var studentMitPK = Student("Jessica", 13)
    println("--------")
    var studentMit2K = Student("Baby")
    println("--------")
    var stundentMit3K = Student("Leon", 10,5)


    var pizza = Pizza("Mozarella", listOf(Ingredient("Mozarella", 2.49), Ingredient("Tomate", 2.0), Ingredient("Basilikum", 0.99)))
    println(pizza.price)

    println("------")
    println("Pizza mit sekundärem Konstruktor:")

    var pizzaToGo = Pizza("Tuna", listOf(Ingredient("Thunfisch",2.49)))

    println("------")
    println("------")
    println("------")

}