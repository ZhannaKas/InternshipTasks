package Problems;

public class Problem8 {
    public static void primeNumbers (int n) {
        int k = n;
        if (n<=1) {
            System.out.println("try another number");
        }
        else {
            for (int i = k; i>=2; i--) {
                for(int j = 2; j<=n; j++) {
                    if (n%j == 0 && n != j) {
                        n--;
                        break;
                    }
                    if (j == n) {
                        System.out.println(n);
                        n--;
                    }
                }
            }

        }

    }
}

