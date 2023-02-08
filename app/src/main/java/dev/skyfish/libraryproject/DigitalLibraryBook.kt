package dev.skyfish.libraryproject

import android.util.Log

class DigitalLibraryBook(
    title: String,
    author: String,
    publishYear: Int,
    genre: String,
    pageLength: Int,
    checkoutDuration: Int = 21,
    isAvailable: Boolean = true,
    val isAudioBook: Boolean,
    val isPdf: Boolean,
    val isEpub: Boolean,
): LibraryBook(
    title = title,
    author = author,
    publishYear = publishYear,
    genre = genre,
    pageLength = pageLength,
    checkoutDuration = checkoutDuration,
    isAvailable = isAvailable
) {

    override fun printLog(){
        val text = "Title: $title, Author: $author, Publish Year $publishYear\n Genre: $genre, Length: $pageLength" +
                "Checkout Duration: $checkoutDuration, Available: $isAvailable\n" +
                "Audio Book: $isAudioBook, PDF Format: $isPdf, EPUB Format: $isEpub"
        Log.i("LibraryBook", text)
    }

}

















