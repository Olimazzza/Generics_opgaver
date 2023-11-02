package snackssupply;

import java.util.ArrayList;
import java.util.Collections;

public class SnackBar
{
    // TODO: Implement sortSnacks(E[] snackContainer)

    public <T extends Comparable<T>> void sortSnacks(ArrayList<T> snacks) {

        Collections.sort(snacks);
    }
}