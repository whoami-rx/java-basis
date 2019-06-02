package part1.strings;

public class StringAPI {
    public static boolean contains(String s, String s1) {
        return s.contains(s1);
    }

    public static int indexOf(String s, String s1) {
        return s.indexOf(s1);
    }

    public static int lastIndexOf(String s, String s1) {
        return s.lastIndexOf(s1);
    }

    public static String toUpper(String s) {
        return s.toUpperCase();
    }

    // Test
    public static void main(String[] args) {
        System.out.println(contains("The text example", "text"));
        System.out.println(indexOf("The text example", "text"));
        System.out.println(lastIndexOf("The text example", "text"));
        System.out.println(toUpper("hello, world!"));
    }
}
