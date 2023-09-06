package Service;

import Entity.Appliances;
import Entity.TV;

/**
 *
 * @author Germán M. Anselmo
 */

public class TVService extends AppliancesService {
    
    TV tv;
    
    public void createTV(){
        
        boolean tdtBoolean = false;

        createAppliance();
        
        Appliances appStat = appliance;
  
        System.out.println("TV size (inches):");
             
        int inches = read.nextInt();
        
        read.nextLine();
        
        System.out.println("TDT Tuner? (y/n):");
        
        String tdt = read.nextLine();      
        
        if (tdt.equalsIgnoreCase("y")) {
            
            tdtBoolean = true;
            
        }
        
        tv = new TV(inches, tdtBoolean, appStat.getPrice(), appStat.getColor(), appStat.getPowerConsumption(), appStat.getWeight());
        
        appliance = tv;
        
        System.out.println(appliance.getPrice());
        
        finalPrice();
        
        System.out.println(tv);
                   
    }

    @Override
    public void finalPrice() {

        int inches = tv.getInches();
        
        boolean tdtTuner = tv.isTdtTuner();
        
        double weight = appliance.getWeight();
        
        String power = appliance.getPowerConsumption();

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
        
         if (inches > 40) {
            
            appliance.setPrice(appliance.getPrice() * 1.3);
            
        }
        
        if (tdtTuner) {
            
            appliance.setPrice(appliance.getPrice() + 500);
            
        }

    }
    
}
