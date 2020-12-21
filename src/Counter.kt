fun main() {
    val vowels: String = "aeiouy"

    var vowelCounter: Int = 0
    var consonantCounter: Int = 0

    print("Give me a word:\n")
    val input: String = readLine().toString()

    for (c in input) {
        if (vowels.contains(c)) {
            vowelCounter++
        } else {
            consonantCounter++
        }
    }
    println("${input.length} total characters")
    println("of which $vowelCounter vowels and $consonantCounter consonants")
}