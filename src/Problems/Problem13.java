package Problems;

import java.util.List;

public class Problem13 {
    //TODO: rotate list by k elements ( [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2])
    public static void rotate (int number, List array) {
        int size = array.size();
        while (number>0 && number<array.size()) {
            int i = 0;
            array.add(size,array.get(i));
            array.remove(i);
            i++; number--;
        }
    }
}
