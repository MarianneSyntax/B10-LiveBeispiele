package VORLESUNG.`W05-Schleifen`.d03
val CHARACTERS = mutableMapOf(
    "Harry Potter" to true,
    "Ron Weasley" to true,
    "Hermine Granger" to true,
    "Draco Malfoy" to false,
    "Ginny Weasley" to true,
    "Severus Snape" to false,
    "Luna Lovegood" to true,
    "Vincent Crabbe" to false,
    "Gregory Goyle" to false,
    "Album Dumbledore" to true,
    "Lord Voldemort" to false
)



fun main(){
    // 1. gute Seite printen mit continue
    println("Diese Charaktere sind auf der Seite des Guten:")
    // charaktere und deren status durchlaufen
    for ((character,status) in CHARACTERS){
        if (status == true){
            println(character)
        } else {
            println("Moment, dieser Charakter ($character) ist nicht gut!")
            continue
        }
    }

    // 2. böse Seite printen mit continue
    // 3. Snape flippen mit Schleife
    // 4. Snape flippen: direkter Zugriff
    // 5. Ist Snape geflippt?

    printBadGuys()
}

// 2. böse Seite printen mit continue
fun printBadGuys(){
    println("Diese Charaktere sind auf der Seite des Bösen:")
    // charaktere und deren status durchlaufen
    for ((character,status) in CHARACTERS){
        if (status == false){
            println(character)
        } else {
            println("Moment, dieser Charakter ($character) ist nicht böse!")
            continue
        }
    }
}
