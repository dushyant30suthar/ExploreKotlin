/*
* Functional types*/
val sum: (Int, Int) -> Int = { a, b -> a + b }

/*
* We can write in this way also*/
val max = { a: Int, b: Int -> if (a > b) a else b }

/*
* Takes int and returns function*/
val shifter: (Int) -> ((Int) -> Int) = { originalValue -> { shiftingValue -> originalValue + shiftingValue } }

/*
* Takes operation/function and returns int*/
val valueAt2: ((Int) -> Int) -> Int = { operation -> operation(2)}


val incrementOperation = shifter(1)


fun aggregation(values: IntArray, operation: (Int, Int) -> Int): Int {
    var result = 0
    for (i in 0..values.lastIndex) {
        result = operation(result, values[i])
    }
    return result
}


fun main() {
    val values = intArrayOf(1, 6, 7, 8, 9)
    /*
    * It is recommended to put lamda outside of paranthesis*/
    aggregation(values) { a, b -> a + b }
    aggregation(values, max)

    println(incrementOperation(10))

    println(valueAt2 { n -> n + 1 })
}
