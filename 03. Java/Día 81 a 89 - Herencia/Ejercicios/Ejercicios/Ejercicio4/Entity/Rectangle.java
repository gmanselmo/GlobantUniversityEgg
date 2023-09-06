package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Rectangle {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle() {
    }

    public Rectangle(double width, double height, double area, double perimeter) {
        this.width = width;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
    
}
