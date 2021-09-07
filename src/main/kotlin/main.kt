fun main(args: Array<String>) {
    /*
    * Object expression.*/
    fun midPoint(argument1: IntRange, argument2: IntRange) = object {
        val x = (argument1.first + argument1.last) / 2
        val y = (argument2.first + argument2.last) / 2
    }

    /*
    * Holding it in reference*/
    val midPoint = midPoint(1..3, 2..5)

    /*
    * Using its values through reference*/
    print("$midPoint.x,$midPoint.y")

}