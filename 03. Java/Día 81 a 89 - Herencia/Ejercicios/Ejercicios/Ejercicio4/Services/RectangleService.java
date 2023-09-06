package Services;

import Entity.Rectangle;
import Interfaces.ShapeCalculations;

/**
 *
 * @author Germán M. Anselmo
 */

public class RectangleService implements ShapeCalculations {
    
    Rectangle rectangle = new Rectangle();

    public RectangleService() {
    }
    
    public RectangleService(double width, double height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
    }

    @Override
    public void area() {
        
        rectangle.setArea(rectangle.getHeight() * rectangle.getWidth());
        
        System.out.println("Rectangle's area: " + rectangle.getArea() + ".");

    }

    @Override
    public void perimeter() {
        
        rectangle.setPerimeter(2 * (rectangle.getWidth() + rectangle.getHeight()));
        
        System.out.println("Rectangle´s perimeter: " + rectangle.getPerimeter() + ".");
        
    }
    
}
