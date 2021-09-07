class Example {
    /*
    * Assigned value on first access call.
    *
    * var can not be used they are immutable.*/
    private val data: String? by lazy {
        setData()
    }

    private fun setData(): String? {
        return ""
    }

    fun someFunction() {
        if (data != null) {
            /*
            * Smart cast is not possible */
            data.length
        }
    }
}


fun main(args: Array<String>) {

}