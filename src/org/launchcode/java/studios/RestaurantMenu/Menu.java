package org.launchcode.java.studios.RestaurantMenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //String name;
        ArrayList fullMenu;
        String lastUpdated;
        restart();
    }

    public static void restart() {
        Scanner input;
        String phrase;
        Integer choice;

        input = new Scanner(System.in);
        System.out.println("Please select an option\n" +
                "0: Edit Menu Date\n" +
                "1: View Menu Items\n" +
                "2: Add Menu Item");
        choice = input.nextInt();
        switch (choice) {
            case 0:
                editMenu();
                break;
            case 1:
                viewMenu();
                break;
            case 2:
                addItem();
                break;
            default:
                restart();
        }
        input.close();
    }

    public static void editMenu() {

    }

    public static void viewMenu() {
    }

    public static void addItem() {
    }

}

