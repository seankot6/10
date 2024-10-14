fun generateFizzBuzzList(n: Int): List<Any> {
    val result = mutableListOf<Any>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i)
        }
    }
    return result
}

fun main() {
    val n = 15
    val fizzBuzzList = generateFizzBuzzList(n)
    println(fizzBuzzList) // Вывод: [1, 2, "Физллл", 4, "Бизлллл", "Физллл", 7, 8, "Физллл", "Бизлллл", 11, "Физллл", 13, 14, "ВизллБизлл"]
}

