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
public class Operators {
    public static void main(String[] args) {
        int myFirstValue = 20;
        int mySecondValue = 80;
        int myTotal = (myFirstValue + mySecondValue) * 25;
        int remainder = myTotal % 40;
        System.out.println("Remainder " + remainder);
        if(remainder <= 20)
        {
            System.out.println("Total estuvo por encima o igual del limite 20");
        }
    }
}
