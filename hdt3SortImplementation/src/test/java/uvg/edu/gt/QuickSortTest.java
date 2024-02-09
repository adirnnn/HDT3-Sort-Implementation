package uvg.edu.gt;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}
