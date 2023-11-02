package snackssupply;

import java.util.ArrayList;
import java.util.List;
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

public class SnackBarTest {

    @Test
    public void testSortSnacksWithLimb() {
        // Arrange
        SnackBar snackBar = new SnackBar();
        ArrayList<Limb> limbs = new ArrayList<>();

        // Act
        limbs.add(new Limb(Limb.Types.Finger));
        limbs.add(new Limb(Limb.Types.Hand));
        limbs.add(new Limb(Limb.Types.Knee));
        limbs.add(new Limb(Limb.Types.Foot));

        snackBar.sortSnacks(limbs);

        for(Limb limb : limbs) {
            System.out.println(limb.getType());
        }
        // Assert
        for (int i = 1; i < limbs.size(); i++) {
            // Check that each limb in the list is greater than or equal to the previous one.
            assertTrue(limbs.get(i).compareTo(limbs.get(i - 1)) >= 0);
        }
    }

    @Test
    public void testSortSnacksWithPez() {
        // Arrange
        SnackBar snackBar = new SnackBar();
        ArrayList<Pez> pezList = new ArrayList<>();

        // Act
        pezList.add(new Pez(Pez.Flavors.Cherry));
        pezList.add(new Pez(Pez.Flavors.Banana));
        pezList.add(new Pez(Pez.Flavors.Grape));
        pezList.add(new Pez(Pez.Flavors.Orange));

        snackBar.sortSnacks(pezList);

        for(Pez p : pezList) {
            System.out.println(p.getFlavor());
        }

        // Assert
        for (int i = 1; i < pezList.size(); i++) {
            // Check that each Pez candy in the list is greater than or equal to the previous one.
            assertTrue(pezList.get(i).compareTo(pezList.get(i - 1)) >= 0);
        }
    }
}
