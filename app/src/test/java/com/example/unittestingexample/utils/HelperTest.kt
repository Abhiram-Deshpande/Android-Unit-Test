package com.example.unittestingexample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    private lateinit var helper:Helper
    private var result:Boolean = false

    @Before
    fun setup(){
        helper = Helper()
        println("Before every testcase")
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
        println("After every testcase")
    }
}