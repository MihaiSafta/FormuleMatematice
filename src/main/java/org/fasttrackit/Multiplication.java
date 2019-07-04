package org.fasttrackit;

public class Multiplication {
    public double multi(double a, double b){
        return a*b;
    }
    public double multi(int a, int b){
        return multi((double)a,(double)b);
    }
}
