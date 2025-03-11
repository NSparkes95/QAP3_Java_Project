/**
 * The Circle class represents a circle with a given radius.
 * It extends the abstract Shape class.
 * Author: Nicole Sparkes
 */

public class Circle extends Shape{
    private double radius; // the radius of the circle

    /**
     * Constructs a Circle object with a given radius.
     * @param radius The radius of the circle
     */
    public Circle(double radius){
        super("Circle"); // Call Shape constructor
        this.radius = radius;
    }

    /** @return The radius of the circle */
    public double getRadius(){
        return radius;
    }

    /** @param radius Sets the radius of the circle */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /** @return The computed area of the circle */
    @Override
    public double computeArea(){
        return Math.PI * radius * radius;
    }

    /** @return The computed perimeter (circumference) of the circle */
    @Override
    public double computePerimeter(){
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the Circle object.
     * @return A formatted string with the circle's details.
     */
    @Override
    public String toString(){
        return super.toString() + ", Radius: " + radius +
               ", Area: " + computeArea() +
               ", Perimeter: " + computePerimeter();
    }
}
