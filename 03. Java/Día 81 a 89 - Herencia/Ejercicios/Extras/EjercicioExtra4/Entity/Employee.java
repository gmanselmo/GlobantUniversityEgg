package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class Employee extends Person {
    
    protected LocalDate employmentDate;
    protected int officeNumber;

    public Employee(LocalDate employmentDate, int officeNumber, String name, String lastName, int id, boolean married) {
        super(name, lastName, id, married);
        this.employmentDate = employmentDate;
        this.officeNumber = officeNumber;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
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
        return super.toString() + ", " + "employmentDate=" + employmentDate + ", officeNumber=" + officeNumber;
    }

}
