package uvg.edu.gt;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RadixSortTest {

    @Test
    public void testRadixSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        RadixSort radixSort = new RadixSort();
        radixSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}
