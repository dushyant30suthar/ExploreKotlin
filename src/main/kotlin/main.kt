class Content {

    /*
    * There are two types of accessors default accessor and custom accessor.
    *
    * Default accessors are the ones which are there working under the hood directly assigning values
    * to the backing field and accessing values from backing field only.
    *
    * Custom accessors are the ones which we put and customize the logic of whether to assign them value
    * or to return the manipulated value. */

    /*
    * Backing fields are generated in the following conditions :
    *
    * Properties which have at least one default accessor for example either custom setter is there and custom getter is missing,
    * or custom getter is there and custom setter is missing.
    *
    * or
    *
    * They have a custom getter which explicitly mentions backing field.
    * */

    /***************************************************************/

    /*
    * Backing field is generated as both of the accessors are default and default accessors
    * directly interact with backing fields for both operations i.e read and write.*/
    private var firstNameDefault = "Dushyant"

    /*
    * Backing field is generated as there is one default accessor i.e. default setter.
    * Directly writing values to backing field.*/
    private var firstNameOne: String = ""
        get() {
            return "something"
        }

    /*
    * Backing field is generated as custom accessor mentions of it.
    * As any accessor makes use of backing field. Compiler forces us to set
    * the value first. Getter might be making use of backing filed and
    * there is no other way compiler can ensure it's non null. So, as soon as
    * we mention backing field in any of the accessor compiler forces us to initialize
    * the value.
    *  */
    private var firstNameTwo: String = "Mr"
        set(value) {
            field = "$value. "
        }
        get() {

            return field + "Dushyant"
        }

    /*
    * No backing field generated. Neither of above condition meets.
    * Values are not being assigned to backing field whenever any statement tries to
    * assign value, as setter doesn't explicitly mentions backing field, it's not being
    * assigned to backing field hence ignored.
    *
    * Also in the case of getter. It's doesn't get value from backing field.*/
    private var firstNameThree: String
        set(value) {

        }
        get() {
            return "Dushyant"
        }

    /*
    * Immutable properties can not have setter. They just need to be initialized by any one of default accessors.*/
    val lastName: String
        get() {
            return "Suthar"
        }


}