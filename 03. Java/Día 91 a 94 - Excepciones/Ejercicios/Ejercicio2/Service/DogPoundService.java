package Service;

import Entity.Dog;
import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo.
 */

public class DogPoundService {

    Dog[] dogList = new Dog[2];

    public Dog[] getDogList() {
        return dogList;
    }
    
    public void createDog(String name, String color, int index) {
        
        dogList[index] = new Dog(name, color);
        
    }

}
