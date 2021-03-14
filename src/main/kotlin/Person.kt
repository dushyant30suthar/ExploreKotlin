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

/*
* We can add visibility parameters to class properties and methods
* along with arguments parameters of primary constructor but not
* parameters of secondary constructors.
*
* Also we can add visibility to primary constructor and second
* constructors.
*
* For primary constructor we have add constructor keyword in primary
* constructor also.
* */

class Person(val id: Id) {
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
    * Not inner class, static counterpart of Java
    *
    * Can access private members of the outer class. */
    class Id(color: String, eyes: String) {
        private val person = Person(Id("black","brown"))

        /*
        * Able to access private members of outer class through
        * object only can not access members of outer class
        * directly. */
        private val something = person

        init {
            /*we can not do this in nested class*/
            /*this@Person*/
        }

    }

    /*
    * To make this class access members of outer class directly
    *
    * we just need to add inner keyword*/
    inner class Id2(color: String, eyes: String) {
        private val person = Person(Id("Brown", "Brown"))

        /*
        * Directly accessing the members of outer class without
        * object.*/
        private val something = firstName;

        init {
            this@Person
        }
    }


}
fun main(args: Array<String>) {
    /*
    * References to the inner classes, basically static counterpart
    * to java */
    val person = Person(Person.Id("Brown", "Black"))

    /*
    * inner classes are instantiated using object of outer class*/
    person.Id2("Brown", "Black")
}