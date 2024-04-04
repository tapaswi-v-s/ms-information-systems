package models;

/**
 * Class for Electronics Type of Inventory
 * @author Tapaswi Satyapanthi
 * @version 1.0
 * */
public class ElectronicItem {

    /**
     * Identification number of the electronic item
     * */
    private final int id;

    /**
     * Name of the electronic item
     * */
    private final String name;

    /**
     * Price associated with this electronic item
     * */
    private final double price;

    /**
     * A parameterised constructor to initialize object with values
     * @param id id of this item
     * @param name name of this product
     * @param price price of this item
     * */
    public ElectronicItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
    * A getter method for id
    * @return id of the item
    * */
    public int getId() {
        return id;
    }

    /**
     * Method to print the details of the object
     * @return String representation of this class
     * */
    @Override
    public String toString() {
        return "ElectronicItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price= $" + price +
                '}';
    }
}
