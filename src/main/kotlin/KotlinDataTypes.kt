fun main(args: Array<String>) {
    /*
    * If we make it nullable then under the hood it would be translated to java primitive type int.
    * Well that should not be our concern we have to consider data types as full blown objects.
    * */
    var a = 945
    /*
    * By default integer literal assigned to Int type. We have specify for Byte and Short. */
    var b: Byte = 2

    var bc = b

    print(++bc)

    print(b)


    /*
    * As we know, integer literals are by default inferred to Int. If we want to make it Long.
    * We can just put L after the literal.
    * We can not do this with Byte and Short. */
    var something = 15L

    val c: Short = 4

    val d: Long

    val e: Float
    val f: Double

    /*
    * Characters are taken as unicode decimal values.*/
    val g: Char = 'a'

    /*
    * We can perform binary +/- on char types and it will
    * operate on unicode decimal. It points to b now.*/
    var good = g + 1

    val h: Boolean

    /*
    * We can use `` in name of data members.
    * Val should be the type we must have as it is kind of final.
    * We can not make changes to the val once they are assigned.*/
    val `string`: String = "String is immutable." +
            """ We can use multiline strings this way.
                
                \'We can use escape to print \'.\'
                
                Even unicode would work like this \u03C0.
                
                We can even use a concept called string template.
                
                Like this, ${a} we just need to put a valid kotlin 
                syntax here.
                
                We can replace curly brances with just $a for single 
                variable/value reference."""


    /*
    * E denotes 10 to the power. It's by default double.
    * Every floating point is by default double he have to
    * put F of f to make it float. We can not do such thing with
    * double. It's always assigned by default. */
    var floatNumber = 56043444E-3F

    /*
    * This will pick up last byte(Least significant 8 bits) of the data given, will truncate
    * all other than that. Last byte would be taken with MSB (signed)*/
    print(a.toByte())

    /*
    * Unary operation on Byte and Short changes it to Int. */
    a = +b

    /*
    * These statements are just assignments rather than expressions.
    * We can not use it like a = b = c like in java.*/
    a *= 10

    /*
    * Result of division of two Int values is also int. As it round off to 0.
    * It will not round off in case of float values.
    * This applies to both division and modulus */
    a = 7 / 4

    /*
    * Sign of resultant value is derived from numerator. */
    floatNumber = (-6.5f) % (-2.5f)

    /*
    * Kotlin supports Hex(0x) and Binary(0b) not octal. Apart from that, no integer literal,
    * except zero, 0 can be the first digit.*/
    a = 0x00
    a = 0b00

    /*
    * Just a reference*/
    val array1: Array<Any>

    /*
    * Actually creating an array. */
    val array2 = Array<Any>(10) {
        /*
        * We have to explicitly initialize array elements on creation.
        * It doesn't happen automatically like in java by using
        * new operator. */

        /*
        * Here we specify if we want to do anything with
        * each value of the array. Otherwise we can leave it,
        * I guess. */

        /*
        * the value received in val `it`.*/

        it
    }

    val array3 = emptyArray<Any>()

    /*
    * Type inferred on compile time.*/
    val array4 = arrayOf("String", "String")

    /*
    * We have this kind of function for all data types. */
    val array5 = intArrayOf(1, 1, 2)
}