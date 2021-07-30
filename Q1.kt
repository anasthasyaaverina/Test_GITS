/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var numberInput = 21 // Change the input number here
    var state1 = (numberInput % 3 == 0)
    var state2 = (numberInput % 5 == 0)
    if(state1 && state2){
        println("Hello World")
    } else if(state2){
        println("World")
    } else if(state1){
        println("Hello")
    }
}