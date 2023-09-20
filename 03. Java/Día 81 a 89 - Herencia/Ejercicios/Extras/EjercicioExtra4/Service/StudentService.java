package Service;

import Entity.Student;

/**
 *
 * @author Germán M. Anselmo.
 */

public class StudentService extends PersonaService {
    
    Student student;
    
    public void createStudent(int courseNumber, String name, String lastName, int id, boolean isMarried) {
        
        student = new Student(courseNumber, name, lastName, id, isMarried);

    }
    
    public void newCourse(int courseNumber) {
        
        student.setCourseNumber(courseNumber);
        
    }

    @Override
    public void showInfo() {
        
        System.out.println(student);
        
    }
  
}
