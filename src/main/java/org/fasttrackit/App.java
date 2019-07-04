package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Sum sumofnr = new Sum();
       double sumfnr = sumofnr.sumOf(1,2) ;
        System.out.println( "Sum is :" + sumfnr);


        Substraction alg2 = new Substraction();
        double subalg = alg2.sub(5, 6);
        System.out.println("Substraction is :" + subalg);

        Multiplication alg3 = new Multiplication();
        double multiplication = alg3.multi(2,3);
        System.out.println("Multiplication is :" + multiplication);

        Division alg4 = new Division();
        double division = alg4.div(8,4);
        System.out.println( "Division is : " + division);

      Modulo alg5 = new Modulo();
        double modulo = alg5.modulo(4,2.5);
       System.out.println("Remainder is : " + modulo);
    }

}
