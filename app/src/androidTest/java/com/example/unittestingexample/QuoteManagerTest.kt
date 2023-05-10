package com.example.unittestingexample

import android.content.Context
import androidx.appcompat.app.ActionBar.DisplayOptions
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runners.Parameterized.Parameters
import java.io.FileNotFoundException

class QuoteManagerTest {

//      @ParameterizedTest
//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    @Test(expected = FileNotFoundException::class)
    fun getQuoteList() {

        val manager= QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        manager.populateQuotesFromAssets(context,"")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testPopulateQuoteFromAssets_InvalidJSONFormat_expected() {

        val manager= QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        manager.populateQuotesFromAssets(context,"malformed.json")
    }

    @Test()
    fun testPopulateQuoteFromAssets_ValidJSONFormat_expected() {

        val manager= QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        manager.populateQuotesFromAssets(context,"quotes.json")
        val quotes_count = manager.quoteList.size
        assertEquals(34,quotes_count)
    }

    @Test
    fun testPreviousQuote_expected_CorrectQuote(){
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(arrayOf(
            Quote("1","This is quote 1"),
            Quote("2","This is quote 2"),
            Quote("3","This is quote 3"),
            Quote("4","This is quote 4"),
            Quote("5","This is quote 5"),
        ))

        val quote = quoteManager.getPreviousQuote()
        assertEquals("1",quote.author)
    }
}