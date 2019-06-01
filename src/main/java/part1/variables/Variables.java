package part1.variables;

/**
 * Java have three categories of variables:
 * 1. Class Variables
 * 2. Instance Variables
 * 3. Local Variables
 */
public class Variables {
    public static int counter = 0;  // Class variable
    public char category = 'A';     // Instance variable

    public static void greeting(String name) {
        // name is considered local variable
        System.out.println("Hello " + name);
    }
}
