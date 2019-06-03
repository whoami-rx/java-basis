package part2.classes;

public class EmployeeTest {
    public static void main(String[] args) {
        // Instance class: create object
        Employee e = new Employee(20000.0);
        // Set instance variable
        e.setName("RAR");
        // call toString method
        System.out.println(e);

        // New Object: different state
        Employee e1 = new Employee(15000.0);
        e1.setName("WORM");
        System.out.println(e1);
    }
}
