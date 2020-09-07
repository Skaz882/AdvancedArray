fun main () {
    val arrayOf = arrayOf("ice cream", "chocolate sauce", "cherries", "whipped cream", "spoons", "bowls")
    val quantity = arrayOf("200", "40", "40", "10", "20", "20")
    var inventory = arrayOf<Array<String>>()
    for (element in arrayOf) {
        println(element)
    }
    inventory += arrayOf
    inventory += quantity
    val store = inventory[0].size -1
    for (i in 0..store){
        val item = inventory[0][i]
        val qty = inventory[1][i]
        println("The sundae shop has $qty of $item")
    }
}