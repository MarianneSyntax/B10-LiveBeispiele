package VORLESUNG.W04.D02

// Wetter Feedback
// Hilfsfunktion: random Boolean werte
fun randomBoolean(): Boolean {
    val randomValue = listOf(true,false).random()
    return randomValue
}

fun randomInt(): Int {
    var randomInt = (-5..30).random()
    return randomInt
}

fun weatherFeedback(){


    val isSunny: Boolean = randomBoolean()
    println("Ist es sonnig? $isSunny")
    val isRaining: Boolean = randomBoolean()
    println("Ist es regnerisch? $isRaining")
    val isWindy: Boolean = randomBoolean()
    println("Ist es windig? $isWindy")
    val isDay: Boolean = randomBoolean()
    println("Ist es Tag? $isDay")
    val temperature: Int = randomInt()
    println("Was ist die Temperatur? $temperature")

    // ! - NOT
    val isCloudy: Boolean = !isSunny
    val isNight: Boolean = !isDay

    // >=
    val isWarm: Boolean = temperature >= 22

    // Regenbogen: wenn es regnet und die sonne scheint
    val isRainbowVisible: Boolean = isRaining && isSunny

    // Schnee
    if (isRaining && temperature <= 0) {
        println("Es schneit!")
    }

    // brauchen wir Sonnencreme?
    if (isSunny && temperature >= 25){
        println("Wir brauchen Sonnencreme, es sind $temperature Grad")
    } else {
        println("Wir brauchen keine Sonnencreme, es sind nur $temperature Grad")
    }

    // brauchen wir eine Jacke?
    if (isRaining || isWindy || temperature <= 10){
        println("Wir brauche eine Jacke.")
    }

    // Kombination: && und ||
    if (isWarm || (isDay && isSunny)) {
        println("Es ist ein wunderschöner Tag.")
    }

    // nur &&: nur true, wenn BEIDE Seiten links und rechts vom && selber true sind.
    var isBeautiful = isWarm && isSunny

    // nur ||: ist true, solange mindestens eine der Seiten links und rechts vom || true ist.
    var isDark = isNight || isCloudy
}