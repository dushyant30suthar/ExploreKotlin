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
class Person(private val firstName: String, private val lastName: String)
/*
* By using val and var in constructor parameter.
* We can omit non trivial members and empty body.*/

/*
* We can remove class body as well if we define val or var in constructor
* parameters*/

fun main(args: Array<String>) {
    val person = Person("Dushyant", "Suthar")
}