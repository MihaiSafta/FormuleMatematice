package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sum sumofnr = new Sum();
       double sumfnr = sumofnr.SumOf(1.5,2.5) ;
        System.out.println( "Sum is :" + sumfnr);

        Substraction alg2 = new Substraction();
        double subalg = alg2.substractionOfTwoNumbers(5, 2);
        System.out.println("Substraction is :" + subalg);

        Multiplication alg3 = new Multiplication();
        double multiplication = alg3.Multi(12.5, 33.5);
        System.out.println("Multiplication is :" + multiplication);

        Division alg4 = new Division();
        double division = alg4.Div(66.66,32);
        System.out.println( "Division is : " + division);

        Modulo alg5 = new Modulo();
        double modulo = alg5.modulo(51, 5);
        System.out.println("Remainder is : " + modulo);
    }
}
