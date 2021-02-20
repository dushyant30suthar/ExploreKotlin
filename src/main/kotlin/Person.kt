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

/*
* Primary constructor parameters could not be used outside
* property initializers and init blocks. Not accessible
* by it's methods. */

/*
* We can do this by using class properties holding values
* that parameters received in primary constructor.*/

/*
* To do this there's more simpler way we can add val or var to
* the parameters
* this way they would become class properties and we can use as
* we want.*/
class Person(private val firstName: String, private val lastName: String) {
    /*
    * Class properties must be initialized in kotlin classes.
    *
    * If compiler could not ensure this or an exception
    * then it throws compile time error.*/


    val age: Int = 0

    init {
        print(
            "These statements are called everytime" +
                    "when primary constructors are called."
        )

        print(
            firstName + "This is considered as constructor " +
                    "parameter in init blocks or property initializers" +
                    "Otherwise it is considered as class property"
        )
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

    }

    fun method1()
    {}
}

fun main(args: Array<String>) {
    val person = Person("Dushyant","Suthar")
}