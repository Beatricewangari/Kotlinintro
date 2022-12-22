class staff(val name:String,val jobdescription:String,val doe:Int) {
}

fun main(args: Array<String>) {
    val obj=staff("Beatrice","Software Developer",2022)
    println("Staff name is ${obj.name} who is a ${obj.jobdescription} and was employed in ${obj.doe}")
}