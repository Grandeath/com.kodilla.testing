package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int add(){
        return a + b;
    }

    public double subtract(){
        return (double) a/ (double) b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
