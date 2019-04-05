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
public class ByteShortInt {
    
    public static void primitiveTest()
    {
        long myMinLongValue = -9223372036854775808L;
        long myMaxLongValue = 9223372036854775807L;
        
        int myMinIntValue = -2147483648;
        int myMaxIntValue = 2147483647;
        int myIntTotal = (myMinIntValue / 2);
        System.out.println("myIntTotal is " + myIntTotal);
        
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        
        byte myMinByteValue = -128;
        byte myMaxBuyeValue = 127;
        byte myByteTotal = (byte)(myMinByteValue / 2);
        System.out.println("myByteTotal is " + myByteTotal);
    }
    
    public static void primitiveEx()
    {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("ShortTotal: " + shortTotal);
        System.out.println("LongTotal: " + longTotal);
    }
    
    public static void main(String[] args) {
        primitiveEx();
        
    }
}
