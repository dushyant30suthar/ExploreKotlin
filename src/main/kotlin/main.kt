fun main(args: Array<String>) {
    /*
    * Nullable type*/
    var something: String?

    var somethingNew: String = "Dushyant Suthar"

    /*
    * Nullable type is parent of all of the types..
    * That's why we can assign nonNullable to nullable
    *
    * but reverse is not possible...
    *
    * somethingNew = something*/
    something = somethingNew

    /*
    * Difference between nullable and nonNullable exists only during compile time not on runtime..*/

    /*
    * Nothing? is smallest nullable type
    *
    * Largest nullable type Any? */

    /*
    * We can not use iterator on nullable types.
    *
    * But it can smart cast to nonNullable type if compiler ensures by any statement in that context..*/
}