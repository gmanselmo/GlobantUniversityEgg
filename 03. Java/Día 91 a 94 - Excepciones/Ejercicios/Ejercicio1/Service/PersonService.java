package Service;

import Entity.Person;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PersonService {
    
    Person person = new Person();
    Scanner read = new Scanner(System.in);
    private boolean legal;
    private int imc;

    public void createPerson() {
        
        System.out.println("Name: ");
        
        person.setName(read.nextLine());
        
        System.out.println("Age: ");
        
        int age = read.nextInt();
        
        person.setAge(age);
        
        read.nextLine();
        
        System.out.println("Gender (M/F/O): ");
        
        person.setGender(read.nextLine());
        
        System.out.println("Weight (78.5): ");
        
        person.setWeight(read.nextDouble());
        
        System.out.println("Height (1.7): ");
        
        person.setHeight(read.nextDouble());
        
        read.nextLine();
        
    }
    
    public void imcCalculator() {
        
        double  operation = (person.getWeight() / (Math.pow(person.getHeight(), 2)));
        
        if (operation < 20) {
            
            imc = -1;
            
        } else if ((operation >= 20) && (operation <= 25)) {
            
            imc = 0;
            
        } else {
            
            imc = 1;
            
        }

    }
    
    public void legalAge() {
                
        legal = person.getAge() >= 18;

    }
    
    public void showPerson() {
        System.out.println(person);
    }
       
    public boolean isLegal() {
        return legal;
    }

    public int getImc() {
        return imc;
    }

}
