open class Mzazi {
    var color="followed mums color"
    var height="followed Dads Height"

}
class Njeri:Mzazi(){
    fun female(){
        println("Njeri $color ")
    }

}
class Kiprop:Mzazi(){
    fun male(){
        println("Kiprop $height")
    }

}

fun main(args: Array<String>) {
    val obj=Njeri()
    obj.female()
    var obj1=Kiprop()
    obj1.male()
}