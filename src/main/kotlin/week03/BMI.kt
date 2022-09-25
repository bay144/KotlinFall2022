//Ana Osornio Baeza
//3.3 Body Mass Index
package week03
fun main(){

    print("Enter your weight in pounds: ")
    val weight = Integer.valueOf(readLine())
    print("Enter your height in inches: ")
    val height = Integer.valueOf(readLine())

    val BMI = weight*703/(height*height)

    println("Your Body Mass Index is: $BMI")
    if (BMI < 18.5){
        print("You are underweight")
    }else if(BMI > 25){
        print("You are overweight")
    }else print ("You have optimal weight")
}