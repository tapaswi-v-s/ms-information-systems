package com.tapaswi.shop;


import com.tapaswi.data.DataHolder;
import com.tapaswi.models.Shoe;

import java.util.List;

/**
 * An Inventory for Shoes of the shop of type Shoe
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class ShoeInventory implements Inventory<Shoe>{

    /**
     * A private instance variable which will
     * making sure to create only a single object.
     * */
    private static ShoeInventory single_instance = null;

    /**
     * To create only a single object throughout the execution.
     * @return instance of this class
     * */
    public static synchronized ShoeInventory getInstance(){
        if (single_instance == null)
            single_instance = new ShoeInventory();

        return single_instance;
    }

    /**
     * Fetches all the items in this inventory
     * @return All the Shoes in this inventory
     * */
    @Override
    public List<Shoe> getAllItems() {
        return DataHolder.getInstance().getShoes();
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of Shoe; null if not found.
     * */
    @Override
    public Shoe getItemById(int id) {
        for (Shoe Shoe : DataHolder.getInstance().getShoes()) {
            if(Shoe.getId() == id){
                return Shoe;
            }
        }
        return null;
    }

    /**
     * Adds a new Shoe to the inventory
     * @param item A Shoe to be added to the inventory
     * @return true, if added successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean addItem(Shoe item) {
        return DataHolder.getInstance().getShoes().add(item);
    }

    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean removeItem(int id) {
        for (Shoe Shoe : DataHolder.getInstance().getShoes()) {
            if(Shoe.getId() == id){
                return DataHolder.getInstance().getShoes().remove(Shoe);
            }
        }
        return false;
    }
}
