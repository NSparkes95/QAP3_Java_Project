/**
 * The Teacher class represents a teacher with a name, age, gender,
 * subject specialization, and salary.
 * It extends the Person class.
 * Author: Nicole Sparkes
 */

public class Teacher extends Person{
    private String subject; // subject specialization
    private double salary; // salary

    /**
     * Constructs a Teacher object with the specified details.
     * @param name    The teacher's name
     * @param age     The teacher's age
     * @param gender  The teacher's gender ("M" or "F")
     * @param subject The subject the teacher teaches
     * @param salary  The teacher's salary
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age,gender); // call the superclass constructor
        this.subject = subject;
        this.salary = salary;
    }

    /** @return The teacher's subject */
    public String getSubject() {
        return subject;
    }

    /** @param subject Sets the teacher's subject */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /** @return The teacher's salary */
    public double getSalary() {
        return salary;
    }

    /** @param salary Sets the teacher's salary */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
    * Returns a string representation of the Teacher object.
    * @return A formatted string with teacher details.
    */
    @Override
    public String toString() {
        return super.toString() + " Subject: " + subject + ", Salary: " + salary;
    }
}
