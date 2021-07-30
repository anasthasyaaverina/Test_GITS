/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    var inputTime = "12:12:34 AM" // Change input time here, asumsi format pasti benar
    var timeSplitted = inputTime.split(" ")
    var timeArray = timeSplitted[0].split(":")
    if(timeSplitted[1] == "PM"){
        if(timeArray[0].toInt() == 12){
            println(inputTime)
        } else if(timeArray[0].toInt() < 12) {
            var newHour = timeArray[0].toInt()+12
            println(newHour.toString()+":"+timeArray[1]+":"+timeArray[2])
        }
    } else {
        if(timeArray[0].toInt() == 12){
            println("00:"+timeArray[1]+":"+timeArray[2])
        } else if(timeArray[0].toInt() < 12) {
            println(inputTime)
        }
    }
}