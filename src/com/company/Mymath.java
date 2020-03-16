package com.company;

public class Mymath {
    private static final Mymath newmymath = new Mymath();
    public static Mymath getinstance(){
        return newmymath;
    }
    public int division(int a,int b){
        if(b==0)
            throw new ArithmeticException("Division by zero");
        return a/b;
    }
    public int intmultiply(int a,int b){
        return a*b;
    }
    public double Doublemultiply(double a,double b){
        return a*b;
    }
}