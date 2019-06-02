package part1.strings;

/**
 * A String is a sequence of caracters.
 * Contains any Unicode Char.
 */
public class Strings {
    // A string declaration
    private String name;
    /**
     * Concatenation
     * @param name A string containing name
     * @return a greeting text
     */
    public static String greeting(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Comparation
     * @param s1 first string
     * @param s2 second string
     * @return true if params are equal. Otherwise, false.
     */
    public static boolean equals(String s1, String s2) {
        return s1.equals(s2);  // Never use == to compare Strings
                               // == compare if are same object
    }

    /**
     * To test if a string refer a null pointer should use ==
     * Note that null is not the same an empty string ""
     * @param s string to check if is null
     * @return true if s is null. Otherwise, false
     */
    public static boolean isNull(String s) {
        return s == null;
    }

    /**
     * Primitives have defined method toString.
     * @param i number to convert into string
     * @return a string representation of i
     */
    public static String intToStr(int i) {
        // Same: "" + i
        return Integer.toString(i);
    }

}
