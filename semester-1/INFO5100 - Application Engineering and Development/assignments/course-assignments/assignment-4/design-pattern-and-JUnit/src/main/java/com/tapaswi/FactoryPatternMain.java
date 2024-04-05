package com.tapaswi;

import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.InventoryType;
import com.tapaswi.models.Shoe;
import com.tapaswi.shop.Inventory;
import com.tapaswi.shop.Shop;

/**
 * A main class with the implementation of facade pattern
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class FactoryPatternMain {

    /**
     * A main method called by operating system to execute the program
     * @param args command line arguments provided at the time of execution
     * */
    public static void main(String[] args) {
        /**
         * An instance of shop containing all the repositories
         * */
        Shop shop = new Shop();

        // Fetching inventories based on [InventoryType]
        Inventory<ElectronicItem> electronicsInventory = shop.getInventory(InventoryType.ELECTRONICS);
        Inventory<Furniture> furnitureInventory = shop.getInventory(InventoryType.FURNITURE);
        Inventory<Shoe> shoesInventory = shop.getInventory(InventoryType.SHOES);

        // ================ Electronics Inventory ================
        // Display all items
        electronicsInventory.addItem(new ElectronicItem(1, "iPhone 15", 1000));
        electronicsInventory.addItem(new ElectronicItem(2, "Samsung Galaxy", 800));
        electronicsInventory.addItem(new ElectronicItem(3, "Sony 4K TV", 3000));
        electronicsInventory.addItem(new ElectronicItem(4, "Samsung 8K OLED TV", 3000));

        // Display all items
        inventorySeparator("Electronics Inventory");
        inventoryModuleSeparator("All the Electronics Items");
        for (ElectronicItem item : electronicsInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);

        // Display by id
        inventoryModuleSeparator("Fetching Electronic Item by ID=2");
        System.out.println(electronicsInventory.getItemById(2));
        inventoryModuleSeparator(null);

        // Deletion
        inventoryModuleSeparator("Deleting Two Electronic Items");
        electronicsInventory.removeItem(1);
        electronicsInventory.removeItem(2);
        System.out.println("------------- Electronics Inventory after Deletion");
        for (ElectronicItem item : electronicsInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);
        inventorySeparator(null);



        // ================ Shoes Inventory ================
        // Addition
        shoesInventory.addItem(new Shoe(1, "Nike", 500));
        shoesInventory.addItem(new Shoe(2, "Adidas", 400));
        shoesInventory.addItem(new Shoe(3, "Asics", 600));
        shoesInventory.addItem(new Shoe(4, "Reebok", 100));

        // Display all items
        inventorySeparator("Shoes Inventory");
        inventoryModuleSeparator("All the Shoes");
        for (Shoe item : shoesInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);

        // Display by id
        inventoryModuleSeparator("Fetching Shoe by ID=2");
        System.out.println(shoesInventory.getItemById(2));
        inventoryModuleSeparator(null);

        // Deletion
        inventoryModuleSeparator("Deleting Two Shoes");
        shoesInventory.removeItem(1);
        shoesInventory.removeItem(2);
        System.out.println("------------- Shoes Inventory after Deletion");
        for (Shoe item : shoesInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);
        inventorySeparator(null);



        // ================ Furniture Inventory ================

        // Addition
        furnitureInventory.addItem(new Furniture(1, "King Size Bed", 750));
        furnitureInventory.addItem(new Furniture(2, "Dinning Table", 330));
        furnitureInventory.addItem(new Furniture(3, "Closet", 150));
        furnitureInventory.addItem(new Furniture(4, "TV - Cabinet", 50));

        inventorySeparator("Furniture Inventory");
        inventoryModuleSeparator("All the Furniture Items");
        // Display all items
        for (Furniture item : furnitureInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);

        // Display by id
        inventoryModuleSeparator("Fetching Furniture Item by ID=2");
        System.out.println(furnitureInventory.getItemById(2));
        inventoryModuleSeparator(null);

        // Deletion
        inventoryModuleSeparator("Deleting Two Furniture Items");
        furnitureInventory.removeItem(1);
        furnitureInventory.removeItem(2);
        System.out.println("------------- Furniture Inventory after Deletion");
        for (Furniture item : furnitureInventory.getAllItems()) {
            System.out.println(item);
        }
        inventoryModuleSeparator(null);
        inventorySeparator(null);

    }

    /**
     * A method to print the "=" sign before and after operation of an inventory.
     * @param name name of the inventory whose operations are performed.
     * */
    private static void inventorySeparator(String name){
        if(name == null)
            for (int i = 0; i < 100; i++)
                System.out.print(i == 99 ? "=\n" : "=");
        else{
            for (int i = 0; i < 40; i++) {
                System.out.print("=");
            }
            System.out.print(" "+name+" ");
            for (int i = 0; i < 40; i++) {
                System.out.print(i == 39 ? "=\n\n" : "=");
            }
        }
    }

    /**
     * A method to print the "-" sign before and after operation of an inventory functionality.
     * @param name name of the inventory functionality.
     * */
    private static void inventoryModuleSeparator(String name){
        if(name == null)
            for (int i = 0; i < 60; i++)
                System.out.print(i == 59 ? "-\n\n": "-");
        else{
            for (int i = 0; i < 15; i++) {
                System.out.print("-");
            }
            System.out.print(" "+name+" ");
            for (int i = 0; i < 15; i++) {
                System.out.print(i == 14 ? "-\n": "-");
            }
        }
    }
}
