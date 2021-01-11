fun main(args: Array<String>) {

    /*
    * Types of ranges that we can use.
    * Ranges are defined in set of classes such as IntRange, FloatRange etc.
    *
    * Using ranges over comparisons is overhead because they are objects.
    * Compiler is optimized to perform such things. It tries to optimize
    * the operation under the hood.*/

    /*
    * ..*/
    val a = 'a'..'h'

    val b = 11..99

    val result1 = 5 in 10..9 // false because range is empty we got to use down to


    /*
    * Similarly down to */

    val e = 'h' downTo 'a'

    val f = 99 downTo 1

    val result2 = 5 in 1 downTo 100 // false because it's empty

    /*
    * until operator */
    val c = 10 until 100 // 100 is excluded

    /*
    * a custom progression by using step */
    val d = 1..10 step 3 // 1,4,7,10

    /*
    * in operator */
    val result3 = 44 in b

    val result4 = 44 !in b

    val result5 = "abc" in "abc".."xyz"

    val result6 = intArrayOf(1, 2, 3, 4, 5, 6)

    /*
    * in and !in can also be used with arrays or strings */
    val result7 = 7 in result6


}