// Ana Osornio Baeza
// 4.1 Sum of Numbers
// 09/25/2022
package week04
fun main(args: Array<String>){
    print("Enter a positive nonzero integer value: ")
    val num  = Integer.valueOf(readLine())
    var sum = 0

    for (i in 1..num) {
        sum += i
    }
    println("Sum:  $sum")
}

