package part1.operators;

public class LogicAndComp {
    /**
     * @param a first number
     * @param b second number
     * @return max of two numbers
     */
    public static int max(int a, int b) {
        // return (a > b) ? a : b;
        if (a > b) return a;
        return b;
    }

    /**
     *
     * @param a firs number to compare
     * @param b second number to compare
     * @return true if a and b are equal. Otherwise false.
     */
    public static boolean equal(int a, int b) {
        return a == b;
    }

    /**
     * @param a first number
     * @param b second number
     * @return min of two numbers
     */
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    /**
     *
     * @param a number to check if is great or equal
     * @param b number that compara
     * @return true if a >= b. Otherwise false.
     */
    public static boolean greatOrEqual(int a, int b) {
        return a >= b;
    }

    public static boolean lessOrEqueal(int a, int b) {
        return a <= b;
    }

    /**
     * @param a first boolean
     * @param b second boolean
     * @return true if all params are true. Otherwise, false.
     */
    public static boolean all(boolean a, boolean b) {
        return a && b;
    }

    /**
     * @param a
     * @param b
     * @return true if any of params is true. Otherwise, false.
     */
    public static boolean any(boolean a, boolean b) {
        return a || b;
    }

    // TEST
    public static void main(String[] args) {
        System.out.println(all(true, false));
        System.out.println(all(true, true));
        System.out.println(all(false, false));
        System.out.println(any(true, false));
        System.out.println(any(false, true));
        System.out.println(any(false, false));
    }
}
