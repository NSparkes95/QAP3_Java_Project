/**
 * The MovablePoint class extends Point by adding movement capability
 * with xSpeed and ySpeed.
 * Author: Nicole Sparkes
 */

public class MovablePoint extends Point{
    private float xSpeed = 0.0f; // Horizontal speed
    private float ySpeed = 0.0f; // Vertical speed

    /**
     * Default constructor initializes MovablePoint at (0,0) with no speed.
     */
    public MovablePoint() {
        super(); // Call superclass no-arg constructor
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    /**
     * Constructs a MovablePoint object with specified x, y, xSpeed, and ySpeed.
     * @param x X-coordinate
     * @param y Y-coordinate
     * @param xSpeed Speed in x direction
     * @param ySpeed Speed in y direction
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call superclass constructor with x, y
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /** @return X-axis speed */
    public float getXSpeed() {
        return xSpeed;
    }

    /** @return Y-axis speed */
    public float getYSpeed() {
        return ySpeed;
    }

    /** @param xSpeed Sets the X-axis speed */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /** @param ySpeed Sets the Y-axis speed */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Moves the point based on its speed.
     */
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    /**
     * Returns a string representation of the MovablePoint object.
     * @return A formatted string with position and speed details.
     */
    @Override
    public String toString() {
        return super.toString() + ", Speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}
