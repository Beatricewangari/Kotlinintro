fun main() {
    println("Enter the numbers:")
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()

    if (firstNumber != null && secondNumber != null) {
        println("Enter +, -, * or /:")
        val o = readLine().toString()[0]
        var result: Double? = null

        if (o == '+') {
            result = firstNumber + secondNumber
        } else if (o == '-') {
            result = firstNumber - secondNumber
        } else if (o == '*') {
            result = firstNumber * secondNumber
        } else if (o == '/') {
            result = firstNumber / secondNumber
        } else {
            println("Please enter a valid operator.")
        }

        if (result != null) {
            println("$firstNumber $o $secondNumber = $result")
        }
    } else {
        print("Please enter valid inputs")
    }
}

























//The program asks the user to enter the numbers.
//It is using readLine() method to read the user entered value and converts it to a double. These values are stored in the firstNumber and secondNumber variables.
//If the entered numbers are not null, it asks the user to enter the operator symbol. It reads the operator symbol and stores it in the variable o.
//The if, else-if, else blocks checks the value of the variable o and based on its value, it calculates the result.
//The last if block is used to print the final result.