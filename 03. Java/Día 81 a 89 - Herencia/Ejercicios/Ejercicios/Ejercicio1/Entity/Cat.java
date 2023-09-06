package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, String food, int age, String animalType) {
        super(name, food, age, animalType);
    }
    
    @Override
    public String eat() {
        
        return name + " is chowing down on some " + food + ".";
        
    }

}
