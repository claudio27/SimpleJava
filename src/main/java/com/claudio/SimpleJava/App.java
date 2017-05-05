package com.claudio.SimpleJava;

import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        String txt = "017268632K";
        
        System.out.println(txt.contains("17268632"));
        
        
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.add(Calendar.DAY_OF_YEAR, 4);
        System.out.println(cal.getTime());
        
        
    }
}
