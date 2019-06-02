package part1.flowcontrol;

public class IfElse {
    public static boolean isEmail(String e) {
        if (e.contains("@") && e.contains(".")) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEmail("lorem"));
        System.out.println(isEmail("lorem@test.com"));
    }
}
