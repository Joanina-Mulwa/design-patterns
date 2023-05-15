package com.designPatterns.app;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world!
 * The factory design pattern says that define an interface
 * ( A java interface or an abstract class) for creating object
 * and let the subclasses decide which class to instantiate.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.drawShape("rectangle");
        shape.drawShape();

        BufferedReader br = new BufferedReader(new FileReader("FILENAME"));
        FileReader fileReader = new FileReader("Joanina");
        br.
    }
}
