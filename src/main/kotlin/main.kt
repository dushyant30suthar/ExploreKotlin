fun main(args: Array<String>): Int {

    var a: Int = 5
    var b: Int = 7

    /*
    * If else are expressions thus they gets us values which we can hold.
    *
    * If we are using if else as expressions then we must provide else along
    * with if.
    *
    * Due to this behaviour of ifelse ternary operator is not available in kotlin
    * as if else could serve that purpose.*/
    var c = if (a > b) a else b


    c = if (a > b) a else return b


    /*
    * We can write if else in same statement.*/
    if (a > b) return a else return b


}

fun method1(): Int {

    /*
    * Whenever we use return, Return represents expression of type Nothing which denotes non
    * existing values, some break in sequential flow. Never reaches definite value.
    *
    * Nothing is subtype of every kotlin type.*/

    /*
    * Here 0 is not value of return expression.
    *
    * But resulting value of enclosed method.
    * Return doesn't have any value just like any expression of type Nothing. */

    /*
    * Unit represents absence of useful value
    * Nothing represents absence of any value at all.*/
    return 0
}