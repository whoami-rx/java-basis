package part2.nestedclasses;

import java.util.ArrayList;

public class StaticInnerClass {
    public static class Item {      // Nested class
        String description;
        int quantity;
        double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        double price() {
            return quantity * unitPrice;
        }

        @Override
        public String toString() {
            return description + ", " + quantity + ", " + unitPrice;
        }
    }
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

}
