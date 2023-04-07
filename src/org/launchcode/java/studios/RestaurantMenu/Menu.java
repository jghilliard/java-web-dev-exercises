package org.launchcode.java.studios.RestaurantMenu;

import java.awt.*;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
//    public static void main(String[] args) {
//        //String name;
       ArrayList <MenuItems> fullMenu = new ArrayList<MenuItems>();
       LocalDate lastUpdated = LocalDate.now();
//        String lastUpdated;
//        restart();
//    }

    public void addItem(MenuItems newItem){
        fullMenu.add(newItem);
        lastUpdated = LocalDate.now();
    }

    public void removeItem(MenuItems itemToRemove){
        fullMenu.remove(itemToRemove);
        lastUpdated = LocalDate.now();

    }
    public boolean isNew(MenuItems item){
        return item.getNew();
    }

    public LocalDate menuUpdated(){
        return lastUpdated;

    }

    public void menuPrinter(){

    }

    public void itemPrinter(MenuItems item){

    }

    public boolean itemCheck(MenuItems item1, MenuItems item2){
        return item1.isEqual(item2);
    }

//    public static void restart() {
//        Scanner input;
//        String phrase;
//        Integer choice;
//
//        input = new Scanner(System.in);
//        System.out.println("Please select an option\n" +
//                "0: Edit Menu Date\n" +
//                "1: View Menu Items\n" +
//                "2: Add Menu Item");
//        choice = input.nextInt();
//        switch (choice) {
//            case 0:
//                editMenu();
//                break;
//            case 1:
//                viewMenu();
//                break;
//            case 2:
//                addItem();
//                break;
//            default:
//                restart();
//        }
//        input.close();
//    }
//
//    public static void editMenu() {
//
//    }
//
//    public static void viewMenu() {
//    }
//
//    public static void addItem() {
//    }

}

