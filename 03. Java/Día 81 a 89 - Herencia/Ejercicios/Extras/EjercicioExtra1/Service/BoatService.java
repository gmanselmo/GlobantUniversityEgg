package Service;

import Entity.Boat;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo
 */

public abstract class BoatService {
    
    protected Scanner read = new Scanner(System.in);
    
    public abstract Boat getBoat();
    
    public abstract void createBoat();
    
    public abstract void showBoat();
    
    public abstract double returnModule();
    
}
