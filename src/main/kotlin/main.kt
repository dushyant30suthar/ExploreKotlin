/*
* Functional types*/
val sum: (Int, Int) -> Int = { a, b -> a + b }

val max: (Int, Int) -> Int = { a, b -> if (a > b) a else b }

fun aggregation(values: IntArray, operation: (Int, Int) -> Int): Int {
    var result = 0
    for (i in 0..values.lastIndex) {
        result = operation(result, values[i])
    }
    return result
}


fun main() {
    val values = intArrayOf(1, 6, 7, 8, 9)
    aggregation(values, sum)
    aggregation(values, max)
}
