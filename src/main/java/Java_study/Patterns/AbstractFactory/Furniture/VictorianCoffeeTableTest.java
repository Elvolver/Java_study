package Java_study.Patterns.AbstractFactory.Furniture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VictorianCoffeeTableTest {
    private VictorianCoffeeTable victorianCoffeeTable = new VictorianCoffeeTable();
    private VictorianCoffeeTable victorianCoffeeTable2 = new VictorianCoffeeTable();

    @Test
    public void testGetComfortLevel() throws Exception {
        assertTrue(victorianCoffeeTable.getComfortLevel().equals(4));
    }

    @Test
    public void testGetMaterial() throws Exception {
        assertTrue(victorianCoffeeTable.getMaterial().equals("Wood and skin"));
    }

    @Test
    public void testEquals() throws Exception {
        assertTrue(victorianCoffeeTable.equals(victorianCoffeeTable2));
    }
}
