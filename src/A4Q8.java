
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
        double sum  = 1;
        while (sum < 100){
        
        // ask the user to roll the dice and what is the sum
        System.out.println("Enter sum of dice:");
        double num = input.nextDouble();
        //if the sum is zero
        if (num == 0){
            System.out.println("You Quit!");
        }
        sum= num + sum;
        //Tell the user they will end up when landing each snake
        if (sum == 54) {
            sum = 19;
        }
        if (sum == 90) {
            sum = 48;
        }
        if (sum == 99){
            sum = 77;
            
        }
        
        // tell the usr what suqare will they land if the landed on ladders
        
        if (sum == 9){
            sum = 34; 
        }
        if (sum == 40){
            sum = 64;
        }
        if (sum == 67){
            sum = 86;
        }
        
        // tell the user what square they are on
        System.out.println("You are on square:" + sum);
        //answers
        if (sum == 100){
            System.out.println("Congratulations you won!");
        }
        
   }
}
}

