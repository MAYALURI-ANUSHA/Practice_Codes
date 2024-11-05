fun digitSum(x: Int): Int {
    return x.toString().map { it.toString().toInt() }.sum()
}

fun calculateSums(n: Int, a: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0 until n) {
        var currentSum = 0
        for (j in 0 until n) {
            currentSum += digitSum(a[i] + a[j])
        }
        result.add(currentSum)
    }
    return result
}

fun main() {
    // Input reading
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    // Calculate sums and print the result
    val result = calculateSums(n, a)
    println(result.joinToString(" "))
}
