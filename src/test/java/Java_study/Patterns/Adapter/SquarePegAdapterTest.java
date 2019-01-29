package Java_study.Patterns.Adapter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SquarePegAdapterTest {
    private SquarePeg squarePeg = new SquarePeg(Math.sqrt(2.0));
    private SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

    @Test
    public void testGetRadius() throws Exception {
        assertEquals(squarePegAdapter.getRadius(), 1.0);
    }
}
