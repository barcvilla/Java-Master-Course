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
public class OverridenMethod 
{
    //1er metodo
    public static double calcFeetAndInchToCentimeters(double feet, double inches)
    {
        //validaciones
        if((feet < 0) || ((inches < 0 ) || (inches > 12)))
        {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        //operaciones
        double centimeters = (feet * 12) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    
    //2do metodo
    public static double calcFeetAndInchToCentimeters(double inches)
    {
        if(inches < 0)
        {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingFeets = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingFeets + " inches");
        return calcFeetAndInchToCentimeters(feet, remainingFeets);
    }
    
    public static void main(String[] args) {
        calcFeetAndInchToCentimeters(6, 13);
        calcFeetAndInchToCentimeters(157);
    }
}
