//Ana Osornio Baeza
//3.2 Magic Dates
package week03

fun main(){
    print("Enter a 2 digit month: ")
    val month = Integer.valueOf(readLine())
    print("Enter a 2 digit day: ")
    val day = Integer.valueOf(readLine())
    print("Enter a 2 digit year: ")
    val year = Integer.valueOf(readLine())

    println("You entered $month/$day/$year")

    if (month*day== year){
        print("Your date is a magic number")
    }else{
        print("Your date is not a magic number")
    }

}