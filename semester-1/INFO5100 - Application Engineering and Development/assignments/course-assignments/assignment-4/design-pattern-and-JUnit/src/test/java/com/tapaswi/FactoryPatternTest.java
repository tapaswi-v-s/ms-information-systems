package com.tapaswi;

import com.tapaswi.data.DataHolder;
import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.InventoryType;
import com.tapaswi.models.Shoe;
import org.junit.jupiter.api.Test;
import com.tapaswi.shop.Inventory;
import com.tapaswi.shop.Shop;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryPatternTest {
    Shop shop = new Shop();
    Inventory<ElectronicItem> electronicsInventory = shop.getInventory(InventoryType.ELECTRONICS);
    Inventory<Furniture> furnitureInventory = shop.getInventory(InventoryType.FURNITURE);
    Inventory<Shoe> shoesInventory = shop.getInventory(InventoryType.SHOES);

    void populate(){
                electronicsInventory.addItem(new ElectronicItem(1, "iPhone 15", 1000));
        electronicsInventory.addItem(new ElectronicItem(2, "Samsung Galaxy", 800));
        electronicsInventory.addItem(new ElectronicItem(3, "Sony 4K TV", 3000));
        electronicsInventory.addItem(new ElectronicItem(4, "Samsung 8K OLED TV", 3000));

        shoesInventory.addItem(new Shoe(1, "Nike", 500));
        shoesInventory.addItem(new Shoe(2, "Adidas", 400));
        shoesInventory.addItem(new Shoe(3, "Asics", 600));
        shoesInventory.addItem(new Shoe(4, "Reebok", 100));

        furnitureInventory.addItem(new Furniture(1, "King Size Bed", 750));
        furnitureInventory.addItem(new Furniture(2, "Dinning Table", 330));
        furnitureInventory.addItem(new Furniture(3, "Closet", 150));
        furnitureInventory.addItem(new Furniture(4, "TV - Cabinet", 50));
    }

    @Test
    public void testSize(){
        populate();
        assertAll(() -> assertEquals(4, electronicsInventory.getAllItems().size()),
                () -> assertEquals(4, furnitureInventory.getAllItems().size()),
                () -> assertEquals(4, shoesInventory.getAllItems().size()));
    }

    void delete(){
        furnitureInventory.removeItem(1);
        furnitureInventory.removeItem(2);

        shoesInventory.removeItem(1);

        electronicsInventory.removeItem(1);
        electronicsInventory.removeItem(2);
        electronicsInventory.removeItem(3);
    }

    @Test
    public void testSizeAfterDeletion() {
        delete();
        assertAll(() -> assertEquals(1, electronicsInventory.getAllItems().size()),
                () -> assertEquals(2, furnitureInventory.getAllItems().size()),
                () -> assertEquals(3, shoesInventory.getAllItems().size()));
    }

    @Test
    public void testObjectIds(){
        assertAll(() -> assertEquals(4, electronicsInventory.getItemById(4).getId()),
                () -> assertEquals(3, furnitureInventory.getItemById(3).getId()),
                () -> assertEquals(2, shoesInventory.getItemById(2).getId()));
    }

    void removeAll(){
        DataHolder dataHolder = DataHolder.getInstance();
        dataHolder.getFurnitures().clear();
        dataHolder.getElectronics().clear();
        dataHolder.getShoes().clear();
    }

    @Test
    public void testIfEverythingIsEmpty(){
        removeAll();
        assertAll(() -> assertEquals(0, electronicsInventory.getAllItems().size()),
                () -> assertEquals(0, furnitureInventory.getAllItems().size()),
                () -> assertEquals(0, shoesInventory.getAllItems().size()));
    }

}
