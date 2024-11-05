fun generateUsername(idStr: String): String {
    // Find the index of the first non-zero character in reverse order
    var index = idStr.length - 1
    while (index >= 0 && idStr[index] == '0') {
        index--
    }

    // The substring before the last non-zero character is a valid username
    val username = idStr.substring(0, index)
    return username
}

fun main() {
    // Input number of test cases
    val t = readLine()!!.toInt()

    // Process each test case
    repeat(t) {
        // Input ID for each test case
        val s = readLine()!!

        // Output the generated username
        println(generateUsername(s))
    }
}
