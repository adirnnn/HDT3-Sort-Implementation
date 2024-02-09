package uvg.edu.gt;

import static org.junit.Assert.*;
        import junit.framework.TestCase;

public class QuickSortTest extends TestCase {
    public void testSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}
