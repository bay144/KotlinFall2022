package week05
//5.6 Stock Profit
//Ana Osornio Baeza

fun main() {
    println("Number of shares: ")
    val NS = readLine()!!.toInt()
    println("Purchase price per share: ")
    val PP = readLine()!!.toDouble()
    println("Purchase commission paid: ")
    val PC = readLine()!!.toDouble()
    println("Sale price per share: ")
    val SP = readLine()!!.toDouble()
    println("Sales commission: ")
    val SC = readLine()!!.toDouble()
    val total = profit(NS,PP,PC,SP,SC)
    if(total > 0)
        println("Profit: $$total")
    else
        println("Loss: $$total")
}
fun profit(NS:Int, PP:Double, PC:Double, SP:Double, SC:Double) : Double{
    return ((NS*SP)-SC)-((NS*PP)+PC)
}
