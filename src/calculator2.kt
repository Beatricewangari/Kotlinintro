fun main() {
    println("Enter the numbers:")
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()

    if (firstNumber != null && secondNumber != null) {
        println("Enter +, -, * or /:")
        val o = readLine().toString()[0]
        var result: Double? = null

        when (o) {
            '+' -> {
                result = firstNumber + secondNumber
            }
            '-' -> {
                result = firstNumber - secondNumber
            }
            '*' -> {
                result = firstNumber * secondNumber
            }
            '/' -> {
                result = firstNumber / secondNumber
            }
            else -> {
                println("Please enter a valid operator.")
            }
        }

        if (result != null) {
            println("$firstNumber $o $secondNumber = $result")
        }
    } else {
        print("Please enter valid inputs")
    }
}











//The when expression in Kotlin works similar to Java switch statement. We can also use it instead of if-else if-else conditions. Let’s modify the above program to use when expression instead of if-else if-else blocks:
