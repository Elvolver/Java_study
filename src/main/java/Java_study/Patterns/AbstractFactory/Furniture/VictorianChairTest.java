package Java_study.Patterns.AbstractFactory.Furniture;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VictorianChairTest {
    private VictorianChair victorianChair = new VictorianChair();
    private VictorianChair victorianChair2 = new VictorianChair();

    @Test
    public void testIsSoft() throws Exception {
        assertTrue(victorianChair.isSoft());
    }

    @Test
    public void testHasArmrest() throws Exception {
        assertTrue(victorianChair.hasArmrest());
    }

    @Test
    public void testGetComfortLevel() throws Exception {
        assertTrue(victorianChair.getComfortLevel().equals(5));
    }

    @Test
    public void testGetMaterial() throws Exception {
        assertTrue(victorianChair.getMaterial().equals("Wood and skin"));
    }

    @Test
    public void testEquals() throws Exception {
        assertTrue(victorianChair.equals(victorianChair2));
    }
}
