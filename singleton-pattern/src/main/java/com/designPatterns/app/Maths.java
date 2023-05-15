package com.designPatterns.app;

public class Maths {
    private static Maths instance;

    private Maths(){
        System.out.println("Calling the constructor");
    }

    public static Maths getInstance(){
        if(instance == null){
            instance = new Maths();
        }
        return instance;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
}
