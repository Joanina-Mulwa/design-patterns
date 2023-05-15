package com.designPatterns.app;

/**
 * Hello world!
 * This pattern involves a single class which is responsible to create an object
 * while making sure that only single object gets created.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Maths maths = Maths.getInstance();
        Maths maths2 = Maths.getInstance();

        System.out.println( "Hello World!" + maths.equals(maths2) );

        System.out.println("Add " + maths.add(10,10));
        System.out.println("Multiply " + maths.multiply(10,10));
        System.out.println("Subtract " + maths.subtract(10,10));
    }
}
