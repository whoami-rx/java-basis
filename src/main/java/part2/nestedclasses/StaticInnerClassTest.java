package part2.nestedclasses;

public class StaticInnerClassTest {
    public static void main(String[] args) {
        StaticInnerClass myInvoice = new StaticInnerClass();
        StaticInnerClass.Item item = new StaticInnerClass.Item("Example", 10, 12.5);

        System.out.println(item);
    }
}
