package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Professor extends Employee {
    
    private String department;

    public Professor(String department, LocalDate employmentDate, int officeNumber, String name, String lastName, int id, boolean married) {
        super(employmentDate, officeNumber, name, lastName, id, married);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public boolean isMarried() {
        return married;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
    
    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", " + "department=" + department + '}';
    }

}
