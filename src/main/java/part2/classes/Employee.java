package part2.classes;

/**
 * [access modifier] class name [extends] [implements] { body }
 */
public class Employee {
    private static int lastId = 0;           // class variable
    private int id;                          // instance variable
    private String name;
    private double salary;

    /**
     * Constructor
     * @param name employee
     * @param salary current salary
     */
    private Employee(String name, double salary) {
        lastId++;                   // generate new ID when create a new instance
        id = lastId;
        this.name = name;           // this: reference to self instance
        this.salary = salary;
    }

    // Overloading
    public  Employee(double salary) {
        this("", salary);      // Call other constructor
    }

    /**
     * Increment salary by percentage
     * @param byPercent factor %
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.salary + ", " + this.id;
    }

    // Getter: read only
    public String getName() {
        return name;
    }

    // Setter: mutator method
    public void setName(String name) {
        this.name = name;
    }
}
