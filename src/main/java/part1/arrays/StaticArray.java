package part1.arrays;

import java.util.Arrays;

public class StaticArray {
    public static void main(String[] args) {
        // Define arrays
        String[] emptyStr = new String[10];   // 10 empty strings
        int[] emptyInt = new int[10];         // 10 empty ints

        // Initialize
        int[] nums = { 1, 2, 3, 4 };
        String[] strs = { "Hello", "world" };

        // Accessing
        System.out.println("First " + strs[0]);
        System.out.println("Last " + strs[strs.length - 1]);

        // Looping
        // With For
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

        // Foreach syntax
        for (String s : strs) System.out.println(s);
    }
}
