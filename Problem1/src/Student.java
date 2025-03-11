/**
 * The Student class extends Person and adds attributes related to students,
 * such as student ID and GPA.
 * Author: Nicole Sparkes
 */

public class Student extends Person{
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    /** 
     * Constructs a Student object with the specified details.
     * @param name   The student's name
     * @param age    The student's age
     * @param gender The student's gender ("M" or "F")
     * @param idNum  The student's ID number
     * @param gpa    The student's GPA
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // call superclass constructor
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    /** @return The student's ID number */
    public String getIdNum() {
        return myIdNum;
    }

    /** @param idNum Sets the student's ID number */
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    /** @return The student's GPA */
    public double getGPA() {
        return myGPA;
    }

    /** @param gpa Sets the student's GPA */
    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    /**
     * Returns a string representation of the Student object.
     * @return A formatted string with student details.
     */
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
