package Services;

import Entity.Circle;
import Interfaces.ShapeCalculations;

/**
 *
 * @author Germán M. Anselmo
 */

public class CircleService implements ShapeCalculations {
    
    Circle circle = new Circle();

    public CircleService() {
    }
    
    public CircleService(double radius) {
        circle.setRadius(radius);
    }
    
    @Override
    public void area() {
        
        circle.setArea(ShapeCalculations.PI * (Math.pow(circle.getRadius(), 2)));
        
        System.out.println("Circle's area: " + circle.getArea() + ".");

    }

    @Override
    public void perimeter() {
        
        circle.setPerimeter(2 * ShapeCalculations.PI * circle.getRadius());
        
        System.out.println("Circle´s perimeter: " + circle.getPerimeter() + ".");
        
    }
    
}
