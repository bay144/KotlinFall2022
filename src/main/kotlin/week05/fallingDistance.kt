package week05
// 5.4 Falling Distance
// Ana Osornio Baeza

fun main(){
    println("Seconds | Meters fallen")
    for(i in 1..10){
        println("$i       |" + fallingDistance(i.toDouble()))
} }
fun fallingDistance(t: Double): Double {
    val g = 9.8
    return 0.5 * (g*(t*t))
}

