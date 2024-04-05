package com.tapaswi.shop;

import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.InventoryType;
import com.tapaswi.models.Shoe;

import java.util.List;


/**
 * A Shop having three inventories:
 * ElectronicsInventory, ShoeInventory, &amp; FurnitureInventory
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class Shop {

    /**
     * A private instance of electronics inventory
     * */
    private final ElectronicsInventory electronicsInventory;

    /**
     * A private instance of shoe inventory
     * */
    private final ShoeInventory shoeInventory;

    /**
     * A private instance of furniture inventory
     * */
    private final FurnitureInventory furnitureInventory;

    /**
     * A public constructor to initialize shop and all its inventories
     * */
    public Shop() {
        electronicsInventory = ElectronicsInventory.getInstance();
        shoeInventory = ShoeInventory.getInstance();
        furnitureInventory = FurnitureInventory.getInstance();
    }


//    ==================== For Factory Pattern ====================
    /**
     * Return an inventory based on the provided inventory type
     * @param inventoryType indicating the type of the inventory to be returned
     * @return An inventory based on the provided type; null if invalid type.
     * */
    public Inventory getInventory(InventoryType inventoryType){
        switch (inventoryType) {
            case ELECTRONICS:
                return electronicsInventory;
            case SHOES:
                return shoeInventory;
            case FURNITURE:
                return furnitureInventory;
        };
        return null;
    }
//    ==================== ==================== ===================



//    ===================== For Facade Pattern =====================
    // Functions for furniture inventory

    /**
     * Fetches all the items from the furniture inventory
     * @return All the Furniture object in the furniture inventory
     * */
    public List<Furniture> getAllFurnitureItems(){
        return furnitureInventory.getAllItems();
    }

    /**
     * Adds a new FurnitureItem to the inventory
     * @param item an FurnitureItem to be added to the inventory
     * @throws NullPointerException if the specified element is null
     * */
    public void addFurnitureItem(Furniture item){
        furnitureInventory.addItem(item);
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of FurnitureItem; null if not found.
     * */
    public Furniture getFurnitureItemById(int id){
        return furnitureInventory.getItemById(id);
    }

    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    public boolean deleteFurnitureItem(int id){
        return furnitureInventory.removeItem(id);
    }

    // Functions for Shoe inventory

    /**
     * Fetches all the items from the shoes inventory
     * @return All the Shoe objects the shoes inventory
     * */
    public List<Shoe> getAllShoeItems(){
        return shoeInventory.getAllItems();
    }

    /**
     * Adds a new Shoe to the inventory
     * @param item a Shoe to be added to the inventory
     * @throws NullPointerException if the specified element is null
     * */
    public void addShoeItem(Shoe item){
        shoeInventory.addItem(item);
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of Shoe; null if not found.
     * */
    public Shoe getShoeItemById(int id){
        return shoeInventory.getItemById(id);
    }

    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    public boolean deleteShoeItem(int id){
        return shoeInventory.removeItem(id);
    }

    // Functions for Electronic inventory

    /**
     * Fetches all the items from the electronics inventory
     * @return All the ElectronicItem objects in the electronics inventory
     * */
    public List<ElectronicItem> getAllElectronicItems(){
        return electronicsInventory.getAllItems();
    }

    /**
     * Adds a new ElectronicItem to the inventory
     * @param item an ElectronicItem to be added to the inventory
     * @throws NullPointerException if the specified element is null
     * */
    public void addElectronicItem(ElectronicItem item){
        electronicsInventory.addItem(item);
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of ElectronicItem; null if not found.
     * */
    public ElectronicItem getElectronicItemById(int id){
        return electronicsInventory.getItemById(id);
    }

    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    public boolean deleteElectronicItem(int id){
        return electronicsInventory.removeItem(id);
    }
//    ===================== ===================== ====================
}
