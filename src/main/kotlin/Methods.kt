fun main(args: Array<String>) {

    /*All these call to same method. */

    /*
    * Positional arguments :
    *
    * Calling method by directly passing the values.*/
    method1(1, 2.8F, 3)

    /*
    * Named arguments :
    *
    * Calling method by using name of the argument names.
    *
    *By using this way we can put values in any orders.*/
    method1(secondArgument = 1.2F, firstArgument = 1, thirdArgument = 4)

    /*
    * We can even mix positional arguments with named arguments.
    * But once we use named arguments, we got to use named arguments after that.*/
    method1(1, thirdArgument = 2, secondArgument = 1.3F)

    /*
    * This method doesn't pass the value to thirdArgument hence the default value
    * would be used. */
    method1(1, 2F)
}

fun method3() {

}

fun method2(): Int {
    return 1
}

fun method4(): Int = 1 + 2

/*
* Here return type is inferred by the returned values.*/
fun method5() = 1 + 6

/*
* Adding braces here makes it lamda. Basically an another function.*/
fun method6() = { 1 + 3 }

/*
* A Typical method.
*
* We do not have choice to choose from val or var because parameters passed to methods are
* immutable we are not allowed to change them.
*
* The values received here are COPY BY VALUE.
*
* But if we are passing arrays which typically return reference. So, references are the values
* which are being copied rather than contents of the arrays. So, any change applied on the arrays
* using reference(obviously) would have impact on the value that we have in our function.
*
* Not aware about the custom objects which we will see later.
*
* We can add default value to the arguments. It is optional. Either we can put the value or just leave it.
* */
fun method1(firstArgument: Int, secondArgument: Float, thirdArgument: Byte = 5): Int {
    return 1
    /*
    * It's okay to have some code after return. It will not execute.*/
    val a = 1
}

/*
* Compiler optimises for it. Like compiler would convert this method into non recusive
* method in fact it would change the code in that way.
*
* To be able to have such transformation. The condition is to not to have any action after the
* recursive call.
*
* Otherwise it would be accounted as recursive. */
tailrec fun method9() {

    /*
    * Not the ideal code but some logic which could be optimized to non recursive function*/
    return method9()
}


tailrec fun method10() {
    return
}



