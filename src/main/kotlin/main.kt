fun main(args: Array<String>) {
    /*
    * Try catch in kotlin are expressions.
    *
    * Kotlin doesn't have checked and unchecked exceptions. */
    val a = try {
        readLine()!!.toInt()
        throw NumberFormatException("Throw represents value of type Nothing")
    }
    /*
    * Catch blocks are checked in order of their declarations.
    *
    * In java 7 or later we can put multple exceptions into single catch but not possible
    * in kotlin
    *
    * Also use of both super types subtypes would result in compile time errors in java*/
    catch (e: NumberFormatException) {
        0
    } catch (e: Exception) {
        0
    } finally {
        /*
        * To clean up resources*/
    }
}