//Ana Osornio Baeza
//3.4 Mass and Weight
package week03
fun main(){

    print("Enter the objects mass in kilograms: ")
    val mass = Integer.valueOf(readLine())
    val weight = mass*9.8

    println("The weight of the object is $weight Newtons")

    if (weight > 1000) {
        print ("That is too heavy")
    }
    else if  (weight < 10){
        print ("That is too light")
    }

}



