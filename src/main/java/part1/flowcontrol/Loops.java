package part1.flowcontrol;

public class Loops {
    /**
     * for(initialization; condition; update) { body }
     * @param max number that stop loop
     */
    private static void printRangeFor(int max) {
        for (int i = 1; i < max; i++) {
            System.out.println(i);
        }
    }

    /**
     * while (expression) { body }
     * @param max number
     */
    private static void printRangeWhile(int max) {
        int start = 1;
        while (start < max) {
            System.out.println(start);
            start++;
        }
    }

    // TEST
    public static void main(String[] args) {
        printRangeFor(5);
        System.out.println("===========");
        printRangeWhile(5);
    }

}
