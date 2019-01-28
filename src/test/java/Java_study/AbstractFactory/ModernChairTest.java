package Java_study.AbstractFactory;

import Java_study.Furniture.Chair;
import Java_study.Furniture.ModernChair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ModernChairTest {

    Chair chair = new ModernChair();
    @Test
    public void testIsSoft() throws Exception {
        assertTrue(false == chair.isSoft());
    }
    @Test
    public void testHasArmrest() throws Exception {
        assertTrue(false == chair.hasArmrest());
    }
    @Test
    public void testGetComfortLevel() throws Exception {
        assertTrue(3 == chair.getComfortLevel());
    }
    @Test
    public void testGetMaterial() throws Exception {
        assertEquals(chair.getMaterial(), "Still and plastic");
    }
}
