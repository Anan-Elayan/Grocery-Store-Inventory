/*
* 1211529 > Anan Elayan > Section 3
* */

public class InventoryDriver {
    public static void main(String[] args) {

        Inventory store = new Inventory("groceries");

        store.newItem("bread", 15, 9.99);//add new item on store with type
        store.newItem("al-jebrini", "milk", 2, 2.00);//add new item on store with type and brand
        store.newItem("eggs", 3, 1.50);//add new item on store with type
        store.newItem("bread", 2, 1.25);//add new item on store with type

        store.stockReport();//method print

        store.update("al-jebrini", "milk", .25); // raise price 25%
        store.update("eggs", -1); // lower quantity by 1
        store.update("juice", 3); // warning: not stocked
        store.newItem("juneidi", "milk", 4, 1.95);

        store.stockReport();

        store.setPrice("cola", 10); // warning: not stocked
        store.setQuantity("al-jebrini", "milk", 3);
        store.setPrice("eggs", 2.00);

        System.out.println("milk quantity: " + store.getQuantity("alsafi", "milk")); // not stocked
        System.out.println("milk quantity: " + store.getQuantity("milk"));// ambiguity
        System.out.println("eggs price: " + store.getPrice("eggs"));
        System.out.println("milk price: " + store.getPrice("milk")); //ambiguity
        System.out.println((new Item("cola").setPrice(5)).compareTo(new Item("milk").setPrice(8)));

    }

}
