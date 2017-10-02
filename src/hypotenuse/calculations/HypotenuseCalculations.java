/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hypotenuse.calculations;

//import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author EvMcQ5970
 */
public class HypotenuseCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a side length: ");
        double side1 = input.nextDouble();
        System.out.println("Enter a second side length: ");
        double side2 = input.nextDouble();
        
        double hyp = hypotenuse(side1, side2);
        
        System.out.println("The hypotenuse of this triangle is: " + hyp);
        
    }
    
    
    /**
     * 
     * Method hypotenuse
     * Takes in two doubles and returns a hypotenuse calculated using
     * the two values
     * 
     * Precondition: two double values
     * Postcondition: one double value
     * 
     * @param x
     * @param y
     * @return 
     */
    
    
    public static double hypotenuse(double x, double y){
        
        double side1 = x;
        double side2 = y;
        
        double pow1 = Math.pow(side1, 2);
        double pow2 = Math.pow(side2, 2);
        double mult = pow1 + pow2;
        
        double hyp = Math.sqrt(mult);
        
        //double hyp = Math.hypot(side1, side2);
        
        return hyp;
    }
    
    
}
