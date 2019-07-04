package org.fasttrackit;

public class Sum {
    public double sumOf(double a, double b){
                return a+b;
    }

    public double sumOf(int a, int b){
    return sumOf((double)a,(double)b);
    }

}
