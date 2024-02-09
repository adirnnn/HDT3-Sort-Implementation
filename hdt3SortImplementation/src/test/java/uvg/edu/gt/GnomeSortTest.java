package uvg.edu.gt;

import static org.junit.Assert.*;
import junit.framework.TestCase;

public class GnomeSortTest extends TestCase {
    public void testSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}