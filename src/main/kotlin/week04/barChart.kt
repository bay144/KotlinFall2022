/* Ana Osornio Baeza
4.4 Bar Chart
 09/25/2022 */

fun main(){
    print("Enter today's sales for store 1: ")
    var store1 = Integer.valueOf(readLine())

    print("Enter today's sales for store 2: ")
    var store2 = Integer.valueOf(readLine())

    print("Enter today's sales for store 3: ")
    var store3 = Integer.valueOf(readLine())

    print("Enter today's sales for store 4: ")
    var store4 = Integer.valueOf(readLine())

    print("Enter today's sales for store 5: ")
    var store5 = Integer.valueOf(readLine())

    print("~SALES BAR CHART~")

    print("\nStore 1: ")
    while (store1 >= 100){
        print("*")
        store1 -= 100 }
    print("\nStore 2: ")
    while (store2 >= 100){
        print("*")
        store2 -=100
    }
    print("\nStore 3: ")
    while (store3 >= 100){
        print("*")
        store3 -=100
    }
    print("\nStore 4: ")
    while (store4 >= 100){
        print("*")
        store4 -=100
    }
    print("\nStore 5: ")
    while (store5 >= 100){
        print("*")
        store5 -=100
    }
}