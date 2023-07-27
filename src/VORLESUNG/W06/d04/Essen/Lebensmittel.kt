package VORLESUNG.W06.d04.Essen

open class Lebensmittel(val name: String, protected val preis: Double){

    open val isVegan: Boolean = true

    // öffentliche Methode, um an den Preis zu kommen, der sonst nicht von außen verfügbar ist
    fun getPreiss() : Double{
        return this.preis
    }

    // Eine private Methode, die nur innerhalb dieser Klasse zugänglich ist
    private fun printInternalInfo(){
        println("Lebensmittel \n Name: $name, Preis: $preis Euro")
    }

    open fun printInfo(){
        println("Die Informationen wurden nach außen geleaked!")
        printInternalInfo()

    }


}