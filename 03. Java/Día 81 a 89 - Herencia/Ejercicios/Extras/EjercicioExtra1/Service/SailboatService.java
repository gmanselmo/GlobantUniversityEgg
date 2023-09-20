package Service;

import Entity.Boat;
import Entity.Sailboat;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public final class SailboatService extends BoatService {
    
    public Sailboat sailboat;

    @Override
    public Boat getBoat() {
        
        return sailboat;
        
    }

    @Override
    public void createBoat() {
        
        System.out.println("Sailboat's plate:");
        
        String plate = read.nextLine();
        
        System.out.println("Sailboat's LOA:");
        
        double loa = read.nextDouble();
        
        read.nextLine();
        
        System.out.println("Sailboat's manufacturing date (YYYY-MM-DD):");
        
        LocalDate manufacturingDate = LocalDate.parse(read.nextLine());

        System.out.println("Sailboat's masts quantity:");
        
        int masts = read.nextInt();
        
        read.nextLine();

        sailboat = new Sailboat(masts, plate, loa, manufacturingDate);
        
    }

    @Override
    public void showBoat() {
        System.out.println(sailboat);
    }

    @Override
    public double returnModule() {
        
        return sailboat.getMast() + (sailboat.getLoa() * 10);
        
    }

}
