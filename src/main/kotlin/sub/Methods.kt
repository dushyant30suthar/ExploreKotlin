/*
* If there is no package name compiler assumes that file belongs to
* default root package and it has empty name.*/

/*
* This file actually doesn't belong to the package that we just have specified.
* Even though it's valid kotlin.
*
* Basically this means, source file resides in this directory but belongs to
* specified package.
*
* But it is recommended to follow tree structure same as java.*/
package sub.something

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