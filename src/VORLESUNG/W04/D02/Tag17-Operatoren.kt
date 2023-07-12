package VORLESUNG.W04.D02


fun main(){

    // Zahl gerade?
    var number = 5.0
    isNumberEven(number)

    // Dream Car
    traumAuto()
    weatherFeedback()

    var anzahlVersuche: Int = 1
    println("Usernamen eingeben...")
    var userName = readln()
    passwortAbfrage(userName,anzahlVersuche)

}

// Zahl gerade?
fun isNumberEven(number: Double) : Boolean {
    if (number % 2 == 0.0) {
        return true
    } else {
        return false
    }
}

// Dream Car

fun traumAuto(){
    // Dream Car
    // Tatsächliches Auto im Angebot:
    var brand = "Toyota"
    var autoAlter = 4
    var ps = 120
    var preis = 10.5
    var farbe = "blau"

    // hier prüfen wir, ob dieses Auto unseren Bedingungen entspricht
    if ((preis <= 20000.5 && (farbe == "grün" || farbe == "blau") && (brand == "Toyota" || brand == "VW") && ps > 100 && autoAlter <=3) || preis <= 500.0){
        println("Auto Probe fahren...")
    } else{
        println("Kein Interesse, alle meine Wünsche werden nicht erfüllt....")
    }

    // XOR BEISPIEL:
    // XOR: nur eine Seite darf true sein, sonst wird in isTrue false gespeichert
    var isTrue = (farbe == "grün") xor (farbe == "blau")

}