package com.training.example.JacocoExample;
import static  org.junit.Assert.*;
import org.junit.Test;
public class PalindromeTest{
     @Test
     public void whenEmptyString_themAccept(){
         palindrome palindromeTester =new Palindrome();
         assertTrue(palindromeTester.isPalindrome("madam"));
       
     }
}
