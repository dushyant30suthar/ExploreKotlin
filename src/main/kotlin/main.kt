/*
* Mixture of class and constant allow us to have singleton.
*
* Initialization happens lazily. Implicit initialization only.
*
* No primary or secondary constructors.
*
* We can directly import members of object. But we can not import all of the members at once using **/

/*
* Kotlin has topLevel declarations which means we can directly import functions thus we do not have to
* use Utility classes as we use in Java.*/

object Application {
    val name = "My Application"

    override fun toString(): String {
        return name
    }

    /*
    * It could be represented as class/type*/
    fun describe(app: Application) = app.name

    /*
    * As inner classes are associated with outer class's object. Thus in the case of
    * object declaration there's just one instance of it throughout the lifetime
    * thus inner modifier would be redundant.*/
    class InnerClassOfObject private constructor(val name: String) {

        /*
        * We can not make them inner as they would depend on outside context.
        *
        * Inner class would be the thing that we might want to use.*/
        object InnerObject {
            fun create(name: String): InnerClassOfObject {
                return InnerClassOfObject(name)
            }
        }

    }

    /* We can have inner object as well */
    object InnerObject {

    }
}

fun main() {
    /*
    * It could be represented as value*/
    print(Application)

    /*
    * Using object as type is meaningless as it would have same value
    * throughout lifetime */
    print(Application.describe(Application))

    /*
    * Error as we made constructor private for this example*/
    print(Application.InnerClassOfObject("Dushyant Suthar").name)

    print(Application.InnerClassOfObject.InnerObject.create("Dushyant Suthar").name)
}
