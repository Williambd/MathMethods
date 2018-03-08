/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathmethods;

import java.util.Scanner;

/**
 *
 * @author Widea9928
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continuous compound interest calculation:");
        
        //takes initial deposit
        System.out.println("Input initial deposit in $");
        double b = scanner.nextDouble();
        
        //takes interest rate
        System.out.println("Input interest rate (decimal)");
        double r = scanner.nextDouble();
        
        //takes elapsed time
        System.out.println("Input elapsed time in years");
        double t = scanner.nextDouble();
        
        //multiplies the original balance by e to the power of r*t, computing interest
        b = b*Math.exp(r*t);
        
        //outputs balance
        System.out.println("The final balance will be $"+b+"\n");
        
        //Calculate the height of a building based on a shadow length
        System.out.println("Building Height Calculation:");
        
        //takes angle of sun in degrees, converts to radians
        System.out.println("Input angle of the sun from ground in degrees");
        double a = scanner.nextDouble();
        a = Math.toRadians(a);
        
        //takes angle of shadow
        System.out.println("Input shadow length:");
        double l = scanner.nextDouble();
        
        //finds the side of opposite (aka the building)
        double h = (Math.tan(a)*l);
        System.out.println("The object is "+h+" units high \n");
        
        //Positive or negative finder
        //gets the number
        System.out.println("input a number");
        double num = scanner.nextDouble();
        
        //finds out the sign then outputs accordingly
        num = Math.signum(num);
        if (num == 1){
            System.out.println("Yo numba be positive");
        }else if (num == -1){
            System.out.println("Yo numba be negative");
        }else if (num == 0){
            System.out.println("Yo numba be ZERO");
        }
        
    }
    
}
