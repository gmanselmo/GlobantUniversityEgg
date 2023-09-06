package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, String food, int age, String animalType) {
        super(name, food, age, animalType);
    }
    
    @Override
    public String eat() {
        
        return name + " is chowing down on some " + food + ".";
        
    }

}
