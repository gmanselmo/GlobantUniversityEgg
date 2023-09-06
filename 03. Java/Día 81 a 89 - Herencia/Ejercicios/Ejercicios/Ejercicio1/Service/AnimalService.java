package Service;

import Entity.Animal;
import Entity.Cat;
import Entity.Dog;
import Entity.Horse;
import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */

public class AnimalService {
    
    ArrayList<Animal> animals = new ArrayList();
    
    public void animalBreeading() {
        
        animals.add(new Dog("Carlinios", "Pizza", 7, "Dogo"));
        
        animals.add(new Cat("Catencio", "Raw Meat", 3, "Persian"));
        
        animals.add(new Horse("Speed", "Sugar Cane", 8, "American Paint Horse"));
 
    }
    
    public void eat() {
        
        for (Animal animal : animals) {
            
            System.out.println(animal.eat());
            
        }
        
    }
    
}
