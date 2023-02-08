package dev.skyfish.libraryproject

import android.util.Log

open class LibraryBook(
    val title: String,
    val author: String,
    val publishYear: Int,
    val genre: String,
    val pageLength: Int,
    var checkoutDuration: Int = 30,
    var isAvailable: Boolean = true,
) {

    fun markAvailable(){
        isAvailable = true
    }

    fun markUnavailable(){
        isAvailable = false
    }

    fun setCheckoutLength(days: Int){
        checkoutDuration = days
    }

    open fun printLog(){
        val text = "Title: $title, Author: $author, Publish Year $publishYear\n Genre: $genre, Length: $pageLength" +
                "Checkout Duration: $checkoutDuration, Available: $isAvailable"
        Log.i("LibraryBook", text)
    }

}