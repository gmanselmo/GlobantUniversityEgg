package Service;

import Entity.Professor;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public class ProfessorService extends EmployeeService {
    
    Professor professor;

    public void createProfessor(String department, LocalDate employmentDate, int officeNumber, String name, String lastName, int id, boolean isMarried) {
        
        professor = new Professor(department, employmentDate, officeNumber, name, lastName, id, isMarried);       
                
    }
    
    @Override
    public void changeOffice(int officeNumber) {
        
        professor.setOfficeNumber(officeNumber);

    }
    
    public void departmentChange(String department) {
        
        professor.setDepartment(department);
        
    }

    @Override
    public void showInfo() {
        
        System.out.println(professor);
        
    }

}
