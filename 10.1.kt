fun generateList(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    } else {
        val list = mutableListOf<Int>()
        for (i in n downTo 1) {
            list.add(i)
        }
        return list
    }
}

fun main() {
    val n = 5
    val result = generateList(n)
    println(result) // Вывод: [5, 4, 3, 2, 1]
}

