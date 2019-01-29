package Java_study.Patterns.Adapter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RoundPegTest {
    private RoundPeg roundPeg = new RoundPeg(5);

    @Test
    public void testGetRadius() throws Exception {
        assertEquals(roundPeg.getRadius(), 5.0);
    }
}
