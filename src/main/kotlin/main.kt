fun main(args: Array<String>) {
/*
* Loops are statements rather than expressions.
*
* Both of these are essentially same as java. */
    do {

    } while (true)

    while (true) {

    }

    /*
    * Typical for loop*/
    for (a in 1..100) {

    }

    /*
    * can't change value but assign a type*/
    for (a: Int in intArrayOf(1, 2, 3)) {

    }

    for (a in 0..intArrayOf(1, 2, 3).lastIndex) {

    }

    for (a: Int in 0..intArrayOf(1, 2, 3).lastIndex step 2) {

    }

    /*
    * Strings and array have indices property*/
    for (a: Int in intArrayOf(1, 2, 3).indices) {

    }

    /*
    * Can perform on string*/
    for (c in "dushyant") {

    }

    /*
    * break and continue servers the same purpose as java*/

    /*
    * break and continue are prohibited in when statements*/
}