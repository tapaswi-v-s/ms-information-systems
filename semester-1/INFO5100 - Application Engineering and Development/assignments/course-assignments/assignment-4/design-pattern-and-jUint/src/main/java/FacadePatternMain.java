import models.ElectronicItem;
import models.Furniture;
import models.Shoe;
import shop.Shop;

/**
 * A main class with the implementation of facade pattern
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class FacadePatternMain {

    /**
     * A main method called by operating system to execute the program
     * @param args command line arguments provided at the time of execution
    * */
    public static void main(String[] args) {
        /**
         * An instance of shop containing all the repositories
         * */
        Shop shop = new Shop();

        // ================ Electronics Inventory ================
        // Display all items
        shop.addElectronicItem(new ElectronicItem(1, "Nokia 6500", 1000));
        shop.addElectronicItem(new ElectronicItem(2, "Oppo s190", 200));
        shop.addElectronicItem(new ElectronicItem(3, "Vivo t478", 1000));
        shop.addElectronicItem(new ElectronicItem(4, "LG Ultra TV", 3000));

        // Display all items
        inventorySeparator("Electronics Inventory");
        inventoryFunctionalitySeparator("All the Electronics Items");
        for (ElectronicItem item : shop.getAllElectronicItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);

        // Display by id
        inventoryFunctionalitySeparator("Fetching Electronic Item by ID=2");
        System.out.println(shop.getElectronicItemById(2));
        inventoryFunctionalitySeparator(null);

        // Deletion
        inventoryFunctionalitySeparator("Deleting Two Electronic Items");
        shop.deleteElectronicItem(1);
        shop.deleteElectronicItem(2);
        System.out.println("------------- Electronics Inventory after Deletion");
        for (ElectronicItem item : shop.getAllElectronicItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);
        inventorySeparator(null);
        

        // ================ Furnitures Inventory ================
        // Display all items
        shop.addFurnitureItem(new Furniture(1, "Chairs", 30));
        shop.addFurnitureItem(new Furniture(2, "Recliner Couch", 500));
        shop.addFurnitureItem(new Furniture(3, "Coffee Table", 100));
        shop.addFurnitureItem(new Furniture(4, "Book Shelf", 300));

        // Display all items
        inventorySeparator("Furniture Inventory");
        inventoryFunctionalitySeparator("All the Furniture Items");
        for (Furniture item : shop.getAllFurnitureItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);

        // Display by id
        inventoryFunctionalitySeparator("Fetching Furniture Item by ID=2");
        System.out.println(shop.getFurnitureItemById(2));
        inventoryFunctionalitySeparator(null);

        // Deletion
        inventoryFunctionalitySeparator("Deleting Two Furniture Items");
        shop.deleteFurnitureItem(1);
        shop.deleteFurnitureItem(2);
        System.out.println("------------- Furniture Inventory after Deletion");
        for (Furniture item : shop.getAllFurnitureItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);
        inventorySeparator(null);
        

        // ================ Shoes Inventory ================
        // Display all items
        shop.addShoeItem(new Shoe(1, "Fila", 120));
        shop.addShoeItem(new Shoe(2, "New Balance", 200));
        shop.addShoeItem(new Shoe(3, "Sketchers", 330));
        shop.addShoeItem(new Shoe(4, "Crocs", 100));

        // Display all items
        inventorySeparator("Shoes Inventory");
        inventoryFunctionalitySeparator("All the Shoes");
        for (Shoe item : shop.getAllShoeItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);

        // Display by id
        inventoryFunctionalitySeparator("Fetching Shoe by ID=2");
        System.out.println(shop.getShoeItemById(2));
        inventoryFunctionalitySeparator(null);

        // Deletion
        inventoryFunctionalitySeparator("Deleting Two Shoes");
        shop.deleteShoeItem(1);
        shop.deleteShoeItem(2);
        System.out.println("------------- Shoes Inventory after Deletion");
        for (Shoe item : shop.getAllShoeItems()) {
            System.out.println(item);
        }
        inventoryFunctionalitySeparator(null);
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
    private static void inventoryFunctionalitySeparator(String name){
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
