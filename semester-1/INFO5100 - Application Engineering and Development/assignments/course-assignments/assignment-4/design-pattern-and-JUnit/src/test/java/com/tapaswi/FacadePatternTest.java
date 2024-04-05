package com.tapaswi;

import com.tapaswi.data.DataHolder;
import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.Shoe;
import org.junit.jupiter.api.Test;
import com.tapaswi.shop.Shop;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacadePatternTest{

    Shop shop = new Shop();

    void populate(){
        shop.addElectronicItem(new ElectronicItem(1, "Nokia 6500", 1000));
        shop.addElectronicItem(new ElectronicItem(2, "Oppo s190", 200));
        shop.addElectronicItem(new ElectronicItem(3, "Vivo t478", 1000));
        shop.addElectronicItem(new ElectronicItem(4, "LG Ultra TV", 3000));

        shop.addFurnitureItem(new Furniture(1, "Chairs", 30));
        shop.addFurnitureItem(new Furniture(2, "Recliner Couch", 500));
        shop.addFurnitureItem(new Furniture(3, "Coffee Table", 100));
        shop.addFurnitureItem(new Furniture(4, "Book Shelf", 300));

        shop.addShoeItem(new Shoe(1, "Fila", 120));
        shop.addShoeItem(new Shoe(2, "New Balance", 200));
        shop.addShoeItem(new Shoe(3, "Sketchers", 330));
        shop.addShoeItem(new Shoe(4, "Crocs", 100));
    }

    @Test
    public void testSize(){
        populate();
        assertAll(() -> assertEquals(4, shop.getAllElectronicItems().size()),
                () -> assertEquals(4, shop.getAllFurnitureItems().size()),
                () -> assertEquals(4, shop.getAllShoeItems().size()));
    }

    void delete(){
        shop.deleteFurnitureItem(1);
        shop.deleteFurnitureItem(2);

        shop.deleteShoeItem(1);

        shop.deleteElectronicItem(1);
        shop.deleteElectronicItem(2);
        shop.deleteElectronicItem(3);
    }

    @Test
    public void testSizeAfterDeletion() {
        delete();
        assertAll(() -> assertEquals(1, shop.getAllElectronicItems().size()),
                () -> assertEquals(2, shop.getAllFurnitureItems().size()),
                () -> assertEquals(3, shop.getAllShoeItems().size()));
    }

    @Test
    public void testObjectIds(){
        assertAll(() -> assertEquals(4, shop.getElectronicItemById(4).getId()),
                () -> assertEquals(3, shop.getFurnitureItemById(3).getId()),
                () -> assertEquals(2, shop.getShoeItemById(2).getId()));
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
        assertAll(() -> assertEquals(0, shop.getAllElectronicItems().size()),
                () -> assertEquals(0, shop.getAllFurnitureItems().size()),
                () -> assertEquals(0, shop.getAllShoeItems().size()));
    }
}