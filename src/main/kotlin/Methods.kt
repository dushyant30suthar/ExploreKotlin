fun main(args: Array<String>) {

    /*All these call to same method. */

    /*
    * Positional arguments :
    *
    * Calling method by directly passing the values.*/
    method1(1, 2.8F, 3, 4, 4, 4, 3)

    /*
    * Or we can pass values with array this way. Using spread operator */
    method1(1, 2F, *byteArrayOf(1, 2))

    /*
    * Named arguments :
    *
    * Calling method by using name of the argument names.
    *
    *By using this way we can put values in any orders.
    *
    * we can not put comma separated values if we are using named parameters.
    *
    * We have to be using array with spread operator*/
    method1(secondArgument = 1.2F, firstArgument = 1, thirdArgument = *byteArrayOf(1, 2))

    /*
    * We can even mix positional arguments with named arguments.
    * But once we use named arguments, we got to use named arguments after that.*/
    method1(1, thirdArgument = *byteArrayOf(1, 2), secondArgument = 1.3F)

    /*
    * This method doesn't pass the value to thirdArgument hence the default value
    * would be used. Here, varargs have empty array as default value.*/
    method1(1, 2F)

    /*
    * */
    method2(1, 2, 3)
    method2()

    /*
    * When varargs are used before default ones. We would have to use named parameters with either or both of the parameters. */
    method3(firstArgument = intArrayOf(1, 2), 345)

    /*
    * So method with specific type is called not the one with it's super type.
    * */
    method4(4, "Some name here.")

    /*
    * If we want to call the super type one then we would have to type cast it to super one.*/
    method4(4, "Some string" as Any)

    /*
    * In this call method with default argument has been found specific rather than the one with varargs.*/
    method4(4, "Some string", 4)

    /*
    * This call is obviously passed to one with vararg.*/
    method4(4, "Some String", 4, 4)
}

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
*
* varargs have empty array as default values.
* You can put n number of values to it.
* */
fun method1(firstArgument: Int, secondArgument: Float, vararg thirdArgument: Byte): Int {
    return 1
    /*
    * It's okay to have some code after return. It will not execute.*/
    val a = 1
}

/*
* Varargs do not mix well with default arguments. Thus it's always recommended to use varargs after default ones.*/
fun method2(firstArgument: Int = 5, vararg secondArgument: Int) {

}

fun method3(vararg firstArgument: Int, secondArgument: Int = 5) {

}

/*
* Simple and straightforward methods are always considered as more specific.
*
* If this method is overloaded(another method existed) with default parameters or varargs then it has been a method
* to go.*/
fun method4(firstArgument: Int, secondArgument: String) {

}

/*
* This method is considered less specific than of upper one*/
fun method4(firstArgument: Int, secondArgument: String, thirdArgument: Int = 5) {

}

fun method4(firstArgument: Int, secondArgument: String, vararg thirdArgument: Int) {

}


/*
* Super types makes method to be less specific.*/
fun method4(firstArgument: Int, secondArgument: Any) {

}