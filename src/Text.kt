fun main() {
    val vowels = "aeiouy"

    print("Give me a character:\n")
    var input: String = readLine().toString()

    while (input.length > 1) {
        print("Please, use only one character\n")
        print("Give me a character:\n")
        input = readLine().toString()
    }

    val character: Char = input.toCharArray().first()
    if (vowels.contains(character, ignoreCase = true)) {
        print("It's a vowel")
    } else {
        print("It's not a vowel")
    }
}