/**
 * The Point class represents a point in a 2D space with x and y coordinates.
 * Author: Nicole Sparkes
 */

public class Point {
    private float x; // x-coordinate
    private float y; // y-coordinate

    /**
     * Default constructor initializes point at (0,0).
     */
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    /**
     * Constructor initializes point at (x,y).
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /** @return X-coordinate */
    public float getX() {
        return x;
    }

    /** @param x Sets the X-coordinate */
    public void setX(float x) {
        this.x = x;
    }

    /** @return Y-coordinate */
    public float getY() {
        return y;
    }

    /** @param y Sets the Y-coordinate */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Returns a string representation of the Point object.
     * @return A formatted string with x and y values.
    */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
