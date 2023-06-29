fun main() {

    // IndexOutOfBoundsException

    var numbers: List<Int> = listOf(98,347,50,21,57,77,84,31)
    // diese Zeile:
    println(numbers[numbers.size-1]) // -1 fehlte hier vorher
    // ist das gleiche wie:
    println(numbers[7]) // hier stand vorher eine 8 statt der 7 in den []
    // die Liste geht aber nur bis Index 7. Hier wird eine IndexOutOfBoundsException getriggert, wenn wir nicht -1 auf size verwenden.

    // Werte der Variablen mit Debugger auslesen
    var number1 = 5
    var number2 = 3

    var sum = number1 + number2
    var product = number1 * number2

    println("Sum: $sum")
    println("Product: $product")




}
