package org.launchcode.java.studios.RestaurantMenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu newMenu = new Menu();


        MenuItems item = new MenuItems();
        item.setName("Fresh Pasta");
        item.setDesc("Housemade Pasta served with a spicy tomato sauce.");
        item.setIsNew(true);
        item.setType("Main Course");
        item.setPrice(6.99);
        newMenu.addItem(item);

        MenuItems item1 = new MenuItems();
        item1.setName("Bread");
        item1.setDesc("It's bread.");
        item1.setIsNew(false);
        item1.setType("Main Course");
        item1.setPrice(2.99);
        newMenu.addItem(item1);

        MenuItems item2 = new MenuItems();
        item2.setName("Chocolate Cake");
        item2.setDesc("Some cake we found in the back of the freezer.");
        item2.setIsNew(false);
        item2.setType("Dessert");
        item2.setPrice(0.99);
        newMenu.addItem(item2);


        newMenu.itemPrinter(item);
        newMenu.itemPrinter(item1);
        newMenu.itemPrinter(item2);

    }
}
