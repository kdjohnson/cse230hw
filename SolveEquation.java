/* HOMEWORK #2
* WINTER 2015
* Joseph, Borel
* KaJuan, Johnson
* Both partners worked together to complete the lab
*/

package Quadratic;
import java.util.Scanner;

public class SolveEquation {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner( System.in );
        /*
        System.out.println("Enter a real number");
        double real = scan.nextDouble();
        System.out.println("Enter a imaginary");
        double imag = scan.nextDouble();
        */
                
        System.out.println( "Please enter a value for a: " );
        int a = scan.nextInt( );
        
        System.out.println( "Please enter a value for b: " );
        int b = scan.nextInt( );
        
        System.out.println( "Please enter a value for c: " );
        int c = scan.nextInt( );
        
        Quadratic equation = new Quadratic( a, b, c );
        
        equation.solveQuadratic( );
        
        Complex num = new Complex(real, imag );
        Complex num2 = new Complex(4.0, -7.0); 
         
        System.out.println( "Real number: " + num.getReal() );
        System.out.println( "Imaginary number: " + num.getImaginary() );
        System.out.println( "Are they equal: " + num.equals(num2) );
        System.out.println( "Is it real: " + num.isReal() );
        System.out.println( "Complex number: " + num.toString() ); 
        
        Complex num3 = new Complex(4.0, -7.0);
        ComplexPair pair1 = new ComplexPair( num2, num3 );
        ComplexPair pair2 = new ComplexPair(num, num2);
        
        System.out.println("Are they identical: " + pair1.bothIdentical() );
        System.out.println("Are they equal: " + pair1.equals(pair2));
        System.out.println("First complex: " + pair1.getFirst() );
        System.out.println("Second complex: " + pair2.getSecond() ); 
        System.out.println("ComplexPair: " + pair1.toString() );
       
        //I didn't test the sets! 
        //I didn't change the ComplexPair toString just tested 
        
    }
    
}
