package part1.operators;

public class BasicArithmetic {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int res(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if (b == 0) throw new ArithmeticException("Zero divition");
        return a / b;
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    // Test

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(res(10, 2));
        System.out.println(mul(3, 3));
        System.out.println(div(100, 5));
        System.out.println(pow(3, 5));
        System.out.println(sqrt(81));
    }
}
