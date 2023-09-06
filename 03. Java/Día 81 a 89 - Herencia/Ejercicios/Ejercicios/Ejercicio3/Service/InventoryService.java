package Service;

import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */

public class InventoryService {
    
    ArrayList<AppliancesService> appliances = new ArrayList();
   
    public void batchLoad() {

         for (int i = 0; i < 2; i++) {
             
            WasherService ws = new WasherService();

            ws.createWasher();

            TVService ts = new TVService();

            ts.createTV();

            appliances.add(ws);

            appliances.add(ts);
            
        }

    }
    
    public void showAppliances() {
        
        System.out.println("INVENTORY:");
        
        for (AppliancesService appliance : appliances) {
            
            System.out.println(appliance.appliance);
            
        }
        
    }
    
    public void inventoryWorth() {
        
        double total = 0;
        
        double totalWashers = 0;
        
        double totalTvs = 0;
        
        for (AppliancesService appliance : appliances) {
            
            total += appliance.appliance.getPrice();
            
            if (appliance instanceof WasherService) {
                
                totalWashers += appliance.appliance.getPrice();
                
            } else if (appliance instanceof TVService) {
                
                totalTvs += appliance.appliance.getPrice();                
                
            }
            
//            FORMA ÚTIL SIN USAR INSTANCE OF.                                          //
//
//            if (appliance.appliance.toString().contains("capacity")) {                //
//                
//                totalWashers += appliance.appliance.getPrice();                       //
//                
//            } else if  (appliance.appliance.toString().contains("tdtTuner")) {    //
//                
//                totalTvs += appliance.appliance.getPrice();                              //
//                  
//            }                                                                                                    //
            
        }
        
        System.out.println("APPLIANCES $$$: " + total + ".");
        
        System.out.println("WASHERS $$$: " + totalWashers + ".");
        
        System.out.println("TVS $$$: " + totalTvs + ".");
  
    }

}
