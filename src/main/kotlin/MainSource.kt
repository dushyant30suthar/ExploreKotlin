/*
* Higher order function is a function which takes or returns functions.*/


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
val valueAt2: ((Int) -> Int) -> Int = { operation -> operation(2) }


val incrementOperation = shifter(1)


fun aggregation(values: IntArray, operation: (Int, Int) -> Int): Int {
    var result = 0
    for (i in 0..values.lastIndex) {
        result = operation(result, values[i])
    }
    return result
}

fun aggregation(operation: () -> String): Int {
    return 0
}

fun aggregation(something: String, operation: (Char) -> String): Int {
    return 0
}

fun main() {
    val values = intArrayOf(1, 6, 7, 8, 9)
    /*
    * It is recommended to put lamda outside of paranthesis*/

    /*
    * We can put _(underscores) in place of unused lambda arguments.*/
    aggregation(values) { _, _ -> 2 }
    aggregation(values, max)

    /*
    * You can omit ()-> when there are no parameters to pass. */
    aggregation { "Something" }


    /*
    * When there's just one parameter to pass then also we can omit
    * ()-> symbols. We can refer to passed argument by using
    * predefined name "it". */
    aggregation("Something") { it.toString() }

    /*
    * You can also pass function as a lambda. This function is called anonymous function.
    * it doesn't have a name but we have to specify return type of the function or else
    * we can use = return whatever as we do in normal case in which type is inferred.
    *
    * We can hold this function into some parameter.
    *
    * Unlike lambdas anonymous functions can not be passed outside arguments. */
    aggregation(values, fun(a: Int, b: Int): Int {
        a * b
        return a + b
    })

    println(incrementOperation(10))

    println(valueAt2 { n -> n + 1 })
}

/*
* Functional types or lambdas can access values of their closures. */
