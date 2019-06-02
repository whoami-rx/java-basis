package part1.arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        // Define
        ArrayList<String> names = new ArrayList<>();
        // Define and initialize
        // Note: cannot use primitive as type param.
        // Should use `wrapper class`. ex Integer, Byte, Float, Double
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3));

        // Add elements: add()
        for (int i = 0; i < 5; i++) names.add(Integer.toString(i));

        // Accessing
        System.out.println("FIRST: " + nums.get(0));

        // Looping
        for (String n: names) System.out.println(n);

        System.out.println("==========");

        for (int i: nums) System.out.println(i);

        // Copy
        ArrayList<Integer> nums2 = new ArrayList<>(nums);

        System.out.println(nums2);

    }
}
