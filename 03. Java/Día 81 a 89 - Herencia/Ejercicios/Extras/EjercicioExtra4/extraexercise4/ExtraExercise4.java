package extraexercise4;

import Service.ProfessorService;
import Service.ServiceStaffService;
import Service.StudentService;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo.
 */

public class ExtraExercise4 {

    public static void main(String[] args) {

        ProfessorService professor = new ProfessorService();
        
        professor.createProfessor("Maths", LocalDate.parse("2020-09-30"), 14, "Carl", "Peterson", 112233, true);
        
        professor.showInfo();
        
        professor.changeOffice(15);
        
        professor.showInfo();
        
        professor.departmentChange("Spanish");
        
        professor.showInfo();
        
        ServiceStaffService serviceStaff = new ServiceStaffService();
        
        serviceStaff.createServiceStaff("Library", LocalDate.parse("2020-03-15"), 3, "Johan", "Polosky", 445566, false);
        
        serviceStaff.showInfo();
        
        serviceStaff.changeOffice(4);
        
        serviceStaff.showInfo();
        
        serviceStaff.changeSection("Laundry");
        
        serviceStaff.showInfo();
        
        StudentService student = new StudentService();
        
        student.createStudent(14, "Martin", "Trons", 996655, false);
        
        student.showInfo();
        
        student.newCourse(19);
        
        student.showInfo();
        
    }

}
