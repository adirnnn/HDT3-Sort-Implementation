package uvg.edu.gt;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class SortingHelper {
    public final static int MAX_VALUE_INT_ELEMENTS = 100_000_000;

    public static int[] generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(MAX_VALUE_INT_ELEMENTS));
        }
       return toIntArray(list);
    }

    private static int[] toIntArray(List<Integer> list) {
    int[] ret = new int[list.size()];
    for(int i = 0; i < ret.length; i++)
        ret[i] = list.get(i);
    return ret;
    }
}
