package com.tapaswi.shop;
/**
 *
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * @since version 1.0
 * */

import java.util.List;

/**
 * A generic abstract class of all types of the inventory.
 * */
public interface Inventory<E> {
    /**
     * A method to retrieve all the items
     * @return List of all the items
    * */
    public List<E> getAllItems();

    /**
     * A method to retrieve an item based on ID.
     * @return A single object if found, null if not found.
     * @param id id of an object.
     * */
    public E getItemById(int id);


    /**
     * A method to add an item in the inventory.
     * @return true if addition is successful, false if unsuccessful.
     * @param item the item that needs to be added.
     * */
    public boolean addItem(E item);


    /**
     * A method to delete an item by ID from the inventory.
     * @return true if deletion is successful, false if unsuccessful.
     * @param id ID of the item that needs to be deleted.
     * */
    public boolean removeItem(int id);
}
