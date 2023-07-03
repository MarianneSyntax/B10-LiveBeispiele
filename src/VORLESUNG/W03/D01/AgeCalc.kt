package VORLESUNG.W03.D01

fun calculateAge(){
    println("Bitte gib dein Geburtsjahr ein:")
    var birthYear = readln().toInt()
    var age = 2023-birthYear
    println("Du bist $birthYear geboren. Das heißt, du bist dieses Jahr $age Jahre alt.")
}