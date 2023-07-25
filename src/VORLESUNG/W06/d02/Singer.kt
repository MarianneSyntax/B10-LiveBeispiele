package VORLESUNG.W06.d02

class Singer {
    var name: String = "anonym"
    var age: Int = 0
    var musicGenre: String = "misc"
    var songList: MutableList<String> = mutableListOf("Song1", "Song2", "Song3")


    fun singSong(songName: String){
        println("$name performt jetzt $songName")
    }

    fun printInfo(){
        println("Name: $name")
        println("Alter: $age")
        println("Genre: $musicGenre")
        println("Songs: $songList")
    }

}