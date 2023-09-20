package Service;

import Entity.ServiceStaff;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public class ServiceStaffService extends EmployeeService {
    
    ServiceStaff serviceStaff;
    
    public void createServiceStaff(String assignedSection, LocalDate employmentDate, int officeNumber, String name, String lastName, int id, boolean isMarried) {
        
        serviceStaff = new ServiceStaff(assignedSection, employmentDate, officeNumber, name, lastName, id, isMarried);
        
    }

    @Override
    public void changeOffice(int officeNumber) {
        
        serviceStaff.setOfficeNumber(officeNumber);

    }
    
    public void changeSection(String assignedSection){
        
        serviceStaff.setAssignedSection(assignedSection);
        
    }

    @Override
    public void showInfo() {
        
        System.out.println(serviceStaff);
        
    }

}
