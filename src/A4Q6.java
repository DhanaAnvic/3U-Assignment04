
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
        
        //ask the user of how many minutes he get during daytime
        System.out.println("Number of daytime minutes? ");
        double dmin = input.nextDouble();
        
        //ask the user how many minutes did he get during evening 
        System.out.println("Number of evening minutes? ");
        double emin = input.nextDouble();
        
        //ask the user how many minutes did he used during the weekend
        System.out.println("Number of weekend minutes?");
        double wmin = input.nextDouble();
        
        //find each price for daytime, evening, and weekend using plan A
        double admin = (dmin - 100) * (0.25) ;
        double bemin = (emin * 0.15);
        double cwmin = (wmin * 0.20);
        
        //add the prices together to find the total cost for plan A
        double totalforPlanA = (admin + bemin +cwmin);
        System.out.println("Plan A costs " + totalforPlanA);
        
          
        // find each price during daytime, evening, and weekend using plan B
        double ddmin = (dmin - 250) * (0.45);
        if (ddmin < 0){
            ddmin = 0;
        }
        double eemin = (emin * 0.35);
        double fwmin = (wmin * 0.25);
        
        // add the prices together to find the total cost for Plan b
        double totalforPlanB =(ddmin + eemin + fwmin);
        System.out.println("Plan B costs " + totalforPlanB);
        System.out.println("Plan B is cheapest.");
         
        
        
      
        
        
        
    }
}
