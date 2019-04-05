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
public class Float_Double {
    
    public static void test1()
    {
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = "  + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
    
    public static void convertPoundsToKilograms(double pounds)
    {
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println("En " + pounds + " pounds hay " + convertedKilograms + " Kilograms");
    }
    
    public static void main(String[] args) {
        test1();
        convertPoundsToKilograms(200);
    }
}
