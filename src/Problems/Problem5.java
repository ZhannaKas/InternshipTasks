package Problems;

public class Problem5 {
    //TODO: what the sum of odd numbers is and what amount of even numbers is
    public static void oddEven (int [] numbers) {
        int oddSum = 0;
        int amountOfEven = 0;
        var list = new java.util.ArrayList<Integer>();
        for (int i = 0; i<numbers.length; i++) {
            oddSum += numbers[i] % 2 == 0 ? numbers[i] : 0;
            amountOfEven += numbers[i] % 2 !=0 ? 1 : 0;
        }
        System.out.println(oddSum);
        System.out.println(amountOfEven);
    }
}

  /*  public static void oddEven (int [] numbers) {
        int oddSum = 0;
        int amountOfEven = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                oddSum += numbers[i];
            }
            else {
                amountOfEven++;
            }
        }
        System.out.println(oddSum);
        System.out.println(amountOfEven);
    }
}
   */
