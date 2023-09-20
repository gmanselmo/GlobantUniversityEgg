package Service;

import Entity.Camping;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class CampingService extends AlternativeLodgingService {
    
    Camping camping;
    
    public void createLodging(int totalTents, int totalBaths, boolean hasRestaurant, boolean isPrivate, double m2, String name, String address, String localArea, String manager) {
        
        camping = new Camping(totalTents, totalBaths, hasRestaurant, isPrivate, m2, name, address, localArea, manager);
        
    }

    @Override
    public void showLodging() {
        
        System.out.println(camping);
        
    }
    
    public boolean hasRestaurant() {
        
        return camping.hasRestaurant();
        
    }

}
