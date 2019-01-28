package Java_study.Adapter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SquarePegTest {
    private SquarePeg squarePeg = new SquarePeg(5.0);

    @Test
    public void testGetWidth() throws Exception {
        assertEquals(squarePeg.getWidth(), 5.0);
    }

    @Test
    public void testGetArea() throws Exception {
        assertEquals(squarePeg.getArea(), 25.0);
    }
}
