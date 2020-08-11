package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem11 {
    //TODO: merge arrays and sort in ascending order

    public static int [] merged (int [] array1, int [] array2,  int [] array3) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:array1) {
            list.add(i);
        }
        for (int i:array2) {
            list.add(i);
        }
        for (int i:array3) {
            list.add(i);
        }
        Collections.sort(list);
        int [] merged = new int[list.size()];
        for (int i =0; i<list.size(); i++) {
            merged[i] = list.get(i);
        }
        return merged;

     /*  int oneLength = array1.length;
       int secondLength = array2.length;
       int thirdLength = array3.length;

       int [] merged = new int [oneLength+secondLength+thirdLength];
       System.arraycopy(array1, 0, merged, 0, oneLength);
       System.arraycopy(array2, 0, merged, oneLength, secondLength);
       System.arraycopy(array3, 0, merged, secondLength+oneLength, thirdLength);
       Arrays.sort(merged);
       return merged; */

    }
}
