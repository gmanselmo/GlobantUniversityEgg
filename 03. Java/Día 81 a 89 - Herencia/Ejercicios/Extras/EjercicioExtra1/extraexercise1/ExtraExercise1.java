package extraexercise1;

import Service.RentService;

/**
 *
 * @author Germán M. Anselmo
 */

public class ExtraExercise1 {


    
    public static void main(String[] args) {
        
        RentService rent = new RentService();
        
        rent.createRent();
        
        rent.showRentInfo();        
        
        rent.rentalPrice();
        
    }
    
}
