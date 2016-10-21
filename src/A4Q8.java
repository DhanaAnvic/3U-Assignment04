
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
        
        //ask the player to roll the dice
        System.out.println("Enter sum of dice:");
        //create a variable to store in the integer
        int rolldice = input.nextInt();
        // create a variable to store in the sum of the dice rolled in
        int gameone= (rolldice + 1);
        System.out.println("You are now on square: " + gameone);
        
        // ask the player to roll dice the second time 
        System.out.println("Enter sum of dice:");
        int rolldicesec = input.nextInt();
        int gametwo = ((rolldicesec + rolldice) + 1) ;
        System.out.println("You are now sqaure: " + gametwo);
                
        // create a variable to store in laddder1
        int ladderone = 0;
        
        //create a varaible to store in ladder2
        int laddersecond = 0;
        
        //create a variable to store in ladder3 
        int ladderthird = 0;
        
        // create a varaible to store in snake 1
        int snakeone = 0;
        
        //create a variable to strore in snake 2
        int snaketwo = 0;
        
        // create a variable to store in snake 3
        int snakethree = 0;
        
        
        
    }
}
