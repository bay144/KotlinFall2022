//Ana Osornio Baeza
// 3.8 Bank Charges
// Sept 25
package week03

fun main(){
    val baseFee = 10
    var feePerCheck = 0.0
    println("Checks written for the month: ")
    val checks = Integer.valueOf(readLine()!!)

    if (checks < 20) {
        feePerCheck = .10
    }
    if (checks in 20..39) {
        feePerCheck = .08
    }
    if (checks in 40..59) {
        feePerCheck = .06
    }
    if(checks >= 60){
        feePerCheck = .04
    }
    val serviceFees = ((feePerCheck*checks)+baseFee)
    println("Monthly Service Fees: $$serviceFees")
}