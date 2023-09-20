package Service;

import Entity.Person;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class PersonaService {
    
    Person person;
    
    public void marriageChange(Boolean isMarried) {
        
        person.setMarried(isMarried);        
        
    }
    
    public abstract void showInfo();
            
}
