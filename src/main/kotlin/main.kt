fun main(args: Array<String>) {

    /*
    * When can also be used as expression.
    *
    * Else is mandatory while using it as an expression.*/
    val b = when {
        /*
        * It just executes the matching branch. Doesn't falls through all of
        * the available branches.*/
        2 in 1..10 -> true
        3 in 1..20 -> false
        /*
        * When can be used with else*/
        else -> true
    }

    val a = 5
    /*
    * Subjecting a field to when.
    * It is known as subject expression. */
    val c = when (a) {
        5 -> "Five"
        6 -> "Six"
        else -> "Don't know what it is"
    }

    val d = when (val a = readLine()!!.toInt()) {
        5 -> "Five"
        6 -> "Six"
        else -> "Don't know what it is"
    }

}