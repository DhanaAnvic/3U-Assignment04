
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner input = new Scanner (System.in);
        // store in some variables
        int food = 0;
        int DJ = 0;
        int hallrental = 0;
        int decoration = 0;
        int staff = 0;
        int expenses = 0;
        
        // ask the people how much the food is
        System.out.println("Enter the cost of food for the prom ");
        double f = input.nextDouble();
        
        // ask the committee how much the dj cost
        System.out.println("Enter the Dj cost ");
        double d = input.nextDouble();
        
        //ask the committee how much the csot of the venue for the prom
        System.out.println("Enter the cost to rent the hall ");
        double h = input.nextDouble();
        
        //ask the committee how much the decorations are
        System.out.println("Enter the cost of the decorations");
        double c = input.nextDouble();
        
        // ask the committee ho much money do they need to have for the staff
        System.out.println("Enter the cost for staff");
        double s = input.nextDouble();
        
        //ask the committee how much are the miscelleneous cost
        System.out.println("Enter the miscelleneous cost");
        double co = input.nextDouble();
        
        // telling the committee the total
        double total =  f + d + h + c + s + co ;
        double tickets =  Math.ceil (total / 35);
        System.out.println("The total cost is $"  + total + ". You will need to sell " + tickets + " tickets to break even.");
        
     
        
        
        
                
        
        
        
        
        
        
    }
}
