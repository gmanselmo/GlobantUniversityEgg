package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Dog {

    private String name;
    private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", color=" + color + '}';
    }

}
