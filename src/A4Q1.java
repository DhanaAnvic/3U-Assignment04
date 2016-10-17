
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create input for the user
        Scanner input = new Scanner(System.in);
        
        //ask the user for their name
        System.out.println("Please enter your name:");
        //get the name from the user
        String name = input.nextLine ();
        //say hello
        System.out.println("Hello " + name);
        System.out.println("How are you today?");
        
        
        
    }
}
