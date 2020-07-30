package Problems;

public class Problem4 {
    //TODO: BubbleSort of an array
    public static void bubbleSort (int [] array) {
        int variable = 0;
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array.length-1; j++) {
                if (array[j]>array[j+1]) {
                    variable = array [j];
                    array[j] = array[j+1];
                    array[j+1] = variable;
                }

                }
            }
        }
}

