package dev.skyfish.libraryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dev.skyfish.libraryproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        var books = mutableListOf(zeroToOne, harryPotter, kickstart)
        var i = 0

        binding.button.setOnClickListener {
            val book = books[i]
            binding.tvTitle.text = book.title
            binding.tvAuthor.text = book.author
            binding.tvAvailable.text = if(book.isAvailable) "Available" else "Unavailable"
            binding.tvGenre.text = book.genre
            binding.tvPageLength.text = book.pageLength.toString()
            binding.tvPublishYear.text = book.publishYear.toString()
            binding.tvCheckoutDuration.text = book.checkoutDuration.toString()

            if(i == books.size - 1){
                i = 0
            } else {
                i++
            }

        }

        zeroToOne.printLog()
        harryPotter.printLog()
        kickstart.printLog()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("Main_Activity","Saving UI State")

        outState.putCharSequence("title",binding.tvTitle.text)
        outState.putCharSequence("author",binding.tvAuthor.text)
        outState.putCharSequence("year",binding.tvPublishYear.text)
        outState.putCharSequence("genre",binding.tvGenre.text)
        outState.putCharSequence("length",binding.tvPageLength.text)
        outState.putCharSequence("available",binding.tvAvailable.text)
        outState.putCharSequence("duration", binding.tvCheckoutDuration.text)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle){
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("Main_Activity","Restoring UI State")

        binding.tvTitle.text = savedInstanceState.getCharSequence("title")
        binding.tvAuthor.text = savedInstanceState.getCharSequence("author")
        binding.tvPublishYear.text = savedInstanceState.getCharSequence("year")
        binding.tvGenre.text = savedInstanceState.getCharSequence("genre")
        binding.tvPageLength.text = savedInstanceState.getCharSequence("length")
        binding.tvAvailable.text = savedInstanceState.getCharSequence("available")
        binding.tvCheckoutDuration.text = savedInstanceState.getCharSequence("duration")
    }
}

