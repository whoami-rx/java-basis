package part1.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter your name: ");
        // nextLine() capt the spaces
        // if you need read simple word use next()
        // to read integer nextInt()
        // to read double nextDouble()
        name = in.nextLine();
        System.out.print("How old are you? ");
        age = in.nextInt();
        System.out.println("Hello " + name + "!");
    }
}
