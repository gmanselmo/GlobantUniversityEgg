package extraexercise2;

import Service.BuildingService;
import Service.OfficeBlockService;
import Service.SportsComplexService;
import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo.
 */

public class ExtraExercise2 {

    public static void main(String[] args) {
        
        ArrayList<BuildingService> buildings = new ArrayList();
        
        int roofedQuantity = 0;
        
        SportsComplexService sportsComplex1 = new SportsComplexService();
        
        SportsComplexService sportsComplex2 = new SportsComplexService();
        
        OfficeBlockService officeBlock1 = new OfficeBlockService();
        
        OfficeBlockService officeBlock2= new OfficeBlockService();
        
        sportsComplex1.createSportComplex(true, 40, 30, 20);
        
        sportsComplex2.createSportComplex(false, 20, 10, 200);
        
        officeBlock1.createOfficeBlock(7, 20, 9, 40, 60, 70);
        
        officeBlock2.createOfficeBlock(3, 7, 4, 20, 10, 30);
        
        buildings.add(sportsComplex1);
        
        buildings.add(sportsComplex2);
        
        buildings.add(officeBlock1);
        
        buildings.add(officeBlock2);
         
        for (BuildingService building : buildings) {
            
            System.out.println("-----------------------------------------------------");

            building.surfaceAreaCalculator();
            
            building.volumeCalculator();
            
            if (building instanceof SportsComplexService) {
                
                if (((SportsComplexService) building).isRoofed()) {
                    
                    roofedQuantity++;
                    
                }
   
            } else  if (building instanceof OfficeBlockService) {
                
                ((OfficeBlockService) building).maxOccupancy();
                
            }
            
        }
        
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Total roofed Sports Complexs: " + roofedQuantity + ".");
        
    }

}
