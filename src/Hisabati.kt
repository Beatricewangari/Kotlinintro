class Hisabati {
    //Data members
    var num1:Int=7
    var num2:Int=10
    //member function

    fun calculate():Int{
        return num1*num2
    }
}

fun main(args: Array<String>) {
    val obj=Hisabati()
    println("The product of num1 and num2 is " +obj.calculate())
}

//create a class - it should only have var ie my name. create an object to access it
