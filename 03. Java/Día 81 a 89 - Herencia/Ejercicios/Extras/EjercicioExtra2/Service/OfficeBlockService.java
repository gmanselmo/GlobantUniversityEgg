package Service;

import Entity.OfficeBlock;

/**
 *
 * @author Germán M. Anselmo.
 */

public class OfficeBlockService extends BuildingService {
    
    OfficeBlock officeBlock;
    
    public void createOfficeBlock(int officesQuantity, int peoplePerOffice, int floors, double width, double height, double length) {
        
        officeBlock = new OfficeBlock(officesQuantity, peoplePerOffice, floors, width, height, length);
        
        System.out.println(officeBlock);
        
    }

    @Override
    public void surfaceAreaCalculator() {
        
        double surface = (officeBlock.getHeight() * officeBlock.getWidth()) * officeBlock.getFloors();
        
        System.out.println("Office Block Surface Area: " +  surface + ".");
        
    }

    @Override
    public void volumeCalculator() {
        
        double volume = officeBlock.getHeight() * officeBlock.getWidth() * officeBlock.getLength();
        
        System.out.println("Office Block Volume: " +  volume + ".");
        
    }

    public void maxOccupancy() {
        
        int perFloor = officeBlock.getOfficesQuantity() * officeBlock.getPeoplePerOffice();
        
        int perBlock = perFloor * officeBlock.getFloors();
        
        System.out.println("Floor Maximum Occupancy: " + perFloor + ".");
        
        System.out.println("Office Block Maximum Occupancy: " + perBlock + ".");
        
    }

}
