package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public class Animal {
    
    protected String name;
    protected String food;
    protected int age;
    protected String animalType;

    public Animal() {
    }

    public Animal(String name, String food, int age, String animalType) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String eat() {
        
        return name + " is chowing down on some " + food + ".";
        
    }

}
