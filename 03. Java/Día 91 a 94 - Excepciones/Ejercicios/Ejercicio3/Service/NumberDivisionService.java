package Service;

import Entity.NumberDivision;

/**
 *
 * @author Germán M. Anselmo.
 */

public class NumberDivisionService {
    
    NumberDivision numberDivision;
    
    public void division(String number1, String number2) {
        
        try {
            
            int num1 = Integer.parseInt(number1);
        
            int num2 = Integer.parseInt(number2);
        
            numberDivision = new NumberDivision(num1, num2);

            numberDivision.setOutcome(num1 / num2);

            System.out.println("Outcome: " + numberDivision.getOutcome() + ".");    
            
        } catch (NumberFormatException e) {
            
            System.out.println(e.getMessage());
            
            System.out.println("Error: your input shouldn't be a character.");
        
        }
        
    }

}
