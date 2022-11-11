import java.util.*

fun main(){
        val r = Random()
        val choice = 1 + r.nextInt(16)
        val answer = ""
        println("MAGIC 8-BALL SAYS: $answer")
            if (choice == 1)
                print("Yes, of course" )
            else if (choice == 2)
                print("Without a doubt, yes.")
            else if (choice == 3)
                print("You can count on it.")
            else if (choice == 4)
                print("For sure!")
            else if (choice == 5)
                print("Ask me later.")
            else if (choice == 6)
                print("I can’t tell you right now. I’ll tell you after my nap.")
            else if (choice == 7)
                print("No way!")
            else if (choice == 8)
                print("I don’t think so.")
            else if (choice == 9)
                print("Without a doubt, no")
            else if (choice == 10)
                print("The answer is clearly NO.")
            else if (choice == 11)
                print("Yes")
            else if (choice == 12)
                print("Ask again later")
            else if (choice == 13)
                print("No")
            else if (choice == 14)
                print("100% yes")
            else if (choice == 15)
                print("100% no")
            else
                print("8-BALL ERROR!")

    }



