package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
    	//System.out.println("Who are you?"); 
    	String name = keyboard.nextLine();
    	System.out.printf("hello, %s", name);
    	keyboard.close();
    }
}
