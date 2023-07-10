package VORLESUNG.W04.D01

fun main(){


//    val dayOfTheWeek = readln()
//    weekDays(dayOfTheWeek)

    // Jahreszeiten
//    println("Bitte eine Monatszahl von 1-12 eingeben...")
//    var month = readln().toInt()
//    seasons(month)

    val aktuelleJahreszeit: String = seasonsWithReturn(readln().toInt())
    println(aktuelleJahreszeit)
    println(seasonsWithReturn(readln().toInt()))
    weatherAnalysis()
}

fun weekDays(dayOfTheWeek: String){
    when (dayOfTheWeek){
        "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" -> println("Es ist Wochentag, heute musst du leider zum Kurs kommen und malochen.")

        "Samstag", "Sonntag" -> println("Juhu es ist endlich Wochenende, viel Spaß beim Feiern.")

        else -> println("Diesen Wochentag kenne ich nicht....")

    }
}

fun seasons(month: Int){
    // Jahreszeiten
    when (month){
        in 3..5 -> println("Es ist Frühling")
        in 6..8 -> println("Es ist Sommer")
        in 9..11 -> println("Es ist Herbst")
        12,1,2 -> println("Es ist Winter")
        else -> println("Wir haben nur 12 Monate, such einen davon aus!")
    }
}

fun seasonsWithReturn(month: Int) : String {
    // Jahreszeiten
    when (month){
        in 3..5 -> return "Es ist Frühling"
        in 6..8 -> return "Es ist Sommer"
        in 9..11 -> return "Es ist Herbst"
        12,1,2 -> return "Es ist Winter"
        else -> return "Wir haben nur 12 Monate, such einen davon aus!"
    }
}

fun weatherAnalysis(){
    // Wetter-Analyse
    println("Bitte gib einen Wetter Typen ein (sonnig/regnerisch/wolkig")
    val weatherType: String = readln()
    println("Bitte gib eine Temperatur ein...")
    val temperature: Int = readln().toInt()

    when (weatherType) {
        "sonnig" -> {
            if (temperature >= 30) {
                println("Es ist sonnig und sehr heiß!")
            }
            else if (temperature <= 10) {
                println("Es ist sonnig, aber kalt, unter 10 Grad...")
            }
            else {
                println("Es ist sonnig aber immerhin unter 30 Grad.")
            }
        }
        "regnerisch" -> {
            if (temperature <= 10){
                println("Es ist kalt und regnerisch")
            }
            else if (temperature >= 30) {
                println("Es regnet und ist super heiss!")
            }
            else {
                println("Es regnet, aber immerhin ist es wärmer als 10 Grad....")
            }
        }
        "wolkig" -> {
            println("Es ist bewölkt bei $temperature Grad..")
        }
    }
}

