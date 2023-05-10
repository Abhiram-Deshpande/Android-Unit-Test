package com.example.unittestingexample.utils

import java.lang.Exception
import kotlin.jvm.Throws

class Helper {
    fun isPalindrome(input:String):Boolean{
        var i =0;
        var j = input.length-1;
        while(i<=j){
            if(input[i]!=input[j])
                return false
            i++;
            j--;
        }
        return true
    }

    @Throws(Exception::class)
    fun validatePassword(password:String):String{

        if(password.isEmpty())throw Exception("Password cannot be empty")
        if(password.length<6 || password.length>15)throw Exception("Password length does not match")
       else return password
    }

    fun reverseString(input: String):String{

        var array = input.toCharArray()
        var l=0
        var r = input.length-1;
        while(l<r){
            var temp = array[l]
            array[l]=array[r]
            array[r]= temp
            l++
            r--
        }
        return String(array)
    }

}