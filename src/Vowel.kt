fun main() {
    print("Give me a character:\n")
    var input: String = readLine().toString()

    while (input.length != 1) {
        print("Please, use one character.\n")
        print("Give me a character:\n")
        input = readLine().toString()
    }

    val character: Char = input.toCharArray().first()

    if(isVowel(character)) {
        print("It's a vowel")
    } else {
        print("It's not a vowel")
    }

}

fun isVowel(character: Char): Boolean {
    val vowels = "aeiouy"

    return vowels.contains(character, ignoreCase = true)
}