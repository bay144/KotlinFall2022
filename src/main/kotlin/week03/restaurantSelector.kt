//Ana Osornio Baeza
//3.7 Restaurant Selector
package week03

fun main() {
    println("Is anyone in your party a vegetarian? ")
    val vegetarian = readLine()!!
    println("Is anyone in your party a vegen? ")
    val vegan = readLine()!!
    println("Is anyone in your party gluten-free? ")
    val GF = readLine()!!

    println("Here are your restaurant choices:")

    if (vegetarian.equals("yes",ignoreCase = true) && (vegan.equals("yes",ignoreCase = true))){
            if(GF.equals("no",ignoreCase = true)){
                printCafe()
                printchefK()
            }
        else{
            if(GF.equals("yes",ignoreCase = true)){
                printCafe()
                printchefK()
            }
            else{
                printItalian()
                printstreetPizza()
                printCafe()
                printchefK()
            }
        }
    }

    else{
        if (vegan.equals("yes",ignoreCase = true) && (GF.equals("no",ignoreCase = true))){
                printCafe()
                printchefK()
            }

        else{
            if(GF.equals("yes",ignoreCase = true)){

                printstreetPizza()
                printCafe()
                printchefK()
            }
            else{
                printItalian()
                printstreetPizza()
                printCafe()
                printchefK()
                printJoes()
            }
        }
    }

}

fun printJoes(){
    println("\tJoe’s Gourmet Burgers ")
}
fun printstreetPizza(){
    println("\tMain Street Pizza Company ")
}
fun printCafe(){
    println("\tCorner Café  ")
}
fun printItalian(){
    println("\tMama’s Fine Italian  ")
}
fun printchefK(){
    println("\tThe Chef’s Kitchen ")
}
