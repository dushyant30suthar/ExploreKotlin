/*
* Anyone can access this just by importing package. */
val prefix = "Hello"

fun main(args: Array<String>) {
    /*
    * Nullable type*/
    var something: String? = null

    something = "Dushyant Suthar"

    /*
    * Smart cast. Casting nullable to nonNull Property*/
    var somethingNew: String = something!!


}