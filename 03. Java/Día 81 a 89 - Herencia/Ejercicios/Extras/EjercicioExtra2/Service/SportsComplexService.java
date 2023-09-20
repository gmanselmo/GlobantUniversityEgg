package Service;

import Entity.SportsComplex;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class SportsComplexService extends BuildingService {
    
    SportsComplex sportsComplex;
    
    public void createSportComplex(boolean isRoofed, double width, double height, double length) {
        
        sportsComplex = new SportsComplex(isRoofed, width, height, length);
        
        System.out.println(sportsComplex);
        
    }

    @Override
    public void surfaceAreaCalculator() {
        
        double surface;

        if (sportsComplex.isRoofed()) {
            
            surface = (sportsComplex.getHeight() * sportsComplex.getWidth()) * 2;
            
            
        } else {
        
            surface = sportsComplex.getHeight() * sportsComplex.getWidth();
            
        }
        
        System.out.println("Sports Complex Surface Area: " +  surface + ".");
        
    }

    @Override
    public void volumeCalculator() {
        
        double volume = sportsComplex.getHeight() * sportsComplex.getWidth() * sportsComplex.getLength();
        
        System.out.println("Sports Complex Volume: " +  volume + ".");
        
    }
    
    public boolean isRoofed() {
        
        return sportsComplex.isRoofed();
        
    }
    
}
