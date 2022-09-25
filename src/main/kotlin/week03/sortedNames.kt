//Ana Osornio Baeza
//3.5 Sorted Names

package week03
fun main(){
    println("Enter a first name: ")
    var firstName = readLine()!!
    println("Enter a second name: ")
    var secondName = readLine()!!
    println("Enter a third name: ")
    var thirdName = readLine()!!

    if(firstName > secondName){
        val temp = firstName
        firstName = secondName
        secondName = temp
    }
    if (secondName > thirdName){
        val temp = secondName
        secondName = thirdName
        thirdName = temp
    }


    println("The names ascending are $firstName ,$secondName ,$thirdName"  )

}

