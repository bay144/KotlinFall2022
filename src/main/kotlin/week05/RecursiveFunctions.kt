package week05
// 5.2 Recursive functions
// Ana Osornio Baeza
fun main() {

    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))
    println(fib(6))
    println(fib(7))
    println(fib(10))
}
fun fib(num: Int): Int {
    if(num == 1 || num == 2)
        return 1
    if(num < 0)
        return 0
    return (fib(num-1)+fib(num-2))
}