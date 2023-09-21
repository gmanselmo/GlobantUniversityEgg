package exercise2;

import Service.DogPoundService;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Exercise2 {

    public static void main(String[] args) {

        DogPoundService dogPound = new DogPoundService();
        
        dogPound.createDog("Orion", "White", 0);
        
        dogPound.createDog("Alpa", "Black", 1);
        
        try {
            
            for (int i = 0; i < 4; i++) {
            
                System.out.println(dogPound.getDogList()[i]);

            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: We have only 2 dogs, please change index.");
            
        }

    }

}
