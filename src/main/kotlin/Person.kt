/*
Classes are public by default.
Not compulsory to name class name same as
file  name.

We can define multiple public classes in single
file.
* */

class Person {
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
    * We can call other constructor from one constructor
    * by using delegation. That's another way of doing
    * common initialization we would just call a particular
    * constructor for before every constructor. */
    constructor(firstName: String, lastName: String) :
            this(firstName + lastName)

    constructor(fullName: String) {
        this.firstName = fullName.split(" ")[0]
        this.lastName = fullName.split(" ")[1]
    }
}
fun main(args: Array<String>) {
    val person = Person("Dushyant", "Suthar")
}