package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem23 {
    //TODO: Given input array: 2 5 3 4 2 2 2 4 8 2 5 3 3 3 7. The following output should be: 2 2 2 2 2 3 3 3 7.
    public static int [] ascendedArray (int [] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        boolean goToRemove = true;
        while (goToRemove) {
            int count = 0;
            for (int i = 0; i<list.size(); i++) {
                if (i<list.size()-1 &&  list.get(i) > list.get(i+1)) {
                    list.remove(i);
                    i--;
                    count++;
                }
            }
            goToRemove = count > 0 ;
        }

        int [] ascendedArray = new int [list.size()];
        for (int j =0; j<ascendedArray.length; j++) {
            ascendedArray[j] = list.get(j);
            System.out.println(ascendedArray[j]);
        }
        return ascendedArray;
    }
}
