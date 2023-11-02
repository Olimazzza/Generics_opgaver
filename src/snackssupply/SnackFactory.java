package snackssupply;

import java.util.Random;

public class SnackFactory {
    // TODO: Implement getNewSnacks(E[] snackContainer)

    public static <E> E[] getNewSnacks(E[] snackContainer, E valgtSnack) {

        for (int i = 0; i < snackContainer.length; i++) {
            // Here, we assume that snacks are created as copies of the sample snack.
            snackContainer[i] = valgtSnack;
        }

        return snackContainer;
    }
}