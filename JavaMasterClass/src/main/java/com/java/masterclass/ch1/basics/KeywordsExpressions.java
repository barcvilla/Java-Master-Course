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
public class KeywordsExpressions {
    
    public static void exp1(int miles)
    {
        // una milla equivale a 1.609344 kilometros
        double kilometros = (miles * 1.609344);
        System.out.println(miles + " millas equivale a " + kilometros + " kilometros");
    }
    
    public static void main(String[] args) {
        exp1(100);
    }
}
