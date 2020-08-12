package Problems;

import java.util.ArrayList;
import java.util.Collections;

public class Problem14 {
    //TODO: minimum amount of coins for 33 (10+10+10+3 = 4 coins)

    public static void numbers (int number) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> coins = new ArrayList<Integer>();
        coins.add(1);
        coins.add(3);
        coins.add(10);
        coins.add(25);
        coins.add(50);
        coins.removeIf(elem-> elem > number);

            for (int j = coins.size() - 1; j>=0; j--) {
                int sum = 0;
                int actCount = 0;
                for (int i = coins.size() - 1; i>=0; i--) {
                    if (sum+coins.get(i) <= number) {
                        sum += coins.get(i);
                        actCount++;
                       // System.out.println(coins.get(i));
                        i++;
                    }
                    if (sum == number) {
                        list.add(actCount);
                        coins.remove(coins.size()-1);
                        break;
                    }
                }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
