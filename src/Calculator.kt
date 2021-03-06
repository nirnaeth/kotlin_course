fun main() {
    print("Insert an operation:\n")

    val input: String? = readLine()

    try {
        val (first_number, operator, second_number) = separate(input)

        calculateResult(first_number, operator, second_number)
    } catch(e: NumberFormatException) {
        print("Invalid operation")
    }
}

fun separate(input: String?): Triple<Int, String, Int> {
    val elements: List<String> = input!!.split(" ")

    return Triple(elements.first().toInt(), elements[1], elements.last().toInt())
}

fun calculateResult(first_number: Int, operator: String, second_number: Int) {
    when (operator) {
        "+" -> println(first_number + second_number)
        "-" -> println(first_number - second_number)
        "/" -> println(first_number / second_number)
        "*" -> println(first_number * second_number)
        else -> print("Invalid operation")
    }
}