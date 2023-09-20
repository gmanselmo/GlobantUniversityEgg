package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Student extends Person{

    private int courseNumber;

    public Student(int courseNumber, String name, String lastName, int id, boolean married) {
        super(name, lastName, id, married);
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
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

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", " + "courseNumber=" + courseNumber + '}';
    }

}
