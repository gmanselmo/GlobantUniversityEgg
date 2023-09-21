package exercise1;

import Service.PersonService;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Exercise1 {

    public static void main(String[] args) {
        
//        ArrayList<PersonService> people = new ArrayList();
//        int legal = 0, underage = 0, underWeight = 0, overWeight = 0, perfectWeight = 0;
//
//        for (int i = 1; i <= 4; i++) {
//            PersonService person = new PersonService();
//            person.createPerson();
//            person.imcCalculator();
//            person.legalAge();
//            people.add(person);
//        }
//
//        for (PersonService person : people) {
//            if (person.isLegal()) {
//                legal++;
//            } else {
//                underage++;
//            }
//            switch (person.getImc()) {
//                case -1:
//                    underWeight++;
//                    break;
//                case 0:
//                    perfectWeight++;
//                    break;
//                case 1:
//                    overWeight++;
//                    break;
//            }
//            
//        }
//            
//        System.out.println("Percentage of individuals below their ideal weight: " + (underWeight / 4.0) * 100 + "%.");
//        
//        System.out.println("Percentage of individuals with ideal weight: " + (perfectWeight / 4.0) * 100 + "%.");
//
//        System.out.println("Percentage of individuals above their ideal weight: " + (overWeight / 4.0) * 100 + "%.");
//
//        System.out.println("Percentage of legal adults: " + (legal / 4.0) * 100 + "%.");
//
//        System.out.println("Percentage of underage individuals: " + (underage / 4.0) * 100 + "%.");

        try {
            
            PersonService person = null;
            
            person.createPerson();

            person.legalAge();
            
            person.showPerson();
            
        } catch (Exception e) {
            
            System.out.println("Not a valid person.");
            
        }

    }
    
}
