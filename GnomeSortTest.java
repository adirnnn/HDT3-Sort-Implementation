import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class GnomeSortTest {

    @Test
    public void testGnomeSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.sort(array);
        int[] expected = {1, 2, 5, 5, 6, 9};
        assertArrayEquals(expected, array);
    }
}
