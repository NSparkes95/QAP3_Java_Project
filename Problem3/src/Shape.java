/**
 * The abstract Shape class represents a geometric shape.
 * It includes a name and methods to compute area and perimeter.
 * Author: Nicole Sparkes
 */

public abstract class Shape {
    protected String name; // the name of the shape

    /**
     * Constructs a new Shape with the given name.
     * @param name the name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /** @return The name of the shape */
    public String getName() {
        return name;
    }

    /** @param name Sets the name of the shape */
    public void setName(String name) {
        this.name = name;
    }
    
    /** @return The computed area of the shape */
    public abstract double computeArea();

    /** @return The computed perimeter of the shape */
    public abstract double computePerimeter();

    /**
     * Returns a string representation of the Shape object.
     * @return A formatted string with the shape's name.
     */
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
