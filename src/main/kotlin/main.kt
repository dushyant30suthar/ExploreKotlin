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

    something = null

    //Assertion

    /*
    * Forcing compiler to consider it as nonNullable. */
    something!!.length

    //Safe call operator
    /*
    * Only execute statement if it is nonNull.
    *
    * If value is null then it returns nullable type of base type..*/
    something?.length


    //Elvis Operator
    /*
    * If value is null then use this otherwise that. We can also use this operator for return and break statements. */

    something ?: "Dushyant Suthar"


}