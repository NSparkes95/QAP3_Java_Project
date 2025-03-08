public class Demo {
    public static void main(String[] args) {
        // creating Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // creating Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // creating Teacher object
        Teacher paul = new Teacher("Paul James", 34, "M", "Computer Science", 50000);
        System.out.println(paul);
    }
}
