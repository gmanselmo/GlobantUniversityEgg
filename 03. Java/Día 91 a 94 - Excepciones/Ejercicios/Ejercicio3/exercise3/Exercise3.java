package exercise3;

import Service.NumberDivisionService;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Exercise3 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        NumberDivisionService numberDivision = new NumberDivisionService();
        
        System.out.println("Number 1 and 2:");

        numberDivision.division(read.nextLine(), read.nextLine());

    }

}
