package VORLESUNG.`W05-Schleifen`.d04




fun main() {

        // greaterFive als Funktion
        fun greaterFiveFun(nr: Int): Boolean {
            val result = nr > 5
            println("$nr is greater than 5? -> $result")
            return result
        }
    greaterFiveFun(7)

         // Gegenüberstellung:
        // greaterFour als Lambda
        var greaterFour = { nr:Int -> (nr>4) }
        var x = greaterFour(readln().toInt())
        var y = greaterFour(9) // true

        var addNrWith2 = {nr:Int -> nr+2}

        var zweiPlusZwei = addNrWith2(2)
        var dreiPlusZwei = addNrWith2(3)


         val planets = listOf("Mein ", "Vater ", "erklaert ", "mir ", "jeden ", "Sonntag ", "unsere ", "neun ", "Planeten")
       // Planeten Liste mit for-Schleife durchgehen
        for (planet in planets){
            print("$planet ")
        }
        println("")


        // Gegenüberstellung:
        // Planeten Liste mit forEach Lambda
        // kurze Syntax mit it: Parameter kann weggelassen werden, it ist Schlüsselwort für Element
        planets.forEach { print("$it ") }
        println("")
        // längere Syntax: Parameter mit eigenem Parameternamen: muss angegeben werden
        planets.forEach{ planet -> print("$planet ") }

}






