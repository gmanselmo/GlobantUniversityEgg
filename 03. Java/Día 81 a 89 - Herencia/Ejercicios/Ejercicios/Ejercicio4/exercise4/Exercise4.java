package exercise4;

import Services.CircleService;
import Services.RectangleService;

/**
 *
 * @author Germán M. Anselmo
 */

public class Exercise4 {

    public static void main(String[] args) {
        
        CircleService circle = new CircleService(14.6);
        
        circle.area();
        
        circle.perimeter();

        RectangleService rectangle = new RectangleService(10, 5);
        
        rectangle.area();
        
        rectangle.perimeter();
        
    }
    
}
