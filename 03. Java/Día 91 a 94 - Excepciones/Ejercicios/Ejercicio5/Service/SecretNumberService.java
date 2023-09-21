package Service;

import Entity.SecretNumber;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class SecretNumberService {

    SecretNumber secretNumber = new SecretNumber();
    
    Scanner read = new Scanner(System.in);
    
    public void runGame() {
        
        boolean runs = true;
        
        int counter = 0;
        
        while (runs) {
            
            try {
                
                System.out.println("Please enter a number between 1 and 500: ");

                int number = read.nextInt();
                
                counter++;
                

                if (number == secretNumber.getNumber()) {
                    
                    System.out.println("You won!");
                    
                    runs = false;
                    
                } else if (number > secretNumber.getNumber()) {
                
                    System.out.println("Your number is greater than the secret number.");
                
                } else {
                    
                    System.out.println("Your number is less than the secret number.");
                    
                }
                
            } catch (Exception e) {
                
                System.out.println("Your input must be a number!");
                
                read.nextLine();
                
            }
            
        }
        
        System.out.println("Attempts: " + counter + ".");
        
    }

}
