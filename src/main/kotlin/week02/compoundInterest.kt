//Ana Osornio Baeza
//2.9 Compound Interest
package week02
import kotlin.math.pow
fun main(){
    println("Principal amount deposited into account: ")
    val principal = Integer.valueOf(readLine())
    println("Annual interest rate paid by account: ")
    val interestRate = Integer.valueOf(readLine())
    val doubleRate = interestRate.toDouble()
    println("Times per year interest is compounded: ")
    val compoundPerYear = Integer.valueOf(readLine())
    println("Years account will be open")
    val years = Integer.valueOf(readLine())

    val base = ((principal*(1+((doubleRate/100)/compoundPerYear))))
    val exponent = compoundPerYear*years
    val amount = base.pow(exponent)
    println("The final amount is $amount")
}