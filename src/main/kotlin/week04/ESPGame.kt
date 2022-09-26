//Ana Osornio Baeza
//4.6 ESP Game
//09/25/2022

package week04
fun main() {
    val colors = listOf("Red","Green","Blue","Orange","Yellow")
    var count = 0
    for(i in 1 until 10){
        val randomNumber = (Math.random()*5).toInt()
        val computerGuess = colors[randomNumber]
        println("Enter guess: ")
        val playerGuess = readLine()!!
        println("The color was $computerGuess")
        if(playerGuess.equals(computerGuess, ignoreCase = true)){
            count += 1
        }
    }
    println("You guessed the color $count times!")
}