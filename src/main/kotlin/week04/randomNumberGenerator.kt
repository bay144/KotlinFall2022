// Ana Osornio Baeza
// 4.5 Random Number Generator
// 09/25/2022
package week04
fun main() {
    var randomNum = Math.random().toInt()
    print("Guess a number: ")
    var guess = Integer.valueOf(readLine())

    while (guess != randomNum) {
        if (guess > randomNum) {
            print("Too high, try again!")
            guess = Integer.valueOf(readLine())
        }
        else {
            print("Too low, try again!")
            guess = Integer.valueOf(readLine())
        }
    }
        print("You won!")
}
