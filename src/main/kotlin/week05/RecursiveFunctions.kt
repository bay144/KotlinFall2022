package week05
// 5.2 Recursive functions
// Ana Osornio Baeza
/*
You’re going to see what happens when a function calls itself, a behavior called recursion.
This may sound unusual, but it can be quite useful.
You’re going to write a function that computes a value from the Fibonacci sequence.
 Any value in the sequence is the sum of the previous two values.
 The sequence is defined such that the first two values equal 1. That is, fibonacci(1) = 1 and fibonacci(2) = 1.
Write your function using the following declaration:
fun fibonacci(number: Int): Int
Then, verify you’ve written the function correctly by executing it with the following numbers:
fibonacci(1)  // = 1
fibonacci(2)  // = 1
fibonacci(3)  // = 2
fibonacci(4)  // = 3
fibonacci(5)  // = 5
fibonacci(6)  // = 8
fibonacci(7)  // = 13
fibonacci(10) // = 55
Hint 1: For values of number less than 0, you should return 0.
Hint 2: To start the sequence, hard-code a return value of 1 when number equals 1 or 2.
Hint 3: For any other value, you’ll need to return the sum of calling fibonacci with number - 1 and number - 2.
Note: This way of calculating the Fibonacci numbers is not terribly efficient.
One technique to improve the performance is called memoization, which stores the results of previous calculations and reuses them when possible.
Create a file named recursiveFunction.kt and save it in your week05 folder in Github.
 */