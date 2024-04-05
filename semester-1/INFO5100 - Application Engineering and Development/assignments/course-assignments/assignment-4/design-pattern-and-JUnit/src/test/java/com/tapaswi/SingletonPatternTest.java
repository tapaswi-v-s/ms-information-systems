package com.tapaswi;

import com.tapaswi.data.DataHolder;
import com.tapaswi.models.ElectronicItem;
import com.tapaswi.models.Furniture;
import com.tapaswi.models.Shoe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonPatternTest {
    DataHolder dataHolder1 = DataHolder.getInstance();
    void populateLists(){

        dataHolder1.getElectronics().add(new ElectronicItem(1, "Nokia 6500", 1000));
        dataHolder1.getElectronics().add(new ElectronicItem(2, "Oppo s190", 200));
        dataHolder1.getElectronics().add(new ElectronicItem(3, "Vivo t478", 1000));
        dataHolder1.getElectronics().add(new ElectronicItem(4, "LG Ultra TV", 3000));

        dataHolder1.getFurnitures().add(new Furniture(1, "Chairs", 30));
        dataHolder1.getFurnitures().add(new Furniture(2, "Recliner Couch", 500));
        dataHolder1.getFurnitures().add(new Furniture(3, "Coffee Table", 100));
        dataHolder1.getFurnitures().add(new Furniture(4, "Book Shelf", 300));
        
        dataHolder1.getShoes().add(new Shoe(1, "Fila", 120));
        dataHolder1.getShoes().add(new Shoe(2, "New Balance", 200));
        dataHolder1.getShoes().add(new Shoe(3, "Sketchers", 330));
        dataHolder1.getShoes().add(new Shoe(4, "Crocs", 100));
    }

    @Test
    void testSize(){
        populateLists();
        // Creating new instance
        DataHolder dataHolder2 = DataHolder.getInstance();
        assertAll(() -> assertEquals(4, dataHolder2.getElectronics().size()),
                () -> assertEquals(4, dataHolder2.getFurnitures().size()),
                () -> assertEquals(4, dataHolder2.getShoes().size()));
    }

    void delete(){
        DataHolder dataHolder3 = DataHolder.getInstance();
        dataHolder3.getElectronics().remove(0);
        dataHolder3.getElectronics().remove(0);

        dataHolder3.getFurnitures().remove(0);
        dataHolder3.getFurnitures().remove(0);
        dataHolder3.getFurnitures().remove(0);

        dataHolder3.getShoes().remove(0);

    }

    @Test
    void testRemovalSize(){
        delete();
        DataHolder dataHolder4 = DataHolder.getInstance();
        assertAll(() -> assertEquals(2, dataHolder4.getElectronics().size()),
                () -> assertEquals(1, dataHolder4.getFurnitures().size()),
                () -> assertEquals(3, dataHolder4.getShoes().size()));
    }
}
