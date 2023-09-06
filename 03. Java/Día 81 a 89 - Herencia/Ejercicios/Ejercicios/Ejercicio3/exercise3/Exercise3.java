package exercise3;

import Service.InventoryService;



/**
 *
 * @author Germán M. Anselmo
 */

public class Exercise3 {

    public static void main(String[] args) {

        InventoryService is = new InventoryService();
        
        is.batchLoad();

        is.showAppliances();
        
        is.inventoryWorth();
        
    }
    
}
