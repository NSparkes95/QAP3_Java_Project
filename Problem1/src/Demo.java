public class Demo {
    public static void main(String[] args) {
        // creating Person object
        Person alex = new Person("Coach Alex", 34, "M");
        System.out.println(alex);

        // creating Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // creating Teacher object
        Teacher paul = new Teacher("Paul James", 34, "M", "Chemistry", 75000);
        System.out.println(paul);

        // creating CollegeStudent object
        CollegeStudent sean = new CollegeStudent("Sean", 18, "M", "UCB123", 4.0, 1, "English");
        System.out.println(sean);
    }
}
