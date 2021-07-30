/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var stringInput = "ubi" // Change input string here
    stringInput = stringInput.lowercase()
    var strlen = stringInput.length
    var strlenper2 = Math.floor((stringInput.length/2).toDouble()).toInt()
    var check = true
    for (i in 0..(strlenper2-1)){
        if(stringInput[i] != stringInput[strlen-1-i]){
            check = false
            break
        }
    }
    if(check){
        println("It is a palindrome")
    } else {
        println("It is not a palindrome")
    }
}