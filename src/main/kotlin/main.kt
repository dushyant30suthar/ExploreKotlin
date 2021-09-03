class Content {

    /*
    * Property without lateinit */
    var content: String? = null

    /*
    * property with lateinit. */
    lateinit var contentSmart: String

    private fun addContent() {
        contentSmart = "Dushyant Suthar"
    }

    /*
    * Late init is there so that we do not have to deal with nullable types. */
    fun getSmartContentSize(): Int {
        return contentSmart.length
    }

    fun getContentSize(): Int {
        return content?.length ?: 0
    }
}