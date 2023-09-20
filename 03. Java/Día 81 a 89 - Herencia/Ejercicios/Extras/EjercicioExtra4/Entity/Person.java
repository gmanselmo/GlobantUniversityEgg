package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class Person {
    
    protected String name;
    protected String lastName;
    protected int id;
    protected boolean married;

    public Person(String name, String lastName, int id, boolean married) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    
    public void cambiarid() {
        System.out.println("HOLA");
    }

    @Override
    public String toString() {
        return "name=" + name + ", lastName=" + lastName + ", id=" + id + ", married=" + married;
    }

}
