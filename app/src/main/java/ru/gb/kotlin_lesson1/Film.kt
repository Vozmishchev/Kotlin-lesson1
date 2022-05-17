package ru.gb.kotlin_lesson1

data class Film(
    val title: String,
    val year: Int)
{
    override fun toString(): String {
        return "$title $year"
    }
}





