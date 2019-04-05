/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.masterclass.ch1.basics;

/**
 *
 * @author PC
 */
public class Char_Boolean {
    
    public static void test1()
    {
        char myCharValue = '\u00A9';
        System.out.println("Unicode output was: " + myCharValue);
        boolean myBooleanValue = true;
        boolean isMale = false;
    }
    
    public static void printUnicodeCharacter()
    {
        char registerSymbol = '\u00AE';
        System.out.println("Register Symbol: " + registerSymbol);
    }
    
    public static void main(String[] args) {
        test1();
        printUnicodeCharacter();
    }
}
