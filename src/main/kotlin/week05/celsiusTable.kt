package week05
// 5.5 Celsius Table
//Ana Osornio Baeza

/*
The formula for converting a temperature from Fahrenheit to Celsius is
C = 5/9 *(F−32)
where F is the Fahrenheit temperature and C is the Celsius temperature.
Write a method named celsius that accepts a Fahrenheit temperature as an argument.
The function should return the temperature, converted to Celsius.
Demonstrate the method by calling it in a loop that displays a table of the Fahrenheit temperatures 0
through 20 and their Celsius equivalents.
Create a file named celsiusTable.kt and save it in your week05 folder in Github.
 */


fun main() {
    println("Farenheit | Celsius")
    for(i in 0..20) {
        println("$i        |"  + C((i.toDouble())))
    }
}
fun C(F: Double) :Double {
   return (F - 32) * (5.0/9)
}