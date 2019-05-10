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
public class SwitchTest {
    
    public static void ifStatement(int value)
    {
        if(value == 1)
        {
            System.out.println("Value was 1");
        }
        else if(value == 2)
        {
            System.out.println("Value was 2");
        }
        else
        {
            System.out.println("Value was not 1 or 2");
        }
    }
    
    public static void switchStatement(int value)
    {
        switch(value)
        {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
    }
    
    public static void switchStatement1(char value)
    {
        switch(value)
        {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(value + " value was found");
                break;
            default:
                System.out.println("could not find A, B, C, D or E");
                break;
        }
    }
    
    public static void guessMonth(String month)
    {
        switch(month.toUpperCase())
        {
            case "ENERO":
                System.out.println("Mes de:" + month);
                break;
            case "FEBEREO":
                System.out.println("Mes de: " + month);
                break;
            case "MARZO": case "ABRIL": case "MAYO":
                System.out.println("Mes de: " + month);
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
    
    public static void main(String[] args) {
        //ifStatement(3);
        //switchStatement(5);
        switchStatement1('A');
        guessMonth("marzo");
    }
}
