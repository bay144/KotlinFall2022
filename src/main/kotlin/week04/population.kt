//Ana Osornio Baeza
//4.3 Population
//09/25/2022

fun main() {
    print("Starting number of organisms: ")
    var organisms = readLine()!!.toDouble()
    while (organisms < 2) {
        print("Please enter a starting organism size over 2")
        organisms = readLine()!!.toDouble()
    }

    print("Average daily population increase (percentage): ")
    var avgPopIncrease = (readLine()!!.toDouble()) / 100
    while (avgPopIncrease < 0) {
        print("Enter a value greater than 0")
        avgPopIncrease = (readLine()!!.toDouble()) / 100
    }

    print("Number of days they will multiply:  ")
    var days = readLine()!!.toDouble()
    while (days < 1) {
        print("Please enter a value greater than 1")
        organisms = readLine()!!.toDouble()
        days = readLine()!!.toDouble()
    }
    for (i in 1 until (days + 1).toInt()){
        organisms *=(avgPopIncrease + 1)
        println("There are $organisms organisms after $i days")}}





