package org.fasttrackit;

public class Modulo {
    public double modulo(double a, double b){
       // double mod = a % b;
        return a % b;
    }
    public double modulo(int a, int b){
        double c = (double)a;
        double d = (double)b;
        return modulo(c,d);



    }
}
