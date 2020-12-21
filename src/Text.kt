fun main() {
    print("Give me a character:\n")

    val vowels = "aeiouy"
    val input: String = readLine()!!
    val character: Char = input.toCharArray().first()

    if (vowels.contains(character, ignoreCase = true)) {
        print("It's a vowel")
    } else {
        print("It's not a vowel")
    }
}