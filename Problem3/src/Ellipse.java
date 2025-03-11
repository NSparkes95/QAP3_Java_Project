/**
 * The Ellipse class represents an ellipse with a major and minor axis.
 * It extends the abstract Shape class.
 * Author: Nicole Sparkes
 */

public class Ellipse extends Shape{
    private double majorAxis; // The major axis of the ellipse
    private double minorAxis; // The minor axis of the ellipse

    /**
     * Constructs an Ellipse object ensuring majorAxis >= minorAxis.
     * @param a First axis value
     * @param b Second axis value
     */
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a >= b) {
            majorAxis = a;
            minorAxis = b;
        } else {
            majorAxis = b;
            minorAxis = a;
        }
    }

    /** @return The computed area of the ellipse */
    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    /** @return The computed perimeter (approximate) of the ellipse */
    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - 
               Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    /**
     * Returns a string representation of the Ellipse object.
     * @return A formatted string with ellipse details.
     */
    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis +
               ", Minor Axis: " + minorAxis +
               ", Area: " + computeArea() +
               ", Perimeter: " + computePerimeter();
    }
}
