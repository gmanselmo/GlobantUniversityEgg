package Service;

import Entity.Boat;
import Entity.Motorboat;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public class MotorboatService extends BoatService {
    
    Motorboat motorboat;
    
    @Override
    public Boat getBoat() {
        
        return motorboat;
        
    }
    
    
    @Override
    public void createBoat() {
        
        System.out.println("Motorboat's plate:");
        
        String plate = read.nextLine();
        
        System.out.println("Motorboat's LOA:");
        
        double loa = read.nextDouble();
        
        read.nextLine();

        System.out.println("Motorboat's manufacturing date (YYYY-MM-DD):");
        
        LocalDate manufacturingDate = LocalDate.parse(read.nextLine());

        System.out.println("Motorboat's horsepower:");
        
        int hp = read.nextInt();
        
        read.nextLine();

        motorboat = new Motorboat(hp, plate, loa, manufacturingDate);
        
    }

    @Override
    public void showBoat() {
        
        System.out.println(motorboat.toString());
        
    }
    
    @Override
    public double returnModule() {
        
        return motorboat.getHorsePower() + (motorboat.getLoa() * 10);
        
    }
    
}
