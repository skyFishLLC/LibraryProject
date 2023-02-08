package dev.skyfish.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zeroToOne = LibraryBook(
            title = "Zero to One",
            author = "Peter Thiel",
            publishYear = 2014,
            genre = "Business",
            pageLength = 210,
        )

        val harryPotter = LibraryBook(
            title ="Harry Potter and the Philosopher's Stone",
            author = "J. K. Rowling",
            publishYear = 1997,
            genre = "Fantasy",
            pageLength = 283,
            checkoutDuration = 14,
            isAvailable = false,
        )

        val kickstart = DigitalLibraryBook(
            title = "Kickstart Modern Android Development with Jetpack and Kotlin",
            author = "Catalin Ghita",
            publishYear = 2022,
            genre = "Software Development",
            pageLength = 472,
            isAudioBook = false,
            isPdf = true,
            isEpub = true,
        )

        zeroToOne.printLog()
        harryPotter.printLog()
        kickstart.printLog()

    }
}
