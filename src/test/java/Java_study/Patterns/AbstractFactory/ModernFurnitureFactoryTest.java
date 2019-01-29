package Java_study.Patterns.AbstractFactory;

import Java_study.Patterns.AbstractFactory.Furniture.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModernFurnitureFactoryTest {

    ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();

    @Test
    public void testCreateChair() throws Exception {
        Chair modernChair = new ModernChair();
        assertTrue(modernChair.equals(modernFurnitureFactory.createChair()));
    }
    @Test
    public void testCreateCofeeTable() throws Exception {
        CoffeeTable modernCofeeTable = new ModernCoffeeTable();
        assertTrue(modernCofeeTable.equals(modernFurnitureFactory.createCofeeTable()));
    }
}
