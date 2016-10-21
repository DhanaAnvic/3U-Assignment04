
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner input = new Scanner (System.in);
        
       //ask the user for measurement
        System.out.println("Please enter the  measuremrent in inches you wish to convert");
        double number = input.nextDouble();
        
        // multiply the number by 2.54 to find the measurement
        double measurement = number * 2.54;
        System.out.println( "Answer " + measurement);
  

        
    }
    
        
        

        
        
        
        
    }

