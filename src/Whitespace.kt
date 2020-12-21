fun main() {
    print("Give me a text:\n")

    val input: String = readLine()!!
    val whitespaceRegex: Regex = "\\s+".toRegex()
    val cleanInput: String = input.replace(whitespaceRegex, "")

    println(cleanInput)
}