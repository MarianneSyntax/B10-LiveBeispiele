import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    // Kotlin.Math Package
    // sqrt
    var root = sqrt(49.0) // in root steht dann 7 drin, wurzel aus 49 ist 7
    println(root)

    // pow
    var power = root.pow(2) // 7^2 = 49
    println(power)

    //min und max
    var minimum = min(49,7) // wird 7 zurückgeben
    var maximum = max(root,power) // wird power zurückgeben

    // Kotlin Package: braucht keine Imports
    var max = maxOf(5,6,7,2)
    println(max)
    var min = minOf(0,3,6,8,22,99)
    println(min)





    // String Operationen

    // Konkatenation
    var age = 18
    var concatenatedString = "Ich bin " + age + " Jahre alt."
    var stringWithDollars = "Ich bin $age Jahre alt."

    // length
    var concatLength = concatenatedString.length

    // Escapen / Interpolation
    println("$concatenatedString Und $root x $root ist ${power.toInt()}")

    // equals
    var string1 = "Ich will zurück nach Westerland"
    var string2 = "Ich will ein Haus im Grünen"

    var string1ContainsString2 = string1.equals(string2)
    var string1ContainsWord = string1.contains("will")
}