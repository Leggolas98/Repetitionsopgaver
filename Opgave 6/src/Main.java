public class Main {
    public static void main(String[] args) {

        ShoppingCart itemList = new ShoppingCart();

        Item Milk = new Item("Milk", 13.95);
        itemList.addItem(Milk);

        Item Coffee = new Item("Coffee", 70);
        itemList.addItem(Coffee);

        Item Cheerios = new Item("Cheerios", 49.95);
        itemList.addItem(Cheerios);

        Item Chocolate = new Item("Chocolate", 20);
        itemList.addItem(Chocolate);

        itemList.removeItem(Chocolate);

        itemList.getItems();

        itemList.getTotalPrice();
    }
}
