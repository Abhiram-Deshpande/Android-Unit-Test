package com.example.unittestingexample.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterizedExample(val input:String, val expected:Boolean) {

    @Test
    fun test(){
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(expected,result)
    }


    companion object{

        @JvmStatic
        @Parameters(name = "{index}: {0} is palindrome - {1}")
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("amitabh",false),
                arrayOf("level",true),
                arrayOf("madam",true),
                arrayOf("",true)
            )
        }
    }
}