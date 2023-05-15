package com.designPatterns.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Shape square = new Square();
        Shape redSquare = new RedShapeDecorator(new Square());
        square.drawShape();
        redSquare.drawShape();
    }
}
