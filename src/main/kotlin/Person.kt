/*
Classes are public by default.
Not compulsory to name class name same as
file  name.

We can define multiple public classes in single
file.
* */

/*
* Here's a class with primary constructor.
*
* Doesn't have body like functions/methods.
* It's intended to have set of property initializers
* as well as init blocks*/
class Person(firstName : String, lastName : String) {
    var firstName: String = firstName
    var lastName: String = lastName
    val age: Int = 0

    init {
        print("These statements are called everytime" +
                "when primary constructors are called.")
    }

    init {
        print("They could be multiple in numbers and their " +
                "execution would be in sequence of their" +
                "defination. These statements do not have " +
                "return statements")
    }

    init {
        /*
        * Sometimes initialization of properties could be
        * complex and can't be fit into single statement
        * thus their initialization is allowed in
        * init blocks.*/

        this.firstName = firstName
        this.lastName = lastName
    }

    fun method1()
    {}
}

fun main(args: Array<String>) {
    val person = Person("Dushyant","Suthar")
}