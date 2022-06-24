import jdk.nashorn.internal.objects.Global.print

fun main(args: Array<String>) {

    /*
    * We can associate constructor of class to a callable reference*/

    val createPerson = ::Person

    /*
    * Same we can do with their methods*/
    val getName = createPerson("Dushyant", "Suthar")::getName
    print(getName)


    /*
    * We can pass this reference as functional type if the method matches the signature.*/
    fun someMethod(runnable: Runnable) {
    }

    fun someOtherMethod() {
    }
    someMethod(::someOtherMethod)

    /*
    * If there is method overloading
    * someMethod((::someOtherMethod)(1,2,3))*/


    /*
    * Method reference in Java is somewhat is alike callable reference.
    *
    * There are some differences though..
    * 1. Callable references are available for top-level declarations, local functions, and properties
    * 2. They are first class expressions
    * 3. It also could be used to get reflection object..
    * */

}


class Person(val firstName: String, var LastName: String) {

    fun getName(): String {
        return firstName + LastName
    }
}