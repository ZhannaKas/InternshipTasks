package Problems;

public class Problem5 {
    public static void oddEven (int [] numbers) {
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
