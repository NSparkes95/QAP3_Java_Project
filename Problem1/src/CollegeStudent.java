/**
 * The CollegeStudent class represents a college student with a major and year level.
 * It extends the Student class.
 * Author: Nicole Sparkes
 */

public class CollegeStudent extends Student{
    private String major; // The student's major
    private int year; // The student's year level

    /**
     * Constructs a CollegeStudent object with the specified details.
     * @param name   The student's name
     * @param age    The student's age
     * @param gender The student's gender ("M" or "F")
     * @param idNum  The student's ID number
     * @param gpa    The student's GPA
     * @param year   The student's year in college (1 = Frosh, 2 = Soph, etc.)
     * @param major  The student's major
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call the superclass constructor
        this.year = year;
        this.major = major;
    }

    //** @return The student's major */
    public String getMajor() {
        return major;
    }

    /** @param major Sets the student's major */
    public void setMajor(String major) {
        this.major = major;
    }
    
    /** @return The student's year in college */
    public int getYear() {
        return year;
    }

    /** @param year Sets the student's year in college */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a string representation of the CollegeStudent object.
     * @return A formatted string with college student details.
     */
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
