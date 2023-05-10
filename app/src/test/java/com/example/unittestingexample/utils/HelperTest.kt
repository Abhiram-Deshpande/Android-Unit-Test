package com.example.unittestingexample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
import java.lang.Exception

class HelperTest {

    private lateinit var helper:Helper
    private var result:Boolean = false

    @Before
    fun setup(){
        helper = Helper()
        println("Initializing helper...")
    }
    @Test
    fun isPalindrome() {

        //Arrange
        //Act
         result = helper.isPalindrome("")
        //Assert
        assertEquals(true,result)
    }

    @Test
    fun isPalindrome_level_input(){

         result = helper.isPalindrome("madam")
        assertEquals(true,result)
    }

    @After
    fun tearDown(){
        println("Executed Successfully...")

    }

    @Test(expected = Exception::class)
    fun validatePassword() {
        val input_password = "joon"
        val password: String
        try {
            password = helper.validatePassword(input_password)
            if(password!=input_password){
                fail()
            }
        }catch (e:Exception){
            throw e
        }
        println(password)

    }

    @Test
    fun reverseString() {
        var expected = "abhiram"
        var actual = helper.reverseString(expected)
        println("Reversed String value: $actual")
        assertEquals(expected.reversed(),actual)
    }
}