
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a input for the user
        Scanner input = new Scanner (System.in);
        // create a variable to store in the numbers
        int number = 0;
        int num1 = 0;
        int num2= 0;
        int num3= 0;
        //askl the user to enter the numbers
        System.out.println("Please enter 4 numbers");
        number = input. nextInt();
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        //output all the numbers in one line
        System.out.println("Your numbers were " + number + "," + num1 + "," + num2 +  "and"  + num3);


        
                

                
        
        
    }
}
