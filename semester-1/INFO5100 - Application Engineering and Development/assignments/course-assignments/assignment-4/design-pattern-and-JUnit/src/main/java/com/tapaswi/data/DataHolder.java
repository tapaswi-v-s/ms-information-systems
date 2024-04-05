package com.tapaswi.data;


import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.Shoe;

import java.util.ArrayList;
import java.util.List;


/**
 * A Singleton class which holds the data of
 * the entire application acting like a database.
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class DataHolder {

    /**
     * A private instance variable which will
     * making sure to create only a single object.
     * */
    private static DataHolder single_instance = null;

    /**
     * To create only a single object throughout the execution.
     * @return instance of this class
     * */
    public static synchronized DataHolder getInstance(){
        if (single_instance == null)
            single_instance = new DataHolder();

        return single_instance;
    }

    /**
     * list to store all the items of Furniture Inventory
     * */
    private final List<Furniture> furnitures = new ArrayList<>();

    /**
     * list to store all the items of Shoes Inventory
     * */
    private final List<Shoe> shoes = new ArrayList<>();

    /**
     * list to store all the items of Electronics Inventory
     * */
    private final List<ElectronicItem> electronics = new ArrayList<>();


    /**
     * getter method to get furniture list
     * @return list of Furniture objects
     * */
    public List<Furniture> getFurnitures() {
        return furnitures;
    }

    /**
     * getter method to get shoe list
     * @return list of Shoe objects
     * */
    public List<Shoe> getShoes() {
        return shoes;
    }

    /**
     * getter method to get electronics list
     * @return list of ElectronicItem objects
     * */
    public List<ElectronicItem> getElectronics() {
        return electronics;
    }


}
