//5.1 Prime Time
//Ana Osornio Baeza
package week05


fun main() {

    println(primeNum(6))
    println(primeNum(13))
    println(primeNum(8893))
}


    fun divisible(num1: Int, num2: Int ): Boolean {
        return num1 % num2 == 0 }

    fun primeNum (num1: Int): Boolean {
            if (num1 <= 0)
                return false
            for (i in 2 until num1){
                if (divisible(num1, i)){
                    return false
                }
        }
            return true }




