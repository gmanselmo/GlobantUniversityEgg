package Service;

import Entity.Residence;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class ResidenceService extends AlternativeLodgingService {
    
    Residence residence;
    
    public void createLodging(int totalRooms, boolean hasDiscount, boolean hasSportField, boolean isPrivate, double m2, String name, String address, String localArea, String manager) {
        
        residence = new Residence(totalRooms, hasDiscount, hasSportField, isPrivate, m2, name, address, localArea, manager);
        
    }

    @Override
    public void showLodging() {
        
        System.out.println(residence);
        
    } 
    
    public boolean hasDiscount() {
        
        return residence.hasDiscount();
        
    }

}
