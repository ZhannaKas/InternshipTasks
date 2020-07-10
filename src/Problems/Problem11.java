package Problems;

import java.util.Arrays;

public class Problem11 {
 public static void oneArray (int [] array1, int [] array2, int [] array3) {
     int saze = array1.length + array2.length + array3.length;
     int [] concatArray = new int[saze];


     for (int i = 0; i<saze; i++) {

         for (int j = 0; j<array1.length; j++) {
             concatArray[i] = array1[j];
             i++;
         }

         for (int j = 0; j<array2.length; j++) {
             concatArray[i] = array2[j];
             i++;
         }
         for (int j = 0; j<array3.length; j++) {
             concatArray[i] = array3[j];
             i++;
         }

     }
        Arrays.sort(concatArray);
        for (int x: concatArray) {
        System.out.print(x + " ");
     }
 }
}
