package Service;

import Entity.Boat;
import Entity.Yacht;
import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public class YachtService extends BoatService {
    
    Yacht yacht;
    
    @Override
    public Boat getBoat() {
        
        return yacht;
        
    }
    
    @Override
    public void createBoat() {
        
        System.out.println("Yacht's plate:");
        
        String plate = read.nextLine();
        
        System.out.println("Yacht's LOA:");
        
        double loa = read.nextDouble();
        
        read.nextLine();

        System.out.println("Yacht's manufacturing date (YYYY-MM-DD):");
        
        LocalDate manufacturingDate = LocalDate.parse(read.nextLine());

        System.out.println("Yacht's horsepower:");
        
        int hp = read.nextInt();
        
        System.out.println("Yacht's cabin quantity:");
        
        int cabins = read.nextInt();
        
        read.nextLine();

        yacht = new Yacht(hp, cabins, plate, loa, manufacturingDate);
        
    }

    @Override
    public void showBoat() {
        
        System.out.println(yacht.toString());
        
    }
    
    @Override
    public double returnModule() {
        
        return yacht.getHorsePower() + yacht.getCabinQuantity() + (yacht.getLoa() * 10);
        
    }
    
}
