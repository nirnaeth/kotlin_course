fun main(args: Array<String>) {
    print("Give me a number:\n")

    try {
        val input: Int = readLine()!!.toInt()

        when (isEven(input)) {
            true -> println("The number is even")
            false -> println("The number is odd")
        }

        println("The factorial of $input is ${calculateFactorial(input)}")

    } catch (e: NumberFormatException) {
        print("The input is not a number")
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun calculateFactorial(number: Int): Long {
    var factorial: Long = 1

    for (i in 1..number) {
        factorial *= i
    }

    return factorial
}