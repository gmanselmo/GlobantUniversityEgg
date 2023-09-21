package exercise4;

import Service.CalculatorService;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Exercise4 {

    public static void main(String[] args) {

        CalculatorService calculator = new CalculatorService();
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Number 1 and 2:");
        
        calculator.division(read.nextLine(), read.nextLine());

    }

}
