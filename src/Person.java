// Author: Nicole Sparkes
/**
 * The Person class represents a person with a name, age, and gender.
 * It serves as a superclass for other classes like Student and Teacher.
 */
public class Person {
    protected String myName; // name of the person
    protected int myAge; // person's age
    protected String myGender; // "M" for male, "F" for female

    /**
     * Constructs a Person object with the specified name, age, and gender.
     * @param name  The person's name
     * @param age   The person's age
     * @param gender The person's gender ("M" or "F")
     */
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    /** @return The persons name */
    public String getName() {
        return myName;
    }

    /** @param name Sets the person's name */
    public void setName(String name) {
        this.myName = name;
    }

    /** @return The person's age */
    public int getAge() {
        return myAge;
    }

    /** @param age Sets the person's age  */
    public void setAge(int age) {
        this.myAge = age;
    }

    /** @return The person's gender */
    public String getGender() {
        return myGender;
    }

    /** @param gender Sets the person's gender */
    public void setGender(String gender) {
        this.myGender = gender;
    }

     /**
     * Returns a string representation of the Person object.
     * @return A formatted string with the person's details.
     */
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}