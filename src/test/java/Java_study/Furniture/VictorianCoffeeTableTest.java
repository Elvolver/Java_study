package Java_study.Furniture;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: volkov
 * Date: 25.01.19
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
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
