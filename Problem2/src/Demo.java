public class Demo {
    public static void main(String[] args) {
        // Testing Point and MovablePoint
        Point p1 = new Point(3.0f, 4.0f);
        System.out.println("Point: " + p1);

        // Test the overloaded constructor
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println(mp1);

        // Test the move() method
        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);
    }
}
