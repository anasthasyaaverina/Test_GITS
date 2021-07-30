/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var emailInput = "anasthasyaaverina@h.id" // Change the input email here
    if (emailInput.contains("@") && emailInput.count{"@".contains(it)} == 1){
        var emailSplit = emailInput.split("@")
        if(emailSplit[0].length <= 20){
            if(emailSplit[1].contains(".") && emailSplit[1][0].toString() != "."){
                if(emailSplit[1].count{".".contains(it)} == 2 && emailSplit[1].contains(".co.id")){
                    println("Email diterima")
                } else if(emailSplit[1].count{".".contains(it)} == 1 && emailSplit[1].contains(".id")){
                    println("Email diterima")
                } else {
                    println("Domain yang diperbolehkan hanyalah : .co.id atau .id")
                }
            }
            else {
                println("Format email masih salah !")
            }
        } else {
            println("Panjang karakter sebelum @ adalah maks 20")
        }
    } else {
        println("Belum ada tanda @ / Tanda @ lebih dari 1")
    }
}