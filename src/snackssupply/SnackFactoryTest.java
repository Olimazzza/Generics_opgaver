package snackssupply;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import queue.SnackQueue;
import snacks.Limb;
import snacks.Pez;
import snacks.Smartie;
import static org.junit.jupiter.api.Assertions.*;

public class SnackFactoryTest {

    @Test
    public void testGetNewSnacksWithLimb() {
        int capacity = 5;
        Limb sampleLimb = new Limb(Limb.Types.Finger);
        Limb[] limbContainer = SnackFactory.getNewSnacks(new Limb[capacity], sampleLimb);

        assertNotNull(limbContainer);
        assertEquals(capacity, limbContainer.length);

        for (Limb limb : limbContainer) {
            assertNotNull(limb);
            assertEquals(sampleLimb.getType(), limb.getType());
        }
    }

    @Test
    public void testGetNewSnacksWithPez() {
        int capacity = 5;
        Pez samplePez = new Pez(Pez.Flavors.Cherry);
        Pez[] pezContainer = SnackFactory.getNewSnacks(new Pez[capacity], samplePez);

        assertNotNull(pezContainer);
        assertEquals(capacity, pezContainer.length);

        for (Pez pez : pezContainer) {
            assertNotNull(pez);
            assertEquals(samplePez.getFlavor(), pez.getFlavor());
        }
    }
}
