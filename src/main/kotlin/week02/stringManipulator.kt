// Ana Osornio Baeza
// 2.8 String Manipulator
package week02

fun main(){
    println("Enter your favorite city: ")
    var favCity = readLine()!!

    println(favCity.length)
    println(favCity.uppercase())
    println(favCity.lowercase())
    println(favCity.first())
}

