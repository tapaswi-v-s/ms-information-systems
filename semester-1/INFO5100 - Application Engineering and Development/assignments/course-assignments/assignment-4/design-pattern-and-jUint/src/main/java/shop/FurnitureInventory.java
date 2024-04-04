package shop;

import data.DataHolder;
import models.Furniture;


import java.util.List;

/**
 * An Inventory for furniture items of the shop of type Furniture
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class FurnitureInventory implements Inventory<Furniture> {

    /**
     * A private instance variable which will
     * making sure to create only a single object.
     * */
    private static FurnitureInventory single_instance = null;

    /**
     * To create only a single object throughout the execution.
     * @return instance of this class
     * */
    public static synchronized FurnitureInventory getInstance(){
        if (single_instance == null)
            single_instance = new FurnitureInventory();

        return single_instance;
    }

    /**
     * Fetches all the items in this inventory
     * @return All the Furniture items in this inventory
     * */
    @Override
    public List<Furniture> getAllItems() {
        return DataHolder.getInstance().getFurnitures();
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of FurnitureItem; null if not found.
     * */
    @Override
    public Furniture getItemById(int id) {
        for (Furniture furniture : DataHolder.getInstance().getFurnitures()) {
            if(furniture.getId() == id){
                return furniture;
            }
        }
        return null;
    }

    /**
     * Adds a new FurnitureItem to the inventory
     * @param item an FurnitureItem to be added to the inventory
     * @return true, if added successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean addItem(Furniture item) {
        return DataHolder.getInstance().getFurnitures().add(item);
    }


    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean removeItem(int id) {
        for (Furniture furniture : DataHolder.getInstance().getFurnitures()) {
            if(furniture.getId() == id){
                return DataHolder.getInstance().getFurnitures().remove(furniture);
            }
        }
        return false;
    }
}
