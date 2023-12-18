import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        System.out.println("The total price is: " + totalPrice + " kr.");
        return totalPrice;
    }

    public ArrayList<Item> getItems() {
        System.out.println(itemList);
        return itemList;
    }

}
