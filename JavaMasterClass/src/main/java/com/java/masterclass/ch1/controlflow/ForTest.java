/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.masterclass.ch1.controlflow;

/**
 *
 * @author PC
 */
public class ForTest 
{
    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }
    
    public static void calculateInterestUsingFor(double amount)
    {
        for(int i = 2; i < 9; i++)
        {
            System.out.println("10,000 at " +  i + "% interest = " + String.format("%.2f" ,calculateInterest(10000, i)));
        }
    }
    
    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }
        for(int i = 2; i <= n/2; i++)
        {
            if(n % 1 == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * crear un sentencia for usando una rango de numeros
     * determinar si el numero es primo usando el metodo prime
     * si es un numero primo imprimirlo e incrementar el count
     */
    
    public static void testPrime()
    {
        int count = 0;
        for(int i= 10; i < 50; i++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println("Number: " + i + " is a prime number");
            }
        }
    }
    
    public static void main(String[] args) {
        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        calculateInterestUsingFor(10000);
        
    }
            
}
