package week05
// 5.3 Retail Price Calculator Problem
// Ana Osornio Baeza

fun main() {
    println("Enter item's wholesale cost: ")
    val WSCost = readLine()!!.toDouble()
    println("Enter item's markup percentage: ")
    val markupPercent = readLine()!!.toDouble()
    println("Final Cost: $" + calculateRetail(WSCost,markupPercent))
}
fun calculateRetail(WSCost: Double, markupPercent: Double): Double{
    return (WSCost*((markupPercent/100)+1))
}