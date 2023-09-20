package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class ServiceStaff extends Employee {
    
    private String assignedSection;

    public ServiceStaff(String assignedSection, LocalDate employmentDate, int officeNumber, String name, String lastName, int id, boolean married) {
        super(employmentDate, officeNumber, name, lastName, id, married);
        this.assignedSection = assignedSection;
    }

    public String getAssignedSection() {
        return assignedSection;
    }

    public void setAssignedSection(String assignedSection) {
        this.assignedSection = assignedSection;
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
        return "ServiceStaff{" + super.toString() + ", " + "assignedSection=" + assignedSection + '}';
    }

}
