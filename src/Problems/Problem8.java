package Problems;

public class Problem8 {
    //TODO: is number a prime number?
    public static void primeNumbers(int n) {
        if (n <= 1) {
            System.out.println("Try number bigger than " + n);
            return;
        }
        if (n == 2) {
            System.out.println("It's a prime number");
            return;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("It's not a prime number");
                    return;
                }
            }
            System.out.println("It's a prime number");
        }
    }
}




  /*  try {
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
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
       */

