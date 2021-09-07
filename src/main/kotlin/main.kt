/*
* Mixture of class and constant allow us to have singleton.
*
* Initialization happens lazily. Implicit initialization only.
*
* No primary or secondary constructors.
*
* We can directly import members of object. But we can not import all of the members at once using **/

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
    class InnerClassOfObject(val name: String) {

        /*
        * We can not make them inner as they would depend on outside context.
        *
        * Inner class would be the thing that we might want to use.*/
        object InnerObject {

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

    print(Application.InnerClassOfObject("Dushyant Suthar").name)
}
