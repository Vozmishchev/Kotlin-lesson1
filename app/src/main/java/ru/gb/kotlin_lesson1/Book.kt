package ru.gb.kotlin_lesson1

object Book {

    var author:String =""
    var titleBook :String =""
    var year : Int = 0

    fun info() {
        println("$author написал книгу $titleBook в $year")
    }
}



