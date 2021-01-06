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

/*
* Both of the files contain method which has same name.
* But to avoid this ambiguity we can use as keyword
*
* Now we will identify that method with the field we add here. */

/*
* Here both of the files contains a method with same name.
*
* This is specified import*/
/*
* This line represents on demand imports*/
import sub.something.something as something1
import sub.something2.something as something2

fun main(args: Array<String>) {

    /*
    * Both of the methods are called by using their aliases we gave at the time of import.*/
    something1()
    something2()

    /*
    * This method is present in both of the packages but it is referred without
    * ambiguity because specific imports have higher priority than of on demand imports*/
    commonMethod()

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