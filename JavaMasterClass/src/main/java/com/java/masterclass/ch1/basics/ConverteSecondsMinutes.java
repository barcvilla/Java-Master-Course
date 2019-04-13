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
public class ConverteSecondsMinutes 
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    
    private static String getDurationString(long minutes, long seconds)
    {   
        if((minutes < 0) || (seconds < 0) || (seconds > 59))
        {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        
        String hoursString = hours + "h";
        if(hours < 10)
        {
            hoursString = "0" + hoursString;
        }
        
        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10)
        {
            minutesString = "0" + minutesString;
        }
        
        String secondsString = seconds + "s";
        if(seconds < 10)
        {
            secondsString = "0" + secondsString;
        }
        
        return hoursString + " " + minutesString + " " + secondsString;
    }
    
    private static String getDurationString(long seconds)
    {
        if(seconds < 0)
        {
            return INVALID_VALUE_MESSAGE;
        }
        
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
    
    public static void main(String[] args) {
        //System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(75));
    }
}
