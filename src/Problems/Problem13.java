package Problems;

import java.util.List;

public class Problem13 {
    public static void rotate (int number, List array) {
        int size = array.size();
        while (number>0) {
            int i = 0;
            array.add(size,array.get(i));
            array.remove(i);
            i++; number--;
        }
    }
}
