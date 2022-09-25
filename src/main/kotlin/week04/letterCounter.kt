//Ana Osornio Baeza
//4.2 Letter Counter
//09/25/22
package week04

fun main(){
    println("Enter a string: ")
    val text = readLine()!!
    println("Enter a character: ")
    val char = readLine()!!.single()
    var count = 0

    for(i in 0 until text.length ){
        if(char == text.get(i)){
            count += 1
        }
    }
    print("Number of times character appears in string: $count")
}