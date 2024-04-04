package shop;

import data.DataHolder;
import models.ElectronicItem;

import java.util.List;

/**
 * An Inventory for electronic items of the shop of type ElectronicItem
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class ElectronicsInventory implements Inventory<ElectronicItem> {

    /**
     * A private instance variable which will
     * making sure to create only a single object.
     * */
    private static ElectronicsInventory single_instance = null;

    /**
     * To create only a single object throughout the execution.
     * @return instance of this class
     * */
    public static synchronized ElectronicsInventory getInstance(){
        if (single_instance == null)
            single_instance = new ElectronicsInventory();

        return single_instance;
    }

    /**
     * Fetches all the items in this inventory
     * @return All the Electronic items in this inventory
     * */
    @Override
    public List<ElectronicItem> getAllItems() {
        return DataHolder.getInstance().getElectronics();
    }

    /**
     * Fetches a single item by id from the inventory
     * @param id ID of the item to be searched
     * @return a single object of ElectronicsItem; null if not found.
     * */
    @Override
    public ElectronicItem getItemById(int id) {
        for (ElectronicItem ElectronicItem : DataHolder.getInstance().getElectronics()) {
            if(ElectronicItem.getId() == id){
                return ElectronicItem;
            }
        }
        return null;
    }

    /**
     * Adds a new ElectronicItem to the inventory
     * @param item an ElectronicItem to be added to the inventory
     * @return true, if added successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean addItem(ElectronicItem item) {
        return DataHolder.getInstance().getElectronics().add(item);
    }

    /**
     * Removes an item from the inventory
     * @param id an ID of the item to be removed from the inventory
     * @return true, if removed successfully; false, if not.
     * @throws NullPointerException if the specified element is null
     * */
    @Override
    public boolean removeItem(int id) {
        for (ElectronicItem ElectronicItem : DataHolder.getInstance().getElectronics()) {
            if(ElectronicItem.getId() == id){
                return DataHolder.getInstance().getElectronics().remove(ElectronicItem);
            }
        }
        return false;
    }
}
