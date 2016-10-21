
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
              
        // ask the driver their what is the standard limit of spped on that road
        System.out.println("Enter the speed limit:");
        int speedA = input.nextInt();
        
        // ask the driver what was his/her speed 
        System.out.println("Enter the recorded speed of the car:");
        int speedB = input.nextInt();
        
        //create a variable to store in the fine for the over limit
        int overlimitA = 100;
        int overlimitB = 270;
        int overlimitC = 500;
        
        //If the driver is speeding
        if (speedB > speedA){
            //output for all instances
            System.out.println("Your are speeding and your fine is $");
            // if the driver speeding over 2o km/h over the limit
            if (speedB < speedA + 20){
            System.out.print(overlimitA + "." );
            }
            //if the driver is speeding over 30 km/h over the limit
            if (speedB < speedA + 30 ){
                System.out.print( overlimitB + "." );
            }
            //if the driver is speeding over 31 km/h above over the limit
            if (speedB > speedA + 30){
                System.out.print( overlimitC + ".");
            }
         } else {
            //if the diver if not speeding over the limit or within the range of safe speed
            System.out.print("Congratulations, you are within the speed limit!");
            }
    }
    }





    
   
        
        
    
        
        
        
    
      


