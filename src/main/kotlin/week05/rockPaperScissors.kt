package week05

//5.7 Rock Paper Scissors Game
// Ana Osornio Baeza

/*
Write a program that lets the user play the game of Rock, Paper, Scissors against the computer. The program
should work as follows.
When the program begins, a random number in the range of 1 through 3 is generated.
If the number is 1, then the computer has chosen rock. If the number is 2, then the computer has chosen paper.
If the number is 3, then the computer has chosen scissors. (Don’t display the computer’s choice yet.)
The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard. (You can use a menu if you prefer.)
The computer’s choice is displayed.
A winner is selected according to the following rules:
If one player chooses rock and the other player chooses scissors, then rock wins. (The rock smashes the scissors.)
If one player chooses scissors and the other player chooses paper, then scissors wins. (Scissors cuts paper.)
If one player chooses paper and the other player chooses rock, then paper wins. (Paper wraps rock.)
If both players make the same choice, the game must be played again to determine the winner.
Be sure to divide the program into functions that perform each major task.
Create a file named rockPaperScissors.kt and save it in your week05 folder in Github.
 */

fun main(){
    Game()
}
fun Game(){
    val computer = (1..3).random()
    println(" Rock: 1 \n Paper: 2 \n Scissors: 3 \n Enter a guess:  ")
    val user = readLine()!!.toInt()

    when (computer) {
        1 -> { println("Computer: Rock")
        }
        2 -> { println("Computer: Paper")
        }
        3 -> { println("Computer: Scissors")
        }
    }


    if (computer == 1 && user == 1)
        println("It's a tie! Play again")
    else if (computer == 1 && user == 2)
        println("You Won!")
    else if (computer == 1 && user == 3)
        println("You Lost!")
    else if (computer == 2 && user == 1)
        println("You Won!")
    else if (computer == 2 && user == 2)
        println("It's a tie! Play again")
    else if (computer == 2 && user == 3)
        println("You Lost!")
    else if (computer == 3 && user == 1)
        println("You Won!")
    else if (computer == 3 && user == 2)
        println("You Lost!")
    else if (computer == 3 && user == 3)
        println("It's a tie! Play again")
    }
