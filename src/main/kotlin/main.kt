/*
* So, If we define it at top level then it's type would not be known by compiler as
* it is related to enclosed class or something.
*
* Here it would be Any*/
val midPointPropOuter = object {
    val x = 5
}

fun main(args: Array<String>) {
    /*
    * Object expression.*/
    fun midPoint(argument1: IntRange, argument2: IntRange) = object {
        val x = (argument1.first + argument1.last) / 2
        val y = (argument2.first + argument2.last) / 2
    }

    /*
    * Thus it could not resolved*/
    midPointPropOuter.x

    /*
    * We can also do this.*/
    val midPointProp = object {
        val x = 5
    }

    /*
    * Holding it in reference*/
    val midPoint = midPoint(1..3, 2..5)

    /*
    * Using its values through reference*/
    print("$midPoint.x,$midPoint.y")

}