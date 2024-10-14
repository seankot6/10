fun generatePyramid(n: Int) {
    for (i in 1..n) {
        // Пробелы слева
        repeat(n - i) { print(" ") }
        // Символы "#"
        repeat(2 * i - 1) { print("#") }
        // Пробелы справа
        repeat(n - i) { print(" ") }
        println()
    }
}

fun main() {
    val n = 5
    generatePyramid(n)
}
