import java.lang.Exception

fun main(args: Array<String>) {
    print("Give me a number:\n")

    try {
        val input: Int = readLine()!!.toInt()

        when (isEven(input)) {
            true -> println("The number is even")
            false -> println("The number is odd")
        }
    } catch (e: NumberFormatException) {
        print("The input is not a number")
    }

}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}