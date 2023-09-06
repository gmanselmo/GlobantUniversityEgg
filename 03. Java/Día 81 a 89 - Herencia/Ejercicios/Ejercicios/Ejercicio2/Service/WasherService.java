package Service;

import Entity.Appliances;
import Entity.Washer;

/**
 *
 * @author Germán M. Anselmo
 */

public final class WasherService extends AppliancesService {
    
    Washer washer;

    public void createWasher(){

        createAppliance();
        
        Appliances appStat = appliance;
  
        System.out.println("Washer's capacity: (7,5)");
       
        double capacity = read.nextDouble();
        
        washer = new Washer(capacity, appStat.getPrice(), appStat.getColor(), appStat.getPowerConsumption(), appStat.getWeight());
        
        appliance = washer;
        
        finalPrice();
        
        System.out.println(washer);
                   
    }
    
    @Override
    public void finalPrice() {

        String power = appliance.getPowerConsumption();

        double weight = appliance.getWeight();
        
        double capacity = washer.getCapacity();

        switch (power) {
            
            case "A":
                appliance.setPrice(appliance.getPrice() + 1000);
                break;
                
            case "B":
                appliance.setPrice(appliance.getPrice() + 800);
                break;
                
            case "C":
                appliance.setPrice(appliance.getPrice() + 600);
                break;
                
            case "D":
                appliance.setPrice(appliance.getPrice() + 500);
                break;
                
            case "E":
                appliance.setPrice(appliance.getPrice() + 300);
                break;
                
            case "F":
                appliance.setPrice(appliance.getPrice() + 100);
                break;
                
            default:
                break;
                
        }
        
        if (weight <= 19) {
            
            appliance.setPrice(appliance.getPrice() + 100);
            
        } else if ((weight >= 20) && (weight <= 49)) {
            
            appliance.setPrice(appliance.getPrice() + 500);
            
        } else if ((weight >= 50) && (weight <= 79)) {
            
            appliance.setPrice(appliance.getPrice() + 800);
            
        } else if (weight >= 80) {
            
            appliance.setPrice(appliance.getPrice() + 1000);
            
        }
        
        if (capacity > 30) {
            
            appliance.setPrice(appliance.getPrice() + 500);
            
        }

    }
    
}
