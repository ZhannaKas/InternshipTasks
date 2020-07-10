package Problems;

import java.util.ArrayList;
import java.util.Hashtable;

public class Problem9 {

    //TODO: can't finish this task
    public static int friendlyOrNot (int number) {
        int sum = 0;
        Hashtable <Integer, Double> pairs = new Hashtable<>();
        if (number<6) {
            System.out.print("try another number");
            return 0;
        }
        else {
            for (int i = 6; i<=number; i++) {
                for (int j = 1; j<=i; j++) {
                    if (i%j == 0) {
                        sum += j;
                        }
                    }
                    double remainder = sum/i;
                    pairs.put(i,remainder);
                    sum = 0;
                  }
            for (double i = 0; i<pairs.size(); i++) {
                for (double j = 1; j< pairs.size(); j++) {
                    if (pairs.containsValue(i) != pairs.containsValue(j)) {

                    }


                }

            }
                }
       return 0;
        }
}

