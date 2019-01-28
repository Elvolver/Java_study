package Java_study.Adapter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoundHoleTest {
    private RoundHole roundHole = new RoundHole(5);
    private RoundPeg roundPegSmall = new RoundPeg(4);
    private RoundPeg roundPegLarge = new RoundPeg(6);

    @Test
    public void testGetRadius() throws Exception {
        assertEquals(roundHole.getRadius(), 5.0);
    }
    @Test
    public void testFits() throws Exception {
        assertTrue(roundHole.fits(roundPegSmall));
        assertFalse(roundHole.fits(roundPegLarge));
    }
}
