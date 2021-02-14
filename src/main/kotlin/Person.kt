/*
Classes are public by default.
Not compulsory to name class name same as
file  name.

We can define multiple public classes in single
file.
* */
class Person {
    var firstName: String = ""
    var lastName: String = ""
    val age: Int = 0


}

fun main(args: Array<String>) {
    val person = Person()
}