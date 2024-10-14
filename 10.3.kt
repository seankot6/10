fun caesarCipher(text: String, shift: Int): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val result = StringBuilder()

    for (char in text) {
        if (char.isLetter()) {
            val isUppercase = char.isUpperCase()
            val letterIndex = alphabet.indexOf(char.lowercase())
            val shiftedIndex = (letterIndex + shift) % alphabet.length
            val shiftedChar = alphabet[shiftedIndex]
            result.append(if (isUppercase) shiftedChar.uppercase() else shiftedChar)
        } else {
            result.append(char)
        }
    }

    return result.toString()
}

fun main() {
    print("Введите текст: ")
    val text = readLine() ?: ""
    print("Введите сдвиг: ")
    val shift = readLine()?.toIntOrNull() ?: 0

    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный текст: $encryptedText")
}
