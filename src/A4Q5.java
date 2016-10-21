
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user
        Scanner input = new Scanner(System.in);
        
        // ask the user for their name
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        
        //ask the user what the test 1 is marked out of
        System.out.println("What was the first test out of?");
        double firsttest= input.nextDouble();
        
        //ask the user what he got for test1
        System.out.println("What mark did you get?");
        double FirstMark = input.nextDouble();
        
        //create a varaible to store the test 1 percentage
        double Firstp = ( FirstMark / firsttest) * 100;
        
        // ask the user what the test 2 was marked out of
        System.out.println("What was the second test out of?");
        double secondtest = input.nextDouble();
        //as the user what he got for test 2
        System.out.println("What mark did you get?");
        double SecondMark = input.nextDouble();
        
        // create a variable to troe the test 2 percentage
        double Secondp = ( SecondMark / secondtest) * 100;
        
        //ask the user wha the test 3 was marked out of
        System.out.println("What was the third test out of?");
        double thirdtest = input.nextDouble();
        //as the user what he got for test 
        System.out.println("What mark did you get?");
        double ThirdMark = input.nextDouble();
        
         // create a variable to store the test 3 percentage
        double Thirdp = ( ThirdMark / thirdtest) * 100;
        
         // ask the user what the test 4 was marked out of
        System.out.println("What was the fourth test out of?");
        double fourthtest = input.nextDouble();
        
        //as the user what he got for test 4
        System.out.println("What mark did you get?");
        double FourthMark = input.nextDouble();
        
        // create a variable to store the test 4 percentage
        double Fourthp = ( FourthMark / fourthtest ) * 100;
        
         // ask the user what the test 5 was marked out of
        System.out.println("What was the fifth test out of?");
        double fifthtest = input.nextDouble();
        
        //as the user what he got for test 5
        System.out.println("What mark did you get?");
        double FifthMark = input.nextDouble();
        
        // create a variable to store the test 5 percentage
        double Fifthp = ( FifthMark / fifthtest) * 100;
        
        //caculate all the percentage for all the tests
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + Firstp + "%");
        System.out.println("Test 2: " + Secondp + "%");
        System.out.println("Test 3: " + Thirdp + "%");
        System.out.println("Test 4: " + Fourthp + "%");
        System.out.println("Test 5: " + Fifthp + "%");
        
        //calucalte the average of the user
        double average = ((FirstMark + SecondMark+ ThirdMark + FourthMark + FifthMark) /(firsttest + secondtest + thirdtest + fourthtest + fifthtest) * 100); 
        
        //output for the average test score
        System.out.println("Average: " + average + "%");
        
        
                
                
                
        
        
        
        
        
    }
}
