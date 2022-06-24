fun main(args: Array<String>) {
    println(someMethod(intArrayOf(4, 3, 2, 1)) { it < 3 })
}

/*
* Using higher order function could be expensive
*
* as function passed as parameters results in extra object allocations,
* and if some values are passed to those parameter functions then it results in
* some other penalties.
*
* To avoid this we can add inline keyword to higher order functions. It just replaces
* the method call with method's body and the function arguments are expanded there only..
*
* This puts some restrictions such as we can not store those parameters in some reference.
* And those could not be passed to non-inline methods.*/

/*
* We can not put nullable functional parameter in inline method.
*
* If we need to, then we need to add noinline keyword before variable name.
*
* It doesn't have any significance if inline method has no in-linable parameters*/
inline fun someMethod(numbers: IntArray, noinline condition: ((Int) -> Boolean)?): Int {
    /*
    * We can not store condition parameter into some other reference
    *
    * for ex.
    *
    * val condition1 = condition.
    *
    * Also it could not be passed to non-inline methods.*/
    for (i in numbers) {
        if (condition(numbers[i]))
            return i
    }
    return -1
}