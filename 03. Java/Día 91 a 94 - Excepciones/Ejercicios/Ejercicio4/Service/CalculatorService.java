package Service;

import Entity.Calculator;
import java.util.InputMismatchException;

/**
 *
 * @author Germán M. Anselmo.
 */

public class CalculatorService {

    Calculator calculator;
    
    public void division(String number1, String number2) {
        
        try {
            
            int num1 = Integer.parseInt(number1);
        
            int num2 = Integer.parseInt(number2);

            calculator = new Calculator(num1, num2);
            
            calculator.setOutcome(calculator.getNumber1() / calculator.getNumber2());

            System.out.println("Outcome: " + calculator.getOutcome() + ".");
        
        } catch (InputMismatchException | NumberFormatException e) {
            
            System.out.println(e.getMessage());
            
            System.out.println("Inputs should be integer numbers.");
            
        } catch (ArithmeticException e) {
            
            System.out.println(e.getMessage());
            
            System.out.println("You can't divide by 0.");
            
        }
        
    }

}
