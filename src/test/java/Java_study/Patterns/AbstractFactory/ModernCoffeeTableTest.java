package Java_study.Patterns.AbstractFactory;

import Java_study.Patterns.AbstractFactory.Furniture.CoffeeTable;
import Java_study.Patterns.AbstractFactory.Furniture.ModernCoffeeTable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModernCoffeeTableTest {

    public CoffeeTable coffeeTable = new ModernCoffeeTable();

    @Test
    public void testGetComfortLevel() throws Exception {
        assertTrue(4 == coffeeTable.getComfortLevel());
    }

    @Test
    public void testGetMaterial() throws Exception {
        assertEquals(coffeeTable.getMaterial(), "Still and plastic");
    }
}
