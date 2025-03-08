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
}
