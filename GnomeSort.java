public class GnomeSort implements ISortAlgorithm {

    public void sort(int[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index] >= array[index - 1]) {
                index++;
            } else {
                swap(array, index, index - 1);
                index--;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
