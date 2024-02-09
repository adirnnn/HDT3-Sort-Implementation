package uvg.edu.gt;

import static org.junit.Assert.*;
        import junit.framework.TestCase;

public class RadixSortTest extends TestCase {
    public void testSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        RadixSort radixSort = new RadixSort();
        radixSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}
