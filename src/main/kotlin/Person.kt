/*
Classes are public by default.
Not compulsory to name class name same as
file  name.

We can define multiple public classes in single
file.
* */

/*
* If we have primary constructors and secondary constructors as well
* then each constructor must delegate call to primary constructor
* or they all can delegate call to a common secondary constructor.
*
* It's mandatory for all to delegate call to the same constructor*/

class Person() {
    /*
    * We can not add val or vars for secondary constructor
    * parameters*/

    /*
    * Secondary constructors return Unit-typed value, thus we
    * can use return statement in body opposed to init blocks */

    /*
    * If class doesn't have primary constructor then every secondary
    * constructor calls init blocks in their sequence. Before executing its
    * own body this ensures common initialization.*/

    private val firstName: String
    private val lastName: String

    /*
    * When we all of the constructors are delegating to primary
    * constructor then we initialize things in init block or property
    * initializers*/
    init {
        firstName = "Dushyant"
        lastName = "Suthar"
    }

    /*
    * We can call other constructor from one constructor
    * by using delegation. That's another way of doing
    * common initialization we would just call a particular
    * constructor for before every constructor. It's just about
    * initializing things. */
    constructor(firstName: String, lastName: String) :
            this()

    constructor(fullName: String) : this() {
    }
}
fun main(args: Array<String>) {
    val person = Person("Dushyant", "Suthar")
}